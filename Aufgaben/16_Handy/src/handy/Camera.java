package handy;

public class Camera {
    private int fileNumber = 1;

    public PhoneFile takePicture(){
        PhoneFile file = new PhoneFile("jpg", 100, "pic" + fileNumber);
        fileNumber++;
        return file;
    }
}