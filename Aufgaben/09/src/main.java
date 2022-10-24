public class main {
    public static void main(String[] args) {
        Engine e1 = new Engine(140,Engine.TYPE.DIESEL,100);
        Tank t1 = new Tank(120,150);
        RearMirror r1 = new RearMirror(100,0);
        RearMirror r2 = new RearMirror(90,-20);
        Tires ti1 = new Tires(20,Tires.TYPE.radial);
        Tires ti2 = new Tires(20,Tires.TYPE.radial);
        Tires ti3 = new Tires(20,Tires.TYPE.radial);
        Tires ti4 = new Tires(20,Tires.TYPE.radial);
        Car c1 = new Car(e1,"Polo","blue",t1);
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addTires(ti1);
        c1.addTires(ti2);
        c1.addTires(ti3);
        c1.addTires(ti4);

        System.out.println("Die Position des Spiegels ist: "+c1.getMirrors().get(0).getPosition());
        System.out.println("Das Auto hat Reifen mit der Groesse von " + c1.getTires().get(0).getSize() + "und von dem Typ " + c1.getTires().get(0).getType());

        c1.honk();
        e1.drive();
    }
}
