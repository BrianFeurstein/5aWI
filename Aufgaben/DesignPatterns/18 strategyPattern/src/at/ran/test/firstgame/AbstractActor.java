package at.ran.test.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class AbstractActor implements Actor{
    protected MoveStrategy moveStrategy;

    public AbstractActor(MoveStrategy moveStrategy) {
        super();
        this.moveStrategy = moveStrategy;
    }

    @Override
    public void render(Graphics graphics) {

    }

    @Override
    public void update(GameContainer gc, int delta) {
        moveStrategy.update(delta);
    }
}
