package shapes;

public class Rectangle {

    //class variable
    protected double length;
    protected double width;

    //default constructor
    public Rectangle() {
    }

    //instance of an object
    Rectangle rec = new Rectangle();

    //using getter and setter method for length and width
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //rectangle method for length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //create getArea method
    public double getArea(double length, double width){
        return length * width;
    }
    //create getPerimeter method
    public double getPerimeter(double length,double width){
        return 2*(length + width);
    }



}
