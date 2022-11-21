public class WurzelRechner extends WissenschaftlicherRechner{
    private double ux1;

    public WurzelRechner(int x1, int x2, double wx1, double ux1) {
        super(x1, x2, wx1);

        this.ux1 = ux1;
    }

    public void wurzel(){
        double result = Math.sqrt(this.ux1);
        System.out.println("Wurzel: " + result);
    }
}
