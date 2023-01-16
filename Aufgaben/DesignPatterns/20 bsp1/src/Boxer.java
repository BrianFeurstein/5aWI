import StrategyInterface.Wuf1;
import StrategyInterface.WufInterface;

public class Boxer extends AbstractInterface{

    public Boxer(String name, String birthday, StrategyInterface.WufInterface WufInterface) {
        super(name, birthday, WufInterface);
    }

    @Override
    public void run() {
        System.out.println("ich bin ein Boxer und heiße " + getName());

        WufInterface.bark();
    }


}
