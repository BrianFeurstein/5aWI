import java.util.List;

public class Lampe {
    List<Glühelement> glühelements;


    public void addLightElement(Glühelement glühelement){
        this.glühelements.add(glühelement);

    }

    public void turnAllOn(){
        for(int i = 0;i<glühelements.size();i++){
            glühelements.get(i).turnOn();
        }
    }

    public void getOverallPowerUsage(){
        for(int i = 0;i<glühelements.size();i++){
            glühelements.get(i).turnOn();
        }
    }

    public void printNamesOfLightElements(){
        for(int i = 0; i< glühelements.size();i++){
            System.out.println("Mein Name ist: " + glühelements.get(i).getName());
        }
    }
}
