import StrategyInterface.Wuf1;
import StrategyInterface.Wuf2;
import StrategyInterface.WufInterface;

public class main {
    public static void main(String[] args) {
        WufInterface w1 = new Wuf1();
        Boxer b1 = new Boxer("B1","heute",w1);
        b1.run();

        WufInterface w2 = new Wuf2();
        Schäfer s1 = new Schäfer("schäfer1","morgen",w2);
        s1.run();
    }
}
