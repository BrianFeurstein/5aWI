package handy;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim(1, "37489");
        SDCard card = new SDCard(1000);
        Camera cam = new Camera();

        Phone phone = new Phone(sim, cam, card);
        phone.doCall("2828282929");

        phone.takePicture();
        phone.takePicture();

        phone.printAllFiles();
        System.out.println(phone.getFreeSpace());
        phone.takePicture();
        System.out.println(phone.getFreeSpace());
    }
}
