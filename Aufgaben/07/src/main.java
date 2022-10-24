public class main {
    public static void main(String[] args) {
        Engine e1 = new Engine(140,Engine.TYPE.DIESEL,100);
        Tank t1 = new Tank(120,150);
        Car c1 = new Car(e1,"Polo","blue",t1);

        c1.honk();
        e1.drive();
    }
}
