package Level1;
import java.util.*;
public class prob14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in feet is " + feet +
                ", yards is " + yards +
                " and miles is " + miles);
    }
}
