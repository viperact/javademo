package java009_inheritance.part06;

public class BirdOver extends PetOver {
	
	@Override
	public void move() {
		System.out.println("서브클래스() : 새가 날아갑니다.");
		//새가 움직이는걸 구체적으로 날아간다고 따로 출력하기위해 BirdOver에 Override 적용
	}
	
}
