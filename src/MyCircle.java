public class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    public MyCircle(){
    }

    public MyCircle(int x, int y, int radius){
        center.setX(x);
        center.setY(y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public MyPoint getCenter(){
        return center;
    }

    public void setCenterX(int x){
        center.setX(x);
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterY(int y){
        center.setY(y);
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterXY(int x, int y){
        center.setXY(x, y);
    }

    public int[] getCenterXY(){
        return center.getXY();
    }

    public String toString(){
        return "MyCircle[radius = " + radius + ", center = (" + center.getX()
                + ", " + center.getY() + ")]";
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getCircumference(){
        return radius * 2;
    }

    public double distance(MyCircle another){
        return center.distance(another.getCenter());
    }
}
