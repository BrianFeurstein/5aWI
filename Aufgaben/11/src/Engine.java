public class Engine {
    public enum TYPE {DIESEL,GAS};
    public TYPE type;
    private int power;

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Engine(TYPE type, int power) {
        this.type = type;
        this.power = power;


    }
}
