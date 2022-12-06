package figures;

public class Main {
    public static void main(String[] args) {
        Figure r1 = new Rectangle("rectangle1", 100, 20);
        Figure c1 = new Circle("circle", 4);
        Figure s1 = new Square("square", 100);

        Figure r2 = new Rectangle("rectangle1", 100, 20);
        Figure c2 = new Circle("circle", 4);
        Figure s2 = new Square("square", 100);

        r1.getArea();
        c1.getArea();
        s1.getArea();

        r2.getArea();
        c2.getArea();
        s2.getArea();
    }
}
