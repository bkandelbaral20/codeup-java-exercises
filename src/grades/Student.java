package grades;
 import java.util.*;

public class Student {

    private String name;
     private ArrayList<Integer> grades = new ArrayList<>();

   // Default constructor
    public Student (){}

    //using getter ans setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //constructor
    public Student(String name) {
        this.name = name;
        this.grades = grades;
    }

    // adds the given grade to the grades property
        public void addGrade(int grade) {
            grades.add(grade);
        }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (double grade : grades){
            total += grade++;
        }
        return total / grades.size();
    }

}
