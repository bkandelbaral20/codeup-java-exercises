package grades;

import java.util.*;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    // Default constructor
    public Student() {
    }

    //return student name
    public String getName() {
        return name;
    }

    //constructor
    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double totalSum = 0;
        for (double grade : grades) {
            totalSum += grade;
        }
        return totalSum / grades.size();
    }

    public static void main(String[] args) {

        //creating student array object
        Student[] students = {new Student("binjita"),
                new Student("Zihan"),
                new Student("Tracy"),
                new Student("Vanessa")
        };
        for(Student stu : students){
            for( int i=0;i<4; i++){
                stu.addGrade((int) (Math.random()* 101));
            }
        }

        for (Student stu : students){
            for (Integer grade : stu.grades){
                System.out.printf(" grade %d | ", grade);
            }
            System.out.println(String.format("\n Average : %.2f ", stu.getGradeAverage()));
        }


    }

}
