public class Car {

    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    public String color;


    public Car() {
    }

    public Car(int fuelConsumption, String brand, String serialNumber) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }





    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");

    }
}
