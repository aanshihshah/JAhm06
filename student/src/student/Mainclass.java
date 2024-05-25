package student;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Student student1 = new Student();
        Student student2 = new Student("Aanshi");
        
        System.out.println("Student 1: " + student1.getName());
        System.out.println("Student 2: " + student2.getName());

	}

}
