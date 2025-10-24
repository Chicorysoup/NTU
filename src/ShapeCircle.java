public class ShapeCircle extends Shape{
    protected double radius;

    public ShapeCircle(){}

    public ShapeCircle(double radius){
        this.radius = radius;
    }

    public ShapeCircle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }

    public String toString(){
        return "Circle[Shape[color=" + color + ", filled=" + filled + "], radius=" + radius + "]";
    }
}
