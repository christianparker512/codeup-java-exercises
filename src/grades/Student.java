package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student (String aName) {
        this.name = aName;
        this.grades = new ArrayList<>();
    }
        // returns the student's name
        public String getName() {
            return this.name;
        }

        public ArrayList<Integer> getGrades() {
            return grades;
        }
// adds the given grade to the grades property
        public void addGrade(int grade) {
        grades.add(grade);
        }
// returns the average of the students grades
//        public double getGradeAverage(){
//
////        int total = 0;
////        for (int grade: grade)
////        {
////            total += grade;
////            double sum = grades.stream().mapToDouble(n->n).sum();
////        }
////        return (double)total/grades.size();
////        return sum/grades.size();
//    }
}
