package shapes;

public class Square extends Rectangle {

    public int sides;

    //using getter and setter method for sides
//    public int getSides() {
//        return sides;
//    }
//
//    public void setSides(int sides) {
//        this.sides = sides;
//    }

    //creating method for square
    public Square(double length, double width,int sides){
        super(length, width);
        this.sides = sides;
    }

    //getArea and get method overriding
    public double getArea(int sides){
        return Math.pow(sides,2) ;
    }
    //create getPerimeter method
    public double getPerimeter(int sides){
        return  4 * sides;
    }

}
