package connection_CrudOperation.crudoperation;

public class demoCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personalinfo pi=new Personalinfo();
		
		pi.setId(9);
		pi.setName("Henny");
		pi.setAge(25);
		pi.setEmail("henny@gmail.com");
		CrudOperations cr = new CrudOperations();
		
		CrudOperations.insertData(pi.getId(),pi.getName(),pi.getAge(),pi.getEmail());
		//CrudOperations.deleteData(7);
		CrudOperations.getData();
		CrudOperations.searchData(6);
	}

}
