import java.util.ArrayList;
import java.util.List;

public class Car {
    private Engine engine;
    private Tank tank;
    private String brand;
    private String color;
    private int honkCounter = 0;
    private static int myVariable = 7;
    private List<RearMirror> mirrors;
    private List<Tires> tires;




    public void honk(){
        System.out.println("Ich bin ein " + this.brand + " und habe die Farbe " + this.color + " und habe " + this.getEngine().getHorsePower() + "PS");
        System.out.println("Die Fuellmenge betraegt aktuell " + this.getTank().getCurrentFillingAmount() + " Liter von " + this.getTank().getMaxFillingAmount() + " Liter");

    }

    public Car(Engine engine, String brand, String color,Tank tank) {
        this.engine = engine;
        this.brand = brand;
        this.color = color;
        this.tank = tank;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }

    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }
    public void addTires(Tires tires){
        this.tires.add(tires);
    }

    public List<Tires> getTires() {
        return tires;
    }

    public void setTires(List<Tires> tires) {
        this.tires = tires;
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
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
