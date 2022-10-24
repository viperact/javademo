package java018_collection;

public class Average<T extends Number> {
//넘어오는값, 상속받는값을 숫자로 제한함
	private T[] list;
	
	public Average() {
		
	}
	
	public Average(T[] list) {
		this.list = list;
	}
	
	public double findAverage() {
		double sum = 0.0;
		for(T data : list)
			sum += data.doubleValue();
		
		return sum/list.length;
	}
}
