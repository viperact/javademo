package java011_casting.part01.answ;

public class ColorPoint extends CPoint {
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String other() {
		return color;
	}
}
