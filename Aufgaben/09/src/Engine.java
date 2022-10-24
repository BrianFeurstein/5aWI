public class Engine {
    public enum TYPE {DIESEL,GAS};
    private  int horsePower;
    public TYPE type;
    private int speed;


    public void drive(){
        System.out.println("the motor is running with " + this.speed);
    }

    public Engine(int horsePower,TYPE type, int speed) {
        this.horsePower = horsePower;
        this.type = type;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}
