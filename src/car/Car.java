package car;

public class Car {
    private String brand;
    private String color;
    private double mileage;
    private String number;
    private double petrolQuantity;
    private int placeQuantity;

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getMileage() {
        return mileage/1000;
    }

    public String getNumber() {
        return number;
    }

    public double getPetrolQuantity() {
        return petrolQuantity;
    }

    public int getPlaceQuantity() {
        return placeQuantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPetrolQuantity(float petrolQuantity) {
        this.petrolQuantity = petrolQuantity;
    }

    //user can set quantity of place only from 1 to 8, if he gives less or more, it replaced by min or max
    public void setPlaceQuantity(int place_Quantity) {
        this.placeQuantity = Math.max(Math.min(place_Quantity, 8),1);
    }

    public static void printCar(String brand, String color, String number, double mileage, double petrolQuantity, int place_Quantity){
        System.out.println(brand + ", color " + color + ", number " + number + ", places " + place_Quantity + ", remains " + petrolQuantity +
                "liters of petrol, mileage is " + mileage + "km");
    }


}
