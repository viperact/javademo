package java023_jdbc.part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 *  1. ClassNotFoundException 
 *  해결) JRE System Library에서 ojdbc6.jar파일 확인
 *      Class.forName(): 경로확인
 *      
 * 2. java.sql.SQLException: 
 *     IO예외 상황:  The Network Adapter...
 *                 Listener refused.....  
 *                 
 *     해결) 제어판->관리도구->서비스->OracleServiceXE,
 *            OracleXETNSListener을 다시 시작한다.
 * 
 * java.sql.PreparedStatement
 * 1 반복되는 쿼리문의 수행에 사용한다.
 * 2 미리 정의된 SQL문을 수행하기 때문에 Statement에 비해 속도가 빠르다.
 * 3 위치표시자(placeholder)(?)를 사용하여 쿼리문을 간략하게 작성한다.
 * 
 * 싱글톤 패턴
 *  : 하나의 객체만을 생성해서 사용할 수 있도록 설계한 구조이다.
 *  1 생성자의 접근제어자는 private
 *  2 객체자신을 생성을 한다.
 *  3 생성된 객체를 넘겨줄 수 있는 메소드를 정의한다.
 */

//DAO : Data Access Object(데이터 접근 객체)
//Repository로 사용
//싱글톤패턴 : 하나의 객체만을 생성하여 접근
public class DepartmentsDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	// 싱글톤 패턴
	private static DepartmentsDAO dao = new DepartmentsDAO();

	// 외부에서 접근못하도록 private
	private DepartmentsDAO() {
	}

	public static DepartmentsDAO getInstance() {
		return dao;
	}
	// 싱글톤 패턴

	// Connection 객체 받아오기
	private Connection init() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);
	}// end init()

	private void exit() throws SQLException {
		if (rs != null)
			rs.close();

		if (stmt != null)
			stmt.close();

		if (pstmt != null)
			pstmt.close();

		if (conn != null)
			conn.close();
	}

	public List<DepartmentsDTO> listDepartments() {
		List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();

		try {
			conn = init();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			String sql = "SELECT * FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				DepartmentsDTO dto = new DepartmentsDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);
			}
			conn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {

			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return aList;
	}// end listDepartmests()

	public List<DepartmentsDTO> searchDepartments(String data) {
		List<DepartmentsDTO> aList = new ArrayList<DepartmentsDTO>();

		try {
			conn = init(); //// connection의 객체값 받아오기
			conn.setAutoCommit(false);
			
//			stmt = conn.createStatement();
//			String sql = "SELECT * FROM departments WHERE department_name LIKE '%" + data + "%' ORDER BY department_id";
//			rs = stmt.executeQuery(sql);
			
			//쿼리문을 간결하게 작성가능
			String sql = "SELECT * FROM departments WHERE department_name LIKE ? ORDER BY department_id";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + data + "%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DepartmentsDTO dto = new DepartmentsDTO();
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);
			}
			
			conn.commit();
			
		} catch (ClassNotFoundException | SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.setAutoCommit(true);
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return aList;
	}// end searchDepartments();

}// end class
