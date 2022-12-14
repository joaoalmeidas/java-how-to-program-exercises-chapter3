import java.util.Scanner;

public class HealthApp {

	public static void main(String[] args) {
		/*
		 * 	3.17 (Computerization of Health Records) A health-care issue that has been in the news lately is
			the computerization of health records. This possibility is being approached cautiously because of
			sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
			Computerizing health records could make it easier for patients to share their health profiles and histories among their various health-care professionals. This could improve the quality of health care,
			help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
			save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attributes should include the person’s first name, last name, gender, date of birth (consisting of separate
			attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
			should have a constructor that receives this data. For each attribute, provide set and get methods.
			The class also should include methods that calculate and return the user’s age in years, maximum
			heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
			Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
			class HealthProfile for that person and prints the information from that object—including the person’s first name, last name, gender, date of birth, height and weight—then calculates and prints the
			person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
			the BMI values chart from Exercise 2.33.
		 */
		
		String firstName, lastName, gender;
		int birthDay, birthMonth, birthYear;
		double height, weight;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Health Profile Questions\n");
		
		System.out.printf("Whats your first name? ");
		firstName = input.nextLine();
		
		System.out.printf("Whats your last name? ");
		lastName = input.nextLine();
		
		System.out.printf("Whats your gender? ");
		gender = input.nextLine();
		
		System.out.printf("Whats your birth year? ");
		birthYear = input.nextInt();
		
		System.out.printf("Whats your birth month? ");
		birthMonth = input.nextInt();
		
		System.out.printf("Whats your birth day? ");
		birthDay = input.nextInt();
		
		System.out.printf("Whats your height? ");
		height = input.nextDouble();
		
		System.out.printf("Whats your weight? ");
		weight = input.nextDouble();
		
		HealthProfile hr = new HealthProfile(firstName, lastName, gender, birthDay, birthMonth, birthYear, height, weight);
		
		System.out.println("\nHealth Profile\n");
		hr.showHeartsPersonInfo();
		
		System.out.printf("\n BMI Chart"
				+ "\nUnderweight:	less than 18.5%n"
				+ "Normal:		between 18.5 and 24.9%n"
				+ "Overweight:	between 25 and 29.9%n"
				+ "Obese:		more than 30%n");
	}
}
