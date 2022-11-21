public class main {
    public static void main(String[] args) {
        Glühelement g1 = new Glühelement("blue","Robin",1,true);
        Lampe l1 = new Lampe();
        l1.addLightElement(g1);
        l1.turnAllOn();
        l1.getOverallPowerUsage();
        l1.printNamesOfLightElements();

    }


}
