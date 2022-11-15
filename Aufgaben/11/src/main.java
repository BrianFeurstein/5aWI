public class main {
    public static void main(String[] args) {
        Engine e1 = new Engine(Engine.TYPE.DIESEL,24);
        Producer p1 = new Producer("BWM","China",23);

        Auto a1 = new Auto("blue",400,25000,2,e1,p1);
        double price = a1.getPrice() - (a1.getPrice() * p1.getDiscount()/100);
        a1.setPrice(price);

        System.out.println("Es handelt sich hierbei um ein " + a1.getProducer().getName() + " mit einem " + e1.getType() + "-Motor");
        System.out.println("Das Auto kostet: " + a1.getPrice());
    }
}
