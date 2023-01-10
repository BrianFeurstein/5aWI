package at.ran.test.firstgame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class main extends BasicGame {
    private List<Actor> actors;

    public main(String title) {
        super(title);

    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        MoveStrategy ms1 = new MoveRight(0,90,0.4f);


        CircleActor ca1= new CircleActor(ms1);


        this.actors.add(ca1);


    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for(Actor actors : actors){
            actors.update(gc,delta);
        }
    }


    @Override
    public void render(GameContainer gc, Graphics graphics) throws SlickException {
        for(Actor actors : actors){
            actors.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new main("main"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
