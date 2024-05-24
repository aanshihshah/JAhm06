import State.State;
import country.Country;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Country c1=new Country("india");
		State s2 =new State("gujrat");
		Person p =new Person("Aanshi",c1,s2,500000,21);
		System.out.println(p);
		TexClass t= new TexClass(p);


	}

}
