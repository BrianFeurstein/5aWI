public class main {
    public static void main(String[] args) {
        Engine e1 = new Engine(140,Engine.TYPE.DIESEL);
        Car c1 = new Car(e1,"Polo","blue");

        c1.honk();
    }
}
