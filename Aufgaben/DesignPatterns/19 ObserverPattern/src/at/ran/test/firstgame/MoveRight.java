package at.ran.test.firstgame;

public class MoveRight implements MoveStrategy{
    public float x, y, speed;

    public MoveRight(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public float getX() {
        return this.x;
    }

    @Override
    public float getY() {
        return this.y;
    }

    @Override
    public void update(int delta) {

        if(this.x <900){
            this.x++;
        }else{
            this.x = 0;
        }
    }
}
