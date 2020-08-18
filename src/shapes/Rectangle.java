package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width){
        super(length,width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2*(length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

//    previous exercises
    //class variable
//    protected double length;
//    protected double width;

//    //rectangle method for length and width
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }

//    //create getArea method
//    public double getArea(double length, double width) {
//        return length * width;
//    }
//
//    //create getPerimeter method
//    public double getPerimeter(double length, double width) {
//        return 2 * (length + width);
//    }

}
