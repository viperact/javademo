package java023_jdbc.part2;

import java.util.List;
import java.util.Scanner;

/*
 * MVC 패턴 (웹 구현)
 * Model : 데이터 관리
 * View : 결과 화면에 출력
 * Controller : 클라이언트 요청과 응답처리, Model과 View연결
 * 
 */

// View의 역할
public class Java223_jdbc {

	public static void main(String[] args) {
		DepartmentsController dController = new DepartmentsController();
		Scanner sc = new Scanner(System.in);
		System.out.printf("1 전체, 2 검색어");
		int input = Integer.parseInt(sc.nextLine());
		if (input == 1) {
			List<DepartmentsDTO> aList = dController.departmentsAllProcess();
			display(aList);
		} else if (input == 2) {
			System.out.printf("부서 입력: ");
			String line = sc.nextLine();
			List<DepartmentsDTO> aList = dController.departmentsSearchProcess(line);
			display(aList);
			
		}

	}// end main()
	
	private static void display(List<DepartmentsDTO> aList) {
		for (DepartmentsDTO dto : aList) {
			System.out.printf("%d %s %d %d\n",
					dto.getDepartment_id(),
					dto.getDepartment_name(),
					dto.getManager_id(),
					dto.getLocation_id());
		}
	}//end display()

}//end class
