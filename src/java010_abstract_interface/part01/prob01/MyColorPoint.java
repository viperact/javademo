package java010_abstract_interface.part01.prob01;

public class MyColorPoint extends MyPoint{
	
	
	String color;
	
	
	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		
	
	}




	@Override
	protected void reverse() {
		
		
	}



	@Override
	protected void move(int x, int y) {
		
		
	}
	
	@Override
	protected void show() {
		System.out.printf("%d,%d,%s", y, x, color);
	}
	
	

	
}


