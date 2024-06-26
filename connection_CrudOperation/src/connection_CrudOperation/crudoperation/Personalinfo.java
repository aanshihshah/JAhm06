package connection_CrudOperation.crudoperation;

public class Personalinfo {
	private Integer id,age;
	private String name,email;
	public Personalinfo() {
		
	}
	@Override
	public String toString() {
		return "Personalinfo [id=" + id + ", age=" + age + ", name=" + name + ", email=" + email + "]";
	}
	public Personalinfo(Integer id, Integer age, String name, String email) {
		
		this.id = id;
		this.age = age;
		this.name = name;
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
