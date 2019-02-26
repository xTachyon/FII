import java.time.LocalDate;
import java.util.Date;

public class Application extends Project {

  private Language languages;

    public Application(String name, LocalDate deadline, Language languages) {
        super(name, deadline);
        this.languages = languages;
    }

    public Language getLanguages() { return languages; }
    public void setLanguages(Language languages) { this.languages = languages; }

    @Override
    public String toString() {
        return "A(" + super.getName() + " " + super.getDeadline() + " " + languages + ")";
    }
}
