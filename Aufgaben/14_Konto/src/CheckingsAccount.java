public class CheckingsAccount extends BaseAccount{
    private int limit;

    public CheckingsAccount(double balance, int limit) {
        super(balance);
        this.limit = limit;
    }

    public double withdraw (double amount){
        if((getBalance()-amount)>(limit * -1)){
            System.out.println("Widthdrawn " + amount + " Euros");
            return super.withdraw(amount);
        }else{
            System.out.println("Leider wird das Limit überschritten");
            return 0;
        }
    }
}
