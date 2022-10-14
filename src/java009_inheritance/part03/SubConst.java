package java009_inheritance.part03;

public class SubConst extends SuperConst {
	int x = 50; // 이부분의 x값을 첫번째로 찾음

	public SubConst() {

		super(10, 40);// 부모요소의 인자값에 맞춰서 호출
		// SuperConst 는 2개의 argument가 존재

	}
}
