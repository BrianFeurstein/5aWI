package figures;

public class Square extends Figure{

    private int length;
    public Square(String name, int length){

        super(name);
        this.length = length;
    }

    public void getArea(){
        int a = getLength()^2;
        System.out.println("Fläche vom Quadrat: " + a);
    }

    public int getLength() {
        return length;
    }

}
