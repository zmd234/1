package ex03.ex03_04;

public class Rectangle extends Shape{
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (width+length)*2;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public String toString() {
        return "Rectangle [" +
                "width=" + width +
                ", length=" + length +
                ']';
    }
}
