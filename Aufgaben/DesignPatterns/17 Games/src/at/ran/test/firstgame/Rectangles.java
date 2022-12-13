package at.ran.test.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangles extends BasicGame {
    private int x; //x vom diagonalen Rechteck
    private int y; //y vom diagonalen Rechteck
    private int rx; //x vom Rechteck, welches die Form eines Rechtecks zeichnet
    private int ry; //y vom Rechteck, welches die Form eines Rechtecks zeichnet
    private int cx;
    private int cy;
    private int circleCounter;
    private int counter;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.rx = 100;
        this.cx = 0;
        this.circleCounter = 0;
        this.counter = 0;

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
//diagonales Dreieck -- start
        this.x++;
        this.y++;


        if (this.x > 800) {
            this.x = 0;
            this.y = 0;

        }
        //diagonales Dreieck -- ende

//Rechteck bewegt sich in der Form eines Rechtecks -- start
        if (this.counter == 0) {
            this.rx++;
            if (this.rx >= 700) {
                this.counter = 1;
            }
        } else if (this.counter == 1) {
            this.ry++;
            if (this.ry >= 500) {
                this.counter = 2;
            }
        } else if (this.counter == 2) {
            this.rx--;
            if (this.rx <= 0) {
                this.counter = 3;
            }
        } else if (this.counter == 3) {
            this.ry--;
            if (this.ry <= 0) {
                this.counter = 0;
            }
        }
//Rechteck bewegt sich in der Form eines Rechtecks -- ende

        if (this.cy < 500 && this.circleCounter == 0) {
            this.cy ++;
            this.circleCounter = 1;
        }else if(this.cy > 500 && this.circleCounter == 1){
            this.cy--;
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 50, 50);
        graphics.drawRect(this.rx, this.ry, 50, 50);
        graphics.drawOval(this.cx, this.cy, 50, 50);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
