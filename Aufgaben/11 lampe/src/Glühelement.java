public class Glühelement {
    private String color;
    private String name;
    private int powerConsumption;
    private boolean status;

    public Glühelement(String color, String name, int powerConsumption, boolean status) {
        this.color = color;
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.status = status;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void turnOn(){
        if( this.isStatus()== true){
            System.out.println("Mein Name ist " + this.getName() + "Ich bin bereits eingeschaltet.");
            this.powerConsumption = this.powerConsumption +5;
            System.out.println("Verbrauch: " +this.powerConsumption);
        }
    }


}
