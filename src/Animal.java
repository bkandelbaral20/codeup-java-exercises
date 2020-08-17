
public class Animal {

    String name;
    public void printName(){
        System.out.println("I am Ani");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.printName();
    }
}

class Dog extends Animal{
    String name;

    public  void printName(){
        System.out.println("I am Dog");
    }

}

