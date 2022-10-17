package java011_casting.part02.answ;

public class Developer extends Employee{
	public Developer() {
		super();
	}

	public Developer(String name, int salary) {
		super(name, salary);
	}

	@Override
	public int getBonus() {
		return 100000;
	}

	@Override
	public String toString() {
		return super.toString()+"\t"+getBonus();
	}
}