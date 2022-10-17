public class Car {
    private Engine engine;
    private String brand;
    private String color;
    private int honkCounter = 0;
    private static int myVariable = 7;




    public void honk(){
        System.out.println("Ich bin ein " + this.brand + " und habe die Farbe " + this.color + " und habe " + this.getEngine().getHorsePower());


    }

    public Car(Engine engine, String brand, String color) {
        this.engine = engine;
        this.brand = brand;
        this.color = color;
    }


    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getHonkCounter() {
        return honkCounter;
    }

    public static int getMyVariable() {
        return myVariable;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
