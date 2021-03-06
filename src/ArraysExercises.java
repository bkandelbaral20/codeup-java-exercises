
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //this print shows the location of an numbers array because it is an object
        System.out.println(numbers);
        //this array to string will print all the array numbers
        System.out.println(Arrays.toString(numbers));


//        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
//        Iterate through the array and print out the name of each person in the array.
        Person p1 =  new Person("Brian");
        Person p2 =  new Person("Ryan");
        Person p3 =  new Person("Austine");

        Person [] people =  new Person[3];
        people[0] = p1;
        people[1] = p2;
        people[2] = p3;

        for (Person thisPerson : people) {
            System.out.println(thisPerson.getName());
        }
        System.out.println("Adding a new person ..... \n");

        Person binjita = new Person("Binjita");
        Person[] updatedPeople = new Person[people.length + 1];
        updatedPeople = addPerson(people, binjita);

        System.out.println("Printing out updated people array...");
        for(Person thisPerson : updatedPeople) {
            System.out.println(thisPerson.getName());
        }

    }

    //         Create a static method named addPerson. It should accept an array of Person objects,
//        as well as a single person object to add to the passed array. It should return an array whose length is
//        1 greater than the passed array, with the passed person object at the end of the array.
    public static Person[] addPerson(Person[] existingPeople, Person newPeep) {
        //add newPeep
        Person[] updatedPeeps = Arrays.copyOf(existingPeople,existingPeople.length + 1);


//        {1,2,3} ===> {1,2,3,4}
        updatedPeeps[existingPeople.length]= newPeep;
        return updatedPeeps;
    }

}
