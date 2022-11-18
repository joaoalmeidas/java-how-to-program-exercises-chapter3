public class CarApplication {

    public static void main(String[] args) throws Exception {
        
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
