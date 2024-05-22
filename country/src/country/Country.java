package country;

public class Country {
	String cname;
	public Country(String name){
		this.cname=name;
	}
	@Override
	public String toString() {
		return "Country [cname=" + cname + "]";
	}


}
