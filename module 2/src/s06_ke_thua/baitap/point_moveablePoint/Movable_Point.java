package s06_ke_thua.baitap.point_moveablePoint;

public class Movable_Point extends point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public Movable_Point(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Movable_Point(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Movable_Point(){}

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setXY(float xSpeed, float ySpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        float[] test = new float[2];
        test[0] = this.xSpeed;
        test[1] = this.ySpeed;
        return test;
    }

    @Override
    public String toString() {
        return "Movable_Point{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
