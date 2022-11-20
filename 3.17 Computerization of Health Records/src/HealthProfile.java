import java.time.MonthDay;
import java.time.Year;

public class HealthProfile {
	
	private String firstName, lastName, gender;
	private int dayOfBirth, monthOfBirth, yearOfBirth;
	private double heightInInches, weightInPounds;
	
	public HealthProfile(String firstName, String lastName, String gender, int dayOfBirth, int monthOfBirth,
			int yearOfBirth, double heightInInches, double weightInPounds) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.heightInInches = heightInInches;
		this.weightInPounds = weightInPounds;
	}
	
	public int calculateAge(){
		
		int currentMonth, currentDay, currentYear;
		
		currentDay = MonthDay.now().getDayOfMonth();
		currentMonth = MonthDay.now().getMonthValue();
		currentYear = Year.now().getValue();
		
		if(currentMonth > monthOfBirth) {
			
			return currentYear - yearOfBirth;
		}else if(currentMonth == monthOfBirth) {
			
			if(currentDay >= dayOfBirth) {
				
				return currentYear - yearOfBirth;
			}
		}
		
		return currentYear - 1 - yearOfBirth;
	}
	
	public int calculateMaximumHeartRate() {
		
		return 220 - calculateAge();
	}
	
	public String calculateTargetHeartRate() {
		
		return String.format("%.0f and %.0f bpm", calculateMaximumHeartRate() * 0.5, calculateMaximumHeartRate() * 0.85);
	}
	
	public double calculateBMI() {
		
		return 703 * weightInPounds / (heightInInches * heightInInches); 
	}
	
	public void showHeartsPersonInfo() {
		
		System.out.printf("First Name:\t\t%s\n"
				+ "Last Name:\t\t%s\n"
				+ "Birthday:\t\t%d-%d-%d\n"
				+ "Age:\t\t\t%d\n"
				+ "Height:\t\t\t%.1f inches\n"
				+ "Weight:\t\t\t%.1f lbs\n"
				+ "BMI:\t\t\t%.1f\n"
				+ "Maximum Heart Rate:\t%d bpm\n"
				+ "Target Heart Rate:\t%s\n",
				firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth, calculateAge(), heightInInches, weightInPounds, 
				calculateBMI(), calculateMaximumHeartRate(), calculateTargetHeartRate());	
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public int getMonthOfBirth() {
		return monthOfBirth;
	}

	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public double getHeightInInches() {
		return heightInInches;
	}

	public void setHeightInInches(int heightInInches) {
		this.heightInInches = heightInInches;
	}

	public double getWeightInPounds() {
		return weightInPounds;
	}

	public void setWeightInPounds(int weightInPounds) {
		this.weightInPounds = weightInPounds;
	}
	
	
	
}
