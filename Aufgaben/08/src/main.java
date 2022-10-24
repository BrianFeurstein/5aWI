public class main {
    public static void main(String[] args) {
        Engine e1 = new Engine(140,Engine.TYPE.DIESEL,100);
        Tank t1 = new Tank(120,150);
        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(90,-20);
        Car c1 = new Car(e1,"Polo","blue",t1);
        c1.addMirror(r1);
        c1.addMirror(r2);

        System.out.println("Die Position des Spiegels ist: "+c1.getMirrors().get(0).getPosition());

        c1.honk();
        e1.drive();
    }
}
