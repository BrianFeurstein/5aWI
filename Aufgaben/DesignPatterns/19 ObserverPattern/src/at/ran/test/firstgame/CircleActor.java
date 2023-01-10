package at.ran.test.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor extends AbstractActor{
    public CircleActor(MoveStrategy moveStrategy) {
        super(moveStrategy);
    }

    public void render(Graphics graphics) {
        graphics.drawOval(moveStrategy.getX(), moveStrategy.getY(), 10, 5);
    }

}
