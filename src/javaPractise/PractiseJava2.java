package javaPractise;

public class PractiseJava2 {

//  defining a class and creating an instance of it.
public String firstName;
public String lastName;

//creating an sayHello method
    public String sayHello(String firstName, String lastName) {
        return String.format("My name is %s %s " , firstName,lastName);
    }

    //creating main method to run the code
    public static void main(String[] args) {
//        creating an instance of an class
        PractiseJava2 fullName = new PractiseJava2();

//        we can create different instance of class object, in this senario we can assign another fullname for
//        another person
        System.out.println(fullName.sayHello("Binjita","kandel"));
    }
}
