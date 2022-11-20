import java.util.Scanner;

public class HeartApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName, lastName;
		int birthDay, birthMonth, birthYear;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Target-Heart-Rate Calculator\n");
		
		System.out.printf("Whats your first name? ");
		firstName = input.nextLine();
		
		System.out.printf("Whats your last name? ");
		lastName = input.nextLine();
		
		System.out.printf("Whats your birth year? ");
		birthYear = input.nextInt();
		
		System.out.printf("Whats your birth month? ");
		birthMonth = input.nextInt();
		
		System.out.printf("Whats your birth day? ");
		birthDay = input.nextInt();
		
		HeartRates hr = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear);
		
		System.out.println("\nYour heart rate information\n");
		hr.showHeartsPersonInfo();
		
	}

}
