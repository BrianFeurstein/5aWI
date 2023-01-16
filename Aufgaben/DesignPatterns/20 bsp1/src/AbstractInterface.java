import StrategyInterface.WufInterface;

import java.time.LocalDate;

public abstract class AbstractInterface implements DogInterface {
    private String name;
    private String birthday;
    protected WufInterface WufInterface;

    public AbstractInterface(String name, String birthday,WufInterface WufInterface) {
        this.name = name;
        this.birthday = birthday;
        this.WufInterface = WufInterface;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }
}
