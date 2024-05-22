import country.*;
import State.*;
public class Person {
	Country c1;
	State s1;
	String pname;
	public Person(Country c1, State s1, String pname) {
		this.c1 = c1;
		this.s1 = s1;
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Person [c1=" + c1 + ", s1=" + s1 + ", pname=" + pname + "]";
	}
	
}
