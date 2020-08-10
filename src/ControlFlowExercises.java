public class ControlFlowExercises {
    public static void main(String[] args) {

        //loop basics
//      a.  While
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.

        int i = 5;
        while ( i<= 15){
            System.out.println("i is " + i);
            i++;
        }
        doWhile();
        forLoop();
        FizzBuzz();
    }


        // b. Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while
//        the number is less than 1,000,000. Output should equal:

        public static void doWhile() {

            //1.
//            int i = 0;
//            do {
//                System.out.println(i);
//                i += 2;
//            } while (i < 100);
////
            //2.
//            int j = 100;
//            do {
//                System.out.println(j);
//                j -= 5;
//            } while (j >= -10);

            //3.
//            int k = 2;
//            do {
//                System.out.println(k);
//                k *= k;
//            } while (k < 1000000);


        }

        public static void forLoop (){
        for (int i=0 ;i<=15 ; i+=2 ){
            System.out.println("i is " + i);
        }
        }

        //c.FizzBuzz
//     One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory,
//     the test is designed to assess basic looping and conditional logic skills.
//    Write a program that prints the numbers from 1 to 100.
//    For multiples of three: print “Fizz” instead of the number.
//    For the multiples of five: print “Buzz”.
//    For numbers which are multiples of both three and five: print “FizzBuzz”.

    public static void FizzBuzz(){
        for(int i=1; i<=100; i++){
            if(i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            }else if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else {
                System.out.println(i);
            }
        }
    }


    }


