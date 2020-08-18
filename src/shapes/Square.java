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

    protected int side;
    public Square(int side) {
        this.width = side;
        this.length = side;
        this.side = side;
    }
    @Override
    public double getPerimeter() {
        return 4*(side);
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }



}
