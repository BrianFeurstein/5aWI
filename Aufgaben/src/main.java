public class main {
    public static void main(String[] args) {
        Battery b1 = new Battery(28);
        Battery b2 = new Battery(23);
        Remote r1 = new Remote(true,false);
        r1.addBattery(b1);
        r1.addBattery(b2);
        r1.getStatus();

        if(r1.isHasPower() == false){
            r1.turnOff();
        }else{
            r1.turnOn();
        }

    }
}
