package java010_abstract_interface.part02.prob02;

public class MotorBicycle implements IBicycle, IMotor {
	// 멤버변수 추가
	int id;
	String brand;

	// IBicycle에 있는 추상 메소드를 구현하세요
	public void prtInfo() {
		// 여기
		System.out.println("ID : " + id);
		System.out.println("Brand : " + brand);
		System.out.println("Frame Size : " + FrameSize_M);
		System.out.println("Motor Size : " + Motor_Size_Large);
	}

	// IMotor에 있는 추상 메소드를 구현하세요
	public void start() {
		// 여기
		System.out.println("## 모터 start!!");
	}

	// IMotor에 있는 추상 메소드를 구현하세요
	public void stop() {
		// 여기
		System.out.println("## 모터 stop!");
	}

}
