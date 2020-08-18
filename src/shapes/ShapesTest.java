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

//        Rectangle myShape = new Rectangle();
        Measurable myShape = new Measurable() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };
        System.out.println(myShape.getPerimeter());

      //Measurable  myShape = new Rectangle();



    }

}
