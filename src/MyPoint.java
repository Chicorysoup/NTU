import java.lang.reflect.Array;

public class MyPoint {
    private int x = 0;
    private int y = 0;
    public MyPoint(){
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int[] getXY(){
        int[] XY = {getX(), getY()};
        return XY;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "( " + x + ", " + y + ")";
    }

    public double distance(int x, int y){
        int dx = this.x-x;
        int dy = this.y-y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public double distance(MyPoint p){
        int dx = this.x-p.getX();
        int dy = this.y-p.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }
}
