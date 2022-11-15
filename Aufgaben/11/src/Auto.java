public class Auto {
    private String color;
    private int maxSpeed;
    private double price;
    private int baseConsumption;
    Engine engine;
    Producer producer;

    public Auto(String color, int maxSpeed, double price, int baseConsumption, Engine engine, Producer producer) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.baseConsumption = baseConsumption;
        this.engine = engine;
        this.producer = producer;
    }

    public Producer getProducer() {
        return producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBaseConsumption() {
        return baseConsumption;
    }

    public void setBaseConsumption(int baseConsumption) {
        this.baseConsumption = baseConsumption;
    }

    public Engine getEngine() {
        return engine;
    }
}
