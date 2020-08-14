
public class Person {

    //instance variable
    private String name;

    //setting name using constructor
    public Person(String name) {
        this.name = name;
    }

    //main method
    public static void main(String[] args) {
        Person per = new Person();
        per.name = "Rama";
        System.out.println(per.name);

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
    public String getName() {
//TODO: return the person's name
        return name;
    }

    public void setName(String name) {
//TODO: change the name property to the passed value
       this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println("hello " + name);
    }

    //default constructor
    public Person() {
    }
}
