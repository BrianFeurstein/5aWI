public class Tires {
    private int size;
    public enum TYPE {radial,diagonal};
    public TYPE type;

    public Tires(int size, TYPE type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public TYPE getType() {
        return type;
    }
}
