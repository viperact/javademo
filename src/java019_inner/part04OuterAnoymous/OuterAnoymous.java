package java019_inner.part04OuterAnoymous;

public class OuterAnoymous {
	private int x;

	InnerAnoymous ta = new InnerAnoymous() {

		@Override
		void prn() {
			System.out.println("prn");

		}
	}; // 세미콜론 반드시 찍기

	public void display() {
		ta.prn();

		new InnerAnoymous() {

			@Override
			void prn() {
				System.out.println("prn2");
			}
		}.prn();
		
	}// end display()

}// end class
