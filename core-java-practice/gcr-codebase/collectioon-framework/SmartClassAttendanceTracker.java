import java.util.ArrayList;
import java.util.HashMap;

public class SmartClassroomAttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    // Mark Attendance
    static void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println(student + " is already marked present in " + subject);
        }
    }

    // Display Attendance
    static void displayAttendance() {

        System.out.println("\n----- Attendance Record -----");

        for (String subject : attendance.keySet()) {

            System.out.println("\nSubject: " + subject);

            ArrayList<String> students = attendance.get(subject);

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total Students: " + students.size());
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Mukund");
        markAttendance("Java", "Rahul");
        markAttendance("Java", "Mukund"); // Duplicate

        markAttendance("Python", "Aman");
        markAttendance("Python", "Rahul");

        displayAttendance();
    }
}
