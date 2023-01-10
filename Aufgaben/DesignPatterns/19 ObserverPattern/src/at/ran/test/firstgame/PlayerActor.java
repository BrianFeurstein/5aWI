package at.ran.test.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

import java.awt.*;

public class PlayerActor implements Actor {
    private float x;
    private float y;
    private float speed;

    public PlayerActor(float x, float y, float speed) {
        super();
        this.x = x;
        this.y = y;
        this.speed = speed;
    }


    @Override
    public void render(org.newdawn.slick.Graphics graphics) {
        graphics.fillRect(this.x,this.y,50,50);
    }

    @Override
    public void update(GameContainer gc, int delta) {
        if(gc.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x -= (float)delta * speed;
            System.out.println("left: x : " + this.x);
        }
        if(gc.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x += delta*speed;
        }
    }
}
