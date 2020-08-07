public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 25;
        System.out.println(myFavoriteNumber);

        String myString = "3.14159";
        System.out.println(myString);

        double myNumber = 3.14;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++x);
        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";

        int z = 4;
        z += 5;
        System.out.println(z);

        int a = 3;
        int b = 4;
        System.out.println(a *= b);

        int c = 10;
        int d = 2;
        System.out.println(c /= d);
        System.out.println(c -= d);

        int coolExample = Integer.MAX_VALUE + 1;
        System.out.println(coolExample);

    }
}
