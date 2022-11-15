import java.util.ArrayList;
import java.util.List;

public class Remote {
    private boolean isOn;
    private boolean hasPower;
    private List<Battery> battery;


    public Remote(boolean isOn, boolean hasPower) {
        this.isOn = isOn;
        this.hasPower = hasPower;
        this.battery = new ArrayList<>();
    }

    public void addBattery(Battery battery){
        this.battery.add(battery);
    }

    public boolean isOn() { return isOn;    }

    public void setOn(boolean on) {
        isOn = on;
    }


    public boolean isHasPower() {
        return hasPower;
    }

    public void setHasPower(boolean hasPower) {
        this.hasPower = hasPower;
    }



    public List<Battery> getBattery() {
        return battery;
    }


    public void getStatus(){
        int b1 = battery.get(0).getChargingStatus();
        int b2 = battery.get(1).getChargingStatus();

        int m = (b1+b2)/2;

        System.out.println("Mittelwert: " + m);


    }

    public void turnOn(){

        battery.get(0).setChargingStatus(battery.get(0).chargingStatus -5);
        battery.get(1).setChargingStatus(battery.get(1).chargingStatus -5);
        System.out.println("neuer Wert:" + battery.get(0).chargingStatus);
        System.out.println("neuer Wert:" + battery.get(1).chargingStatus);

    }

    public void turnOff(){
        System.out.println("The remote is now offline");
        hasPower = false;
    }

}


