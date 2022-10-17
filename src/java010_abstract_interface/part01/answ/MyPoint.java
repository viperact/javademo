package java010_abstract_interface.part01.answ;

public abstract class MyPoint {
	int x;
	int y;
	public MyPoint(int x, int y)  {
		this.x = x; this.y = y; 	
	}
	protected abstract void move(int x, int y); // 새로운 x, y 위치로 이동
	protected abstract void reverse(); // (x, y)에서 (y, x)로 위치 변경
	protected void show() {
		System.out.println(x + "," + y);
	}
}//end class MyPoint
