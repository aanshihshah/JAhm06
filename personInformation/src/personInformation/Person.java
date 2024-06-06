package personInformation;

public class Person {
	
	private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private String uniqueId;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getHeadOfFamily() {
		return headOfFamily;
	}
	public void setHeadOfFamily(String headOfFamily) {
		this.headOfFamily = headOfFamily;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public Person(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily,
			String uniqueId) {
		super();
		this.name = name;
		this.address = address;
		this.telephoneNumber = telephoneNumber;
		this.mobileNumber = mobileNumber;
		this.headOfFamily = headOfFamily;
		this.uniqueId = uniqueId;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", telephoneNumber=" + telephoneNumber
				+ ", mobileNumber=" + mobileNumber + ", headOfFamily=" + headOfFamily + ", uniqueId=" + uniqueId + "]";
	}
	
	
}
