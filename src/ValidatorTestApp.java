import java.util.Scanner;


public class ValidatorTestApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyValidator val = new MyValidator(sc);
		
		System.out.println("Welcome to the Validation Tester Application");
		int number = val.getIntWithinRange("Enter an integer between -100 and 100: ", -100, 100);
		System.out.println("You entered "+number);
		
		double decimalNumber = val.getDoubleWithinRange("Enter a number between -100.0 and 100.0",-100, 100);		
		System.out.println("You entered " +decimalNumber );
		
		String s = val.getRequiredString("Enter a string: ");
		System.out.println(s);
		
		sc.close();
	}

}
