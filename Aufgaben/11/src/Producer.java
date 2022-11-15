public class Producer {
    private String name;
    private String madeIn;
    private double discount;

    public Producer(String name, String madeIn, double discount) {
        this.name = name;
        this.madeIn = madeIn;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }
}
