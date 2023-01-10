package at.ran.test.firstgame;

import org.newdawn.slick.*;

public class RectanglesMovesHorizontalVertical extends BasicGame {
    private int x;
    private int y;

    public RectanglesMovesHorizontalVertical(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        this.x++;

        if (this.x > 700) {
            this.x = 700;
            this.y++;

        }
        else if (this.y > 500) {
            this.y = 500;
            this.x--;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 100, 100);
        graphics.drawString("Hello you", 50, 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new RectanglesMovesHorizontalVertical("Rectangles"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
