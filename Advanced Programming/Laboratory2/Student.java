import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;


public class Student {

    private String name;
    private int yearOfStudy;
    private List<Project> preferences;

    public Student(String name, int yearOfStudy) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.preferences = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getYearOfStudy() { return yearOfStudy; }
    public void setYearOfStudy(int yearOfStudy) { this.yearOfStudy = yearOfStudy; }



    // Setter for preferences regarding the projects
    public void setPreferences(Project... preferencesArguments) {
        for (Project project : preferencesArguments) {
            preferences.add(project);
        }
    }

    // Gets the string representation of this object
    public List<Project> getPreferences() {
        return preferences;
    }

    @Override
    public String toString() {
        return "S(" + name + " " + yearOfStudy + ")";
    }
}
