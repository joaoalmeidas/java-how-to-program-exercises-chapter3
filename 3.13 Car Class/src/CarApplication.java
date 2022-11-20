public class CarApplication {

    public static void main(String[] args) throws Exception {
        
    	/*
    	 * 	3.13 (Car Class) Create a class called Car that includes three instance variables—a model (type
			String), a year (type String), and a price (double). Provide a constructor that initializes the three
			instance variables. Provide a set and a get method for each instance variable. If the price is not positive,
			do not set its value. Write a test application named CarApplication that demonstrates class Car’s capabilities. Create two Car objects and display each object’s price. Then apply a 5% discount on the
			price of the first car and a 7% discount on the price of the second. Display each Car’s price again.
    	 */
    	
        System.out.println("Cars:");
        Car car1 = new Car("Chevrolet Corsa", "1996", 6000);
        Car car2 = new Car("Volkswagen Polo", "2010", 20000);

        System.out.printf("%s\t%s\t%.2f%n", car1.getModel(), car1.getYear(), car1.getPrice());
        System.out.printf("%s\t%s\t%.2f%n", car2.getModel(), car2.getYear(), car2.getPrice());

        car1.setPrice(car1.getPrice() - (car1.getPrice() * 5/100 ));
        car2.setPrice(car2.getPrice() - (car2.getPrice() * 7/100 ));

        System.out.println("Cars with 5 and 7 percent of discount");
        System.out.printf("%s\t%s\t%.2f%n", car1.getModel(), car1.getYear(), car1.getPrice());
        System.out.printf("%s\t%s\t%.2f%n", car2.getModel(), car2.getYear(), car2.getPrice());
    }
}
