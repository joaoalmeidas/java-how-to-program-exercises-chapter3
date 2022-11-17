import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Demonstration of PetrolPurchase.");
        PetrolPurchase petrol = new PetrolPurchase("Porto Alegre - RS", "Gas", 10, 2.0, 10.0);

        System.out.printf("Location: %s%nType of Petrol: %s%nLiters: %d%nPrice: %.2f%nDiscount: %.1f%n", 
            petrol.getStationLocation(), petrol.getTypeOfPetrol(), petrol.getQuantityPurchased(), petrol.getPricePerLiter(), petrol.getPercentageDiscount());

        System.out.println("Purchase Amount: "+petrol.getPurchaseAmount());
    }
}
