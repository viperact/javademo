package java010_abstract_interface.part01.prob01;

public class MyColorPoint extends MyPoint {
	String color;

	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;

	}

	@Override
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	protected void reverse() {
		int rev = x;
		x = y;
		y = rev;
	}

	public void show() {
		System.out.println(x + ", " + y + ", " + color);
	}

}
