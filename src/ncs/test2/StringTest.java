package ncs.test2;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;
		double avg = 0;
		String[] st = str.split(",");
		
		int avg_sum = 0;
		for (int i = 0; i < data.length; i++) { // for~each 문 사용한다.
			data[0] = 1.22;// 배열에 실수 데이터를 넣는다.
			data[1] = 4.12;
			data[2] = 5.93;
			data[3] = 8.71;
			data[4] = 9.34;
			avg_sum += 1;

			sum += data[i];
			avg = sum / avg_sum;
			// 배열 데이터의 합을 구한다.
		}
		System.out.printf("합계 : %.3f\n", sum); // 결과 값을 출력 한다.
		System.out.printf("평균 : %.3f",avg);

	}

}
