
//Create a class named FizzBuzz, and write a fizzBuzz method that will loop to the
// number passed and complete the FizzBuzz problem.


public class FizzBuzz {
    public static void fizzBuzz(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        fizzBuzz(50);

    }

}