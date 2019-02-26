import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public abstract class Project {

    private String name;
    private LocalDate deadline;

    public Project(String name, LocalDate deadline) {
        this.name = name;
        this.deadline = deadline;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "P(" + name + " " + deadline + ")";
    }
}
