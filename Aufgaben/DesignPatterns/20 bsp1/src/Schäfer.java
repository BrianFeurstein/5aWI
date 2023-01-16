import StrategyInterface.Wuf1;
import StrategyInterface.WufInterface;

public class Schäfer extends AbstractInterface{


    public Schäfer(String name, String birthday, StrategyInterface.WufInterface WufInterface) {
        super(name, birthday, WufInterface);
    }

    @Override
    public void run() {
        System.out.println("I am a Schäfer und heiße: " + getName());
        WufInterface.bark();
    }
}
