package evenList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenNumbersTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   List<Integer> numbers = new ArrayList<>();
	        numbers.add(3);
	        numbers.add(7);
	        numbers.add(12);
	        numbers.add(5);
	        numbers.add(20);
	        numbers.add(8);
	        numbers.add(11);
	        numbers.add(6);
	        numbers.add(15);
	        numbers.add(4);

	 
	        int evenSum = calculateEvenSum(numbers);

	     
	        System.out.println("List of numbers: " + numbers);
	        System.out.println("Total sum of even numbers: " + evenSum);
	    }


	    private static int calculateEvenSum(List<Integer> numbers) {
	        int sum = 0;
	        Iterator<Integer> iterator = numbers.iterator();
	        while (iterator.hasNext()) {
	            int num = iterator.next();
	            if (num % 2 == 0) {
	                sum += num;
	            }
	        }
	        return sum;

	}

}
