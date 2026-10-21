public class Main {
    public static void main(String[] args) {
        try {
            // Membuat objek Course (Mata Kuliah)
            Course course = new Course();
            course.setTitle("Implementasi dan Pengujian Sistem Informasi");

            // Membuat objek Student (Mahasiswa) dengan nama dan NIM Anda
            Student student = new Student("M. Rifky Dimas Saputra");

            // Membuat CourseRecord untuk menghubungkan mahasiswa ke mata kuliah
            CourseRecord record = new CourseRecord(student);
            course.addCourseRecord(record);

            // Membuat Assignment (Tugas) dan mengisi nilai
            Assignment assignment = new Assignment();
            assignment.setMark(90);
            record.addAssignment(assignment);

            // Menampilkan informasi ke konsol
            System.out.println("Mata Kuliah: " + course.getTitle());
            System.out.println("Nama Mahasiswa: " + student.getName());
            System.out.println("Nilai Tugas: " + assignment.getMark());

            // Menampilkan daftar mahasiswa di mata kuliah
            course.printCourseStudents();

        } catch (NotYetSetException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
        }
    }
}