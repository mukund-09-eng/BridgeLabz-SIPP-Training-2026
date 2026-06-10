package Level1;
import java.util.*;
public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of handshakes is " + handshakes);
    }
}
