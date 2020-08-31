package util;

public class InputTest {
    public static void main(String[] args) {
        //creating new instance of object for testing all the methods from input
        Input input = new Input();

        // calling all the methods from input class
       // System.out.println("The user typed string is : " + input.getString());
        System.out.println("The boolean  value of userInput is : " + input.yesNo());
//        System.out.println("The integer is : " + input.getInt(1, 10));
//        System.out.println("The single integer is : " + input.getInt());
//        System.out.println("The numbers are : " + input.getDouble(1, 10));
//        System.out.println("The number is: " + input.getDouble());
    }
}
