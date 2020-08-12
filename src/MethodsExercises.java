
public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("The addition of 3 + 4 is : " + Addition(3, 4));
        System.out.println("The subtraction of 5 - 2 is : " + Subtraction(5, 2));
        System.out.println("The Multiplication of 5 *  7 is : " + Multiplication(5, 7));
        System.out.println("The division of 50 by 2 is : " + Division(50, 2));
        System.out.println("The modulus  of 11 by 4 is : " + Modulus(11, 2));

    }

    //Addition method
    public static double Addition(double x, double y) {
        return x + y;
    }

    //Subtraction method
    public static double Subtraction(double x, double y) {
        return x - y;
    }
    //Multiplication method
    public static double Multiplication(double x, double y) {
        return x * y;
    }
    //Division method
    public static double Division(double x, double y) {
        return x/ y;
    }
    //Modulus method
    public static double Modulus(double x, double y) {
        return x % y;
    }

}
