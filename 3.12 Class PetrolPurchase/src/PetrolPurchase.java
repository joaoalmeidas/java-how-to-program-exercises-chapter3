public class PetrolPurchase{

    private String stationLocation;
    private String typeOfPetrol;
    private int quantityPurchased;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String typeOfPetrol, int quantityPurchased, double pricePerLiter, double percentageDiscount){

        this.stationLocation = stationLocation;
        this.typeOfPetrol = typeOfPetrol;
        this.quantityPurchased = quantityPurchased;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }

    public double getPurchaseAmount(){

        return quantityPurchased * pricePerLiter - (quantityPurchased * pricePerLiter * percentageDiscount/100);
    }

    public String getStationLocation(){

        return stationLocation;
    }

    public void setStationLocation(String stationLocation){

        this.stationLocation = stationLocation;
    }

    public String getTypeOfPetrol(){

        return typeOfPetrol;
    }

    public void getTypeOfPetrol(String typeOfPetrol){

        this.typeOfPetrol = typeOfPetrol;
    }

    public int getQuantityPurchased(){

        return quantityPurchased;
    }

    public void getQuantityPurchased(int quantityPurchased){

        this.quantityPurchased = quantityPurchased;
    }

    public double getPricePerLiter(){

        return pricePerLiter;
    }

    public void getPricePerLiter(double pricePerLiter){

        this.pricePerLiter = pricePerLiter;
    }

    public double getPercentageDiscount(){

        return percentageDiscount;
    }

    public void getPercentageDiscount(double percentageDiscount){

        this.percentageDiscount = percentageDiscount;
    }

}