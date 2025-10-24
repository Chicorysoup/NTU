import java.awt.*;

public class ShapeRectSquare extends ShapeRectangle {

    protected double side;

    public ShapeRectSquare() {
    }

    public ShapeRectSquare(double side) {
        this.side = side;
    }

    public ShapeRectSquare(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = length;
    }

    public void setWidth(double side) {
        this.side = width;
    }

    public void setLength(double side) {
        this.length = side;
    }

    public String toString() {
        return"Rectangle[Shape[color="+ color + ", filled=" + filled + "], width = "
            + width + ", length=" + length + "]]";
    }
}
