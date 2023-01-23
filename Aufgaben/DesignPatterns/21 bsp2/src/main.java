public class main {
    public static void main(String[] args) {
        Laderegler l1 = new Laderegler();


        Sonnenkollektor s1 = new Sonnenkollektor(20);
        s1.addObserver(l1);
        s1.produce();
    }
}
