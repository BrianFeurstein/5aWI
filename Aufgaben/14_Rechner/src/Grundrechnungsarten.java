public class Grundrechnungsarten {
    private int x1;
    private int x2;


    public void addition(){
        int result = this.x1 + this.x2;
        System.out.println("Das Ergebnis lautet: " + result);
    }

    public void subtraction(){
        int result = this.x1 - this.x2;
        System.out.println("Das Ergebnis lautet: " + result);
    }

    public void multiplication(){
        int result = this.x1 * this.x2;
        System.out.println("Das Ergebnis lautet: " + result);
    }

    public void divition(){
        int result = this.x1 / this.x2;
        System.out.println("Das Ergebnis lautet: " + result);
    }






    public Grundrechnungsarten(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }
}
