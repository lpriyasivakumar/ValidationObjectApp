import java.util.Scanner;

public class OOValidator {
	Scanner sc;// = new Scanner(System.in);

	public OOValidator(Scanner sc) {
		this.sc = sc;
	}

	public int getInt(String prompt) {
		while (true) {
			System.out.print(prompt);
			if (sc.hasNextInt())
				return sc.nextInt();
			System.out.println("Invalid Number:Try Again");
			sc.nextLine();
		}
	}

	public int getIntWithinRange(String prompt, int min, int max) {
		int num = 0;
		while (true) {
			num = getInt(prompt);
			if (num < min)
				System.out.printf("Error: number must be greater than %d \n",
						min - 1);
			else if (num > max)
				System.out.printf("Error: number must be less than %d \n",
						max + 1);
			else
				return num;
		}

	}

	public double getDouble(String prompt) {
		while (true) {
			System.out.println(prompt);
			if (sc.hasNextDouble()) {
				return sc.nextDouble();
			}
			System.out.println("Invalid Double :");
			sc.nextLine();
		}
	}

	public double getDoubleWithinRange(String prompt, double min, double max) {
		double num = 0;
		while (true) {
			num = getDouble(prompt);
			if (num < min) {
				System.out.printf("Error: number must be greater than %f \n",
						min - 1);
			} else if (num > max) {
				System.out.printf("Error: number must be less than %f \n",
						max + 1);
			}
			return num;
		}
	}

}
