
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //this print shows the location of an numbers array
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));


//        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
//        Iterate through the array and print out the name of each person in the array.
        String[] person = {"Brian", "Austin", "Ryan"};
        for (String n : person) {
            System.out.println(n);
        }

//         Create a static method named addPerson. It should accept an array of Person objects,
//        as well as a single person object to add to the passed array. It should return an array whose length is
//        1 greater than the passed array, with the passed person object at the end of the array.


    }
}
