package java016_stream;

/*
 * [순번  이름  평균] 입력
 * 
 * 순번:10
 * 이름:홍길동
 * 평균:9.5
 */
import java.util.Scanner;

public class Java165_stream {

	public static void main(String[] args) {
		System.out.println("[순번  이름  평균]입력:");
		Scanner sc = new Scanner(System.in);
		int num; //순번
		String name; //이름
		double avg; // 평균
		
		
		
		num = sc.nextInt();
		System.out.printf("순번:%d\n", num);
		name = sc.next();
		System.out.printf("이름:%s\n", name);
		avg = sc.nextDouble();
		System.out.printf("평균:%.1f\n", avg);
		
		sc.close();
		
	}
}
