public class ClockTest {
    public static void main(String[] args) throws Exception {
    	
    	/*
    	3.13 (Car Class) Create a class called Car that includes three instance variables—a model (type
		String), a year (type String), and a price (double). Provide a constructor that initializes the three
		instance variables. Provide a set and a get method for each instance variable. If the price is not positive,
		do not set its value. Write a test application named CarApplication that demonstrates class Car’s capabilities. Create two Car objects and display each object’s price. Then apply a 5% discount on the
		price of the first car and a 7% discount on the price of the second. Display each Car’s price again.
    	*/
        
        Clock clock1 = new Clock(6,23,45);
        Clock clock2 = new Clock(7,59,12);
        Clock clock3 = new Clock(7,60,60);

        System.out.println("Display time in format hh:mm:ss");
        clock1.displayTime();
        clock2.displayTime();
        clock3.displayTime();
    }
}
