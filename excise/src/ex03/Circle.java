package ex03;

public class Circle {

    private  int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getPerimeter(){
        return (int)(2*Math.PI*radius);
    }

    public int getArea(){
        return  (int)(Math.PI*radius*radius);
    }

    @Override
    public String toString() {
        return "Circle [" +
                "radius=" + radius +
                ']';
    }
}
