class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    static void makePayment(double billAmount, double paidAmount)
            throws InsufficientFundsException {

        if (paidAmount < billAmount) {
            throw new InsufficientFundsException(
                    "Payment Failed: Insufficient funds.");
        }

        System.out.println("Payment Successful.");
    }

    public static void main(String[] args) {

        // 1. ArithmeticException
        try {

            int totalBill = 5000;
            int items = 0;

            double avgCost = totalBill / items;

            System.out.println(avgCost);

        } catch (ArithmeticException e) {

            System.out.println(
                    "Billing Error: Number of items cannot be zero.");
        }

        // 2. ArrayIndexOutOfBoundsException
        try {

            String[] patients = {
                    "Mukund",
                    "Rahul",
                    "Aman"
            };

            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Patient Error: Invalid patient index.");
        }

        // 3. NumberFormatException
        try {

            String amount = "ABC";

            int bill = Integer.parseInt(amount);

            System.out.println(bill);

        } catch (NumberFormatException e) {

            System.out.println(
                    "Input Error: Please enter a valid number.");
        }

        // 4. Custom Exception
        try {

            makePayment(5000, 3000);

        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());
        }
    }
}
