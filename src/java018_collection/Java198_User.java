package java018_collection;

public class Java198_User {

	public static void main(String[] args) {
		Integer[] it = new Integer[] { 1, 5, 3, 2 };
		Average<Integer> av = new Average<Integer>(it);
		System.out.println(av.findAverage());

		Number[] nb = new Number[] { 2, 5.3F, 4.5 };
		Average<Number> ae = new Average<Number>(nb);
		System.out.println(ae.findAverage());

		
		//Bound mismatch: The type String is not a valid substitute for 
		//the bounded parameter <T extends Number> of the type Average<T>
		//제한해둔 값은 Number인데 String으로 호출하려해서 오류발생
		String[] sn = new String[] { "java", "jsp" };
		//Average<String> as = new Average<String>();
		
		
	}// end main()

}// end class
 