package lambda;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStringCaseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("Hello", "Aanshi", "Lambda", "Expression");

        
        List<String> uppercaseStrings = strings.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

        
        List<String> lowercaseStrings = strings.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
                                               
                                               

        System.out.println("Uppercase List: " + uppercaseStrings);
        System.out.println("Lowercase List: " + lowercaseStrings);

	}

}
