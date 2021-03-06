package javaPractise;

import java.util.ArrayList;
import java.util.Arrays;


public class Array {

     static String name;
    public static void main(String[] args) {
        //initializing the array having 3 elements

        String name2;


        System.out.println("name = " + name);
        //I'm at Wyndham LaSystem.out.println("name = " + name2);


        String[] newArray = new String[]{"Santosh", "Binju"};
        System.out.println(newArray.length);

        ArrayList<String> myAl = new ArrayList<>();
        myAl.add("Santosh");
        myAl.add("Binju");
        System.out.println(myAl.size());
        System.out.println(myAl.get(0));
        for(String s : myAl){
            System.out.println(s);
        }


        System.out.println(newArray[0]);
        System.out.println(newArray[1]);
        System.out.println(newArray[2]);
        System.out.println("---------------");



//        initializing array size and elements
        String[] myNames = new String[]{"bin", "jita", "rita", "gita"};
        int[] grades = new int[]{66, 23, 23, 45, 34};

        //calculate its total elemnts /size
        System.out.println("The size of an array is  " + (myNames.length));

        //for loop iterate all the indexes
        for (int i = 0; i < myNames.length; i++) {
            System.out.println(myNames[i]);
        }
        System.out.println("---------------");

        //using enchnced loop for both array
        for (String myName : myNames) {
            System.out.println(myName);
        }
        System.out.println("------------------");
        for (int grade : grades) {
            System.out.println("|********* " + grade + " **********|");

        }
        System.out.println("------------------");
//        Array classes

        //1. Arrays.fill method
        Arrays.fill(grades, 88);
        System.out.println("Changing the value of grades using Arrays.fill method");
        System.out.println("------------------");
        for (int g : grades) {
            System.out.println(g);
        }
        System.out.println("------------------");


//       2. Arrays.equals method

//    boolean checking = Arrays.equals(grades, myNames);
//            System.out.println(checking);


//        3.Arrays.copyOf method
        System.out.println("Using arrays.copy  method to copy all the previous indies and also add 1 more element");
        int[] newGrades = Arrays.copyOf(grades, 6);
        //assiging value to new index
        newGrades[5] = 20;
        for (int h : newGrades) {
            System.out.println(h);
        }
        System.out.println("\nusing array.tostring method");
        System.out.println(Arrays.toString(newGrades));
        System.out.println("------------------");

//        4.Arrays.toString method
        System.out.println("Returns string representation of an array ");
        String[] locations = new String[]{"pokhara", "chitwan", "london", "paris", "new York"};
        System.out.println(Arrays.toString(locations));
        System.out.println("------------------");

//        4.Arrays.sort(array) method
        System.out.println("Returning above mentioned array of location into ascending orders");
        Arrays.sort(locations);
        System.out.println(Arrays.toString(locations));
        System.out.println("------------------");

//        Two-dimensional Arrays
        System.out.println("Using 2-dimensional method to print out individual elements");
        int[][] numbers = {
                {2, 5, 6},
                {3, 5, 2},
                {4, 8, 1}
        };

        System.out.println(" **** using for loop to print out the 2-dimensional array ****");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
        System.out.println("------------------");

        System.out.println("Access the indiviual element using row and column method");
        System.out.println("numbers[2][1] = " + numbers[2][1]);
        System.out.println("numbers[0][1] = " + numbers[0][1]);
        System.out.println("numbers[1][2] = " + numbers[1][2]);
        System.out.println("numbers[0][0] = " + numbers[0][0]);

    }


}
