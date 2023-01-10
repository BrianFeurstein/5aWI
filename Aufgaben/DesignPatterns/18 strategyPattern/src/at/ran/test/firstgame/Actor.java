package at.ran.test.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Actor {
    void render(Graphics graphics);
    void update(GameContainer gc, int delta);
}
