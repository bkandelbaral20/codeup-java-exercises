package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {

        Input input = new Input();
        double radius = input.getDouble();

         Circle circle = new Circle(radius);
        System.out.println("The radius of an circle is : " + circle.getRadius());
        System.out.println("The Area of an circle is : " + circle.getArea());
        System.out.println("The circumference of an circle is : " + circle.getCircumference());
    }
}
