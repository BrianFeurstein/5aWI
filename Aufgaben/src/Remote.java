import java.util.ArrayList;
import java.util.List;

public class Remote {
    private boolean isOn;
    private int hasPower;
    private List<Battery> battery;


    public Remote(boolean isOn, int hasPower) {
        this.isOn = isOn;
        this.hasPower = hasPower;
        this.battery = new ArrayList<>();
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getHasPower() {
        return hasPower;
    }

    public void setHasPower(int hasPower) {
        this.hasPower = hasPower;
    }

    public List<Battery> getBattery() {
        return battery;
    }

    public void addBattery(Battery battery){
        this.battery.add(battery);
    }

    public void getStatus(){
        System.out.println("Akkustand: " + );
        System.out.println("Mittelwert: " + );


    }

}


