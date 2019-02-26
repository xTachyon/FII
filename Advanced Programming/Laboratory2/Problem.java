import java.util.ArrayList;
import java.util.List;


public class Problem {

    List<Student> students;

    public Problem() {
        this.students = new ArrayList<>();
    }

    public void setStudents(Student...studentsArguments)
    {
        for (Student i : studentsArguments) {
            students.add(i);
        }
    }

    @Override
    public String toString() {
        return "Asta este problema";
    }
}
