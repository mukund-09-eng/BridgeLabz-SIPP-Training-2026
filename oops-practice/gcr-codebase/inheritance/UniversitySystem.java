class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    final int studentId; // final variable
    double gpa;

    Student(String name, int age, int studentId, double gpa) {
        super(name, age); // call Person constructor
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Student ID: " + studentId
                + ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    String thesis;

    GradStudent(String name, int age, int studentId,
                double gpa, String thesis) {

        super(name, age, studentId, gpa); // call Student constructor
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Thesis: " + thesis;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Mukund", 21, 101, 8.9,
                "Artificial Intelligence");

        System.out.println(gs);

        // IS-A relationship
        Person p = gs;
        Student s = gs;

        System.out.println("\nUsing Person reference:");
        System.out.println(p);

        System.out.println("\nUsing Student reference:");
        System.out.println(s);
    }
}
