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
    public Square(int sides,double length, double width){
        super(length, width);
        this.sides = sides;
    }

}
