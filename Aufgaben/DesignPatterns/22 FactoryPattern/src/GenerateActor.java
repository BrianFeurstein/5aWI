import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateActor{

    public void generateRandomActor(){
        List<AbstractActor>actors = new ArrayList<>();

        for (int i = 0; i <= 20; i++){
            int min = 1;
            int max = 3;
            Random rand = new Random();
            int randomNum = rand.nextInt((max - min) + 1) + min;


            if(randomNum == 1){
                AbstractActor b1 = new BieneActor("Biene"+i,"Biene"+i);
                actors.add(b1);
                b1.sayHello();

            }
            else if(randomNum == 2){
                AbstractActor a1 = new AmeiseActor("Ameise"+i,"Ameise"+i);
                actors.add(a1);
                a1.sayHello();
            }
            else{
                AbstractActor w1 = new WolfActor("Wolf"+i,"Wolf"+i);
                actors.add(w1);
                w1.sayHello();
            }


        }

        actors.clear();
    }



}
