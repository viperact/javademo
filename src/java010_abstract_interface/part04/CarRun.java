package java010_abstract_interface.part04;

public interface CarRun {
	int carCount = 5; // public static final carCount = 5;
						// interface는 상수값만 지정가능
	// public CarRun() {}

	// static {System.out.println("CarRun");}

	void prn(); // abstract public

	// void display() {}

	// 인터페이스 안에 클래스를 정의하는것 가능
	class Sun {
		public Sun() {
			System.out.println("Sun Constructor");
		}

	}
	

}
