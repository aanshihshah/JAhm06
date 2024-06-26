package lambda;

public class LambdaSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 interface Sum {
	            int add(int a, int b);
	        }

	      
	        Sum sum = (a, b) -> a + b;

	       
	        int result = sum.add(50, 10);
	        System.out.println("The sum  is: " + result);

	}

}
