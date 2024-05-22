import State.State;
import country.Country;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Country c1=new Country("india");
		State s2 =new State("gujrat");
		Person p =new Person(c1,s2,"Aanshi");
		System.out.println(p);


	}

}
