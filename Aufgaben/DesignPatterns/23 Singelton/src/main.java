public class main {
    public main() {
    }

    public static void main(String[] args) {
        CounterSingleton cs1 = CounterSingleton.getInstance();
        cs1.increaseCounter();
        System.out.println(cs1.getCounter());
    }
}
