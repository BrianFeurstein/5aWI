public class WissenschaftlicherRechner extends Grundrechnungsarten{
    private double wx1;


    public WissenschaftlicherRechner(int x1, int x2,double wx1) {
        super(x1, x2);
        this.wx1 = wx1;

    }


    public void sinus(){
        double result = Math.sin(this.wx1);
        System.out.println("sinus: " + result);
    }

    public void cosinus(){
        double result = Math.cos(this.wx1);
        System.out.println("cosinus: " + result);
    }
}
