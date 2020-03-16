package ex03;

public class Rectangle {

    private int width;
    private int length;

    public Rectangle() {
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getPerimeter() {
        return (width+length)*2;
    }

    public int getArea(){
        return  width*length;
    }

    @Override
    public String toString() {
        return "Rectangle  [" +
                "width=" + width +
                ", length=" + length +
                ']';
    }
}
