public class Ball {

    private float x, y, z;
    private int radius;
    private float xDelta, yDelta;

    public Ball(float x, float y, float z, int radius, float xDelta, float yDelta){
        this.x = x;
        this.y = y;
        this.z = z;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public Ball(float x, float y, int radius, float xDelta, float yDelta){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX(){
        return x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ(){
        return z;
    }

    public void setZ(int z){
        this.z = z;
    }

    public void setXYZ(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal(){
        xDelta = -1 * xDelta;
    }

    public void reflectVertical(){
        yDelta = -1 * yDelta;
    }

    public String toString() {
        String speed = "(" + xDelta + ", " + yDelta + ")";
        String ball =  "(" + x + ", " + y + ")";
        return "Ball Location" + ball + " Speeds = " + speed;
    }
}
