import java.util.Scanner;

public class OOValidator {
	Scanner sc = new Scanner(System.in);

	public OOValidator(Scanner sc) {
		this.sc = sc;
	}

	public int getInt(String prompt) {
		int num = 0;
		boolean isValid = false;

		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				num = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Invalid Number:Try Again");
				sc.nextLine();
			}
		}
		sc.nextLine();
		return num;
	}

	public int getIntWithinRange(String prompt, int min, int max) {
		int num = 0;
		boolean isValid = false;
		num = getInt(prompt);
		while (isValid == false) {
			if (num < min) {
				System.out.printf("Error: number must be greater than %d \n",
						min - 1);
				num = getInt(prompt);
			} else if (num > max) {
				System.out.printf("Error: number must be less than %d \n",
						max + 1);
				num = getInt(prompt);
			} else {
				isValid = true;
			}
		}
		return num;
	}

	public double getDouble(String prompt) {
		double num = 0;
		boolean isValid = false;

		do {
			System.out.println(prompt);
			if (sc.hasNextDouble()) {
				num = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Invalid Double :");
				sc.nextLine();
			}
		} while (isValid == false);
		sc.nextLine();
		return num;
	}

	public double getDoubleWithinRange(String prompt, double min, double max) {
		double num = 0;
		boolean isValid = false;

		do {
			num = getDouble(prompt);
			if (num < min) {
				System.out.printf("Error: number must be greater than %f \n",
						min - 1);
			} else if (num > max) {
				System.out.printf("Error: number must be less than %f \n",
						max + 1);
			} else {
				isValid = true;
			}
		} while (isValid == false);
		return num;
	}

}
