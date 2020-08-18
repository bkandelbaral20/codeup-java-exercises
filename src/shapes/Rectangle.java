package shapes;

public class Rectangle {

    //class variable
    protected double length;
    protected double width;

    //rectangle method for length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //create getArea method
    public double getArea(double length, double width) {
        return length * width;
    }

    //create getPerimeter method
    public double getPerimeter(double length, double width) {
        return 2 * (length + width);
    }

}
