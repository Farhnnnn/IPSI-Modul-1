import java.util.Vector;
import java.util.Enumeration;

public class Course {
    private String title;
    private Vector<CourseRecord> courseRecords = new Vector<CourseRecord>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void addCourseRecord(CourseRecord cr) {
        courseRecords.addElement(cr);
    }

    public Enumeration<CourseRecord> getCourseRecords() {
        return courseRecords.elements();
    }

    public void printCourseStudents() {
        System.out.println("Daftar Mahasiswa Mata Kuliah: " + title);
        Enumeration<CourseRecord> records = getCourseRecords();
        while (records.hasMoreElements()) {
            CourseRecord record = records.nextElement();
            System.out.println("- " + record.getStudent().getName());
        }
    }
}