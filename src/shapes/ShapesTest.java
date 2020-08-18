package shapes;

public class ShapesTest {
//protected double myShape;

    public static void main(String[] args) {
        //previous exercises
//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println("The perimeter of box1 is : " + box1.getPerimeter(4,5));
//        System.out.println("The area of box1 is : " + box1.getArea(4,5));
//        System.out.println("-------------------");
//
//        Square box2 = new Square(5);
//        System.out.println("The perimeter of box2 is : " + box2.getPerimeter(5)+ " cm");
//        System.out.println("The area of box2 is : " + box2.getArea(5) + " cm");

        Measurable myShape;
         myShape = new Rectangle(5, 4);
        System.out.println("The perimeter = " + myShape.getPerimeter());
        System.out.println("The area = " + myShape.getArea());

        myShape = new Square(5);
        System.out.println("The perimeter = " + myShape.getPerimeter());
        System.out.println("The area = " + myShape.getArea());

    }
}
