package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    //default constructor
    public Rectangle(){
    }

    //instance of an object
    Rectangle rec = new Rectangle();

    //using getter and setter method
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

   // Rectangle rec = new Rectangle();

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }


}
