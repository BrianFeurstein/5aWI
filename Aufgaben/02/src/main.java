import at.ran.objects.Car;

public class main {
    public static void main(String[] args) {
        int a = 7;

        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "1234";
        c1.fuelAmount = 70;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.serialNumber = "789";
        c2.fuelConsumption = 5;
        c2.fuelAmount = 20;

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);





        System.out.println(c1.serialNumber);
        System.out.println(c2.serialNumber);




    }
}
