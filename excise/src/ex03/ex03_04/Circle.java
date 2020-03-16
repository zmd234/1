package ex03.ex03_04;

public class Circle extends Shape{
    private  int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle [" +
                "radius=" + radius +
                ']';
    }
}
