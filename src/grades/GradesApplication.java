package grades;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(" Welcome ! \n");
        System.out.println(" Here are the GitHub usernames of our students:");

        HashMap<String, Student> students = new HashMap<>();

        //student name objects
        Student student1 = new Student("Sanju");
        Student student2 = new Student("Binju");
        Student student3 = new Student("Bijit");
        Student student4 = new Student("Santosh");

        //each student object 3 grades
        student1.addGrade(96);
        student1.addGrade(54);
        student1.addGrade(87);

        student2.addGrade(89);
        student2.addGrade(100);
        student2.addGrade(78);

        student3.addGrade(98);
        student3.addGrade(73);
        student3.addGrade(80);

        student4.addGrade(83);
        student4.addGrade(98);
        student4.addGrade(63);

        //student Github usernames
        students.put("bkandel56", student1);
        students.put("sanju21", student2);
        students.put("Bijit91", student3);
        students.put("Santosh56", student4);


    }
}
