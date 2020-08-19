
public class Animal {

    String name;
    int age;
    public void printName(){
        System.out.println("I am Ani");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.printName();
        d.age = 10;
    }
}

class Dog extends Animal{
    String name;

    public  void printName(){
        System.out.println("I am Dog");
    }

}

