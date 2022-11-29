public class main {
    public static void main(String[] args) {
            CheckingsAccount ca = new CheckingsAccount(3000);
            ca.deposit(100);
            ca.withdraw(50);
            ca.withdraw(10);
            System.out.println(ca.getBalance());

            SavingsAccount sa = new SavingsAccount();
            sa.deposit(1000);
            sa.withdraw(4000);
            System.out.println(sa.getBalance());




    }
}
