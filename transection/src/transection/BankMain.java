package transection;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac=new Account(700,21,"Aanshi");
		Transaction tc=new Transaction();
		tc.deposit(ac, 20);
		System.out.println(ac);



	}

}
