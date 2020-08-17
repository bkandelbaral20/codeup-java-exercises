package shapes;

public class Square extends Rectangle {

    public int sides;

    Square squ = new Square();

    //default constructor
    public Square(){
    }
    //using getter and setter method for sides

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    //creating method for square
    public Square(int sides){
        this.sides = sides;
       // super();
    }

}
