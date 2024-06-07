package exception;

public class CatchExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            int[] a = new int[5];
            a[5] = 30 / 5;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Execution of try-catch blocks is complete.");
        }

	}

}
