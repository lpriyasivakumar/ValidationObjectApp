import java.util.Scanner;

public class MyValidator extends OOValidator {

	public MyValidator(Scanner sc) {
		super(sc);
	}

	public String getRequiredString(String prompt) {
		String reqString = "";
		boolean isValid = false;

		do {
			System.out.println(prompt);
			if (sc.hasNext()) {
				reqString = sc.next();
				isValid = true;
			} else {
				System.out.println("No input found??");
			}
		} while (isValid == false);

		return reqString;

	}
	
	public String getChoiceString(String prompt, String s1, String s2){
		String choiceString = "";
		boolean isValid = false;
		do{
			choiceString = getRequiredString(prompt);
			if(!choiceString.equalsIgnoreCase(s1)&&(!choiceString.equalsIgnoreCase(s2))){
				System.out.println("Error:");
			}else{
				isValid = true;
			}
		}while(isValid == false);
		return choiceString;
	}

}
