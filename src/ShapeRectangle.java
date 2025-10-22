public class ShapeRectangle extends Shape{
    protected double width;
    protected double length;

    public ShapeRectangle(){}

    public ShapeRectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public ShapeRectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2 * (width + length);
    }
}
