public class main {
    public static void main(String[] args) {
        BaseAccount b1 = new BaseAccount(5000);

        b1.deposit(1000);

        CheckingsAccount c1 = new CheckingsAccount(b1.getBalance(),4);
        c1.withdraw(3000);
        c1.
    }
}
