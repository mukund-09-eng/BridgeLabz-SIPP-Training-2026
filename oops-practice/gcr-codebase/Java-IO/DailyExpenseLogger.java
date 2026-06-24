import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Category: ");
        String category = sc.nextLine();

        System.out.print("Amount: ");
        int amount = sc.nextInt();

        try (
                BufferedWriter bw =
                        new BufferedWriter(
                                new FileWriter(
                                        "expenses.txt",
                                        true))
        ) {

            bw.write(category + " - " + amount);
            bw.newLine();

            System.out.println(
                    "Expense Saved Successfully");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}
