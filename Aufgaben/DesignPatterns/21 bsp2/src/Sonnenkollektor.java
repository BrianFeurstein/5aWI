import java.util.ArrayList;
import java.util.List;

public class Sonnenkollektor {
    private int volltage;
    private List<Observer> observers;
    private Observer observer;

    public Sonnenkollektor(int volltage) {
        this.volltage = volltage;
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void produce() {
        if (this.volltage > 18) {
            for (int i = 0; i < observers.size(); i++) {
                observer.inform();
            }
        }
    }
}
