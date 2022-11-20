import java.time.MonthDay;
import java.time.Year;

public class HeartRates {
	
	private String firstName, lastName;
	private int birthDay, birthMonth, birthYear;
	
	public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
	}
	
	public int calculateAge(){
		
		int currentMonth, currentDay, currentYear;
		
		currentDay = MonthDay.now().getDayOfMonth();
		currentMonth = MonthDay.now().getMonthValue();
		currentYear = Year.now().getValue();
		
		if(currentMonth > birthMonth) {
			
			return currentYear - birthYear;
		}else if(currentMonth == birthMonth) {
			
			if(currentDay >= birthDay) {
				
				return currentYear - birthYear;
			}
		}
		
		return currentYear - 1 - birthYear;
	}
	
	public int calculateMaximumHeartRate() {
		
		return 220 - calculateAge();
	}
	
	public String calculateTargetHeartRate() {
		
		return String.format("%.0f and %.0f bpm", calculateMaximumHeartRate() * 0.5, calculateMaximumHeartRate() * 0.85);
	}
	
	public void showHeartsPersonInfo() {
		
		System.out.printf("First Name:\t\t%s\n"
				+ "Last Name:\t\t%s\n"
				+ "Birthday:\t\t%d-%d-%d\n"
				+ "Age:\t\t\t%d\n"
				+ "Maximum Heart Rate:\t%d bpm\n"
				+ "Target Heart Rate:\t%s\n",
				firstName, lastName, birthDay, birthMonth, birthYear, calculateAge(), calculateMaximumHeartRate(), calculateTargetHeartRate());	
	}
	public String getFirstName() {
		
		return firstName;
	}

	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}

	public String getLastName() {
		
		return lastName;
	}

	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}

	public int getBirthDay() {
		
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		
		this.birthDay = birthDay;
	}

	public int getBirthMonth() {
		
		return birthMonth;
	}

	public void setBirthMonth(int birthMonth) {
		
		this.birthMonth = birthMonth;
	}

	public int getBirthYear() {
		
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		
		this.birthYear = birthYear;
	}
	
	
}
