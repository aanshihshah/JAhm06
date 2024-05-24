public class TexClass {
    
    public TexClass(Person p) {
        if (p != null) {
            calculateTax(p);
        } else {
            System.out.println("Invalid person object");
        }
    }
    
    private void calculateTax(Person p) {
        if (p.getAge() > 18) {
            double salary = p.getSalary();
            double tax = 0;

            if (salary > 100000) {
                tax = 0.7 * salary;
            } else if (salary > 50000) {
                tax = 0.5 * salary;
            } else if (salary > 25000) {
                tax = 0.3 * salary;
            } else {
                System.out.println("No tax");
                return;
            }

            System.out.println("The tax is " + tax);
        } else {
            System.out.println("No tax");
        }
    }
    
    // Assume the Person class is defined elsewhere with appropriate getters
}