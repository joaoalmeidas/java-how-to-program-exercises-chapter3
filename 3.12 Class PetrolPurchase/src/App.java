import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    	
    	/*
    	 * 	3.12 (Class PetrolPurchase) Create a class called PetrolPurchase to represent information
			about the petrol you purchase. The class should include five pieces of information in the form of
			instance variables—the station’s location (type String), the type of petrol (type String), the quantity (type int) of the purchase in liters, the price per liter (double), and the percentage discount
			(double). Your class should have a constructor that initializes the five instance variables. Provide a
			set and a get method for each instance variable. In addition, provide a method named getPurchaseAmount that calculates the net purchase amount (i.e., multiplies the quantity by the price per liter)
			minus the discount, then returns the net amount you had to pay as a double value. Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase.
    	 */

        System.out.println("Demonstration of PetrolPurchase.");
        PetrolPurchase petrol = new PetrolPurchase("Porto Alegre - RS", "Gas", 10, 2.0, 10.0);

        System.out.printf("Location: %s%nType of Petrol: %s%nLiters: %d%nPrice: %.2f%nDiscount: %.1f%n", 
            petrol.getStationLocation(), petrol.getTypeOfPetrol(), petrol.getQuantityPurchased(), petrol.getPricePerLiter(), petrol.getPercentageDiscount());

        System.out.println("Purchase Amount: "+petrol.getPurchaseAmount());
    }
}
