package shapes;

public class Square extends Quadrilateral {

//    1.previous exercises
//    public int sides;
//
//    //creating method for square
//    public Square(int sides){
//        super(sides, sides);
//        this.sides = sides;
//    }
//
//    //getArea and get method overriding
//    public double getArea(int sides){
//        return Math.pow(sides,2) ;
//    }
//    //create getPerimeter method
//    public double getPerimeter(int sides){
//        return  4 * sides;
//    }

    protected double side;
    public Square(double side) {
        this.width = side;
        this.length = side;
        this.side = side;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }

    @Override
    public double getPerimeter() {
        return 4*(length);
    }

    @Override
    public double getArea() {
        return length * length;
    }



}
