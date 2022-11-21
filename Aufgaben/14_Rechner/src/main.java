public class main {
    public static void main(String[] args) {
        Grundrechnungsarten g1 = new Grundrechnungsarten(10,2);
        g1.addition();
        g1.subtraction();
        g1.multiplication();
        g1.divition();

        WissenschaftlicherRechner w1 = new WissenschaftlicherRechner(g1.getX1(), g1.getX2(),50);
        w1.sinus();
        w1.cosinus();

        WurzelRechner wu1 = new WurzelRechner(g1.getX1(), g1.getX2(), w1.getX1(), 30);
        wu1.wurzel();
    }
}
