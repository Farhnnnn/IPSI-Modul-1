import java.util.Vector;
import java.util.Enumeration;

public class CourseRecord {
    private Student student;
    private Vector<Assignment> assignments = new Vector<Assignment>();

    public CourseRecord(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student s) {
        student = s;
    }

    public void addAssignment(Assignment a) {
        assignments.addElement(a);
    }

    public Enumeration<Assignment> getAssignments() {
        return assignments.elements();
    }
}