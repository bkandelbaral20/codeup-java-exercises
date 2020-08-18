package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);

        System.out.println("The perimeter of rectangle is : " + box1.getPerimeter(4,5));
        System.out.println("The area of rectangle is : " + box1.getArea(4,5));

        Square box2 = new Square(5,4,5);

        System.out.println("The perimeter of square is : " + box2.getPerimeter(5)+ " cm");
        System.out.println("The area of square is : " + box2.getArea(5) + " cm");
    }

}
