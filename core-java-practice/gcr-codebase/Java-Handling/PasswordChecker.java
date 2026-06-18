public class PasswordChecker {

    public static void checkPassword(String password) {

        try {

            if (password == null) {
                throw new NullPointerException();
            }

            if (password.isEmpty()) {
                System.out.println("Password cannot be empty.");
                return;
            }

            if (password.length() < 8) {
                System.out.println("Password must be at least 8 characters.");
                return;
            }

            if (!Character.isUpperCase(password.charAt(0))) {
                System.out.println("First character must be uppercase.");
                return;
            }

            if (!Character.isDigit(password.charAt(password.length() - 1))) {
                System.out.println("Last character must be a digit.");
                return;
            }

            boolean specialFound = false;

            String specialChars = "@#$%&*";

            for (int i = 0; i < password.length(); i++) {

                if (specialChars.indexOf(password.charAt(i)) != -1) {
                    specialFound = true;
                    break;
                }
            }

            if (!specialFound) {
                System.out.println("Password must contain a special character.");
                return;
            }

            System.out.println("Strong Password");

        } catch (NullPointerException e) {

            System.out.println("Password cannot be null.");
        }
    }

    public static void main(String[] args) {

        checkPassword(null);

        checkPassword("");

        checkPassword("Abc1");

        checkPassword("abc@1234");

        checkPassword("Abc@123a");

        checkPassword("Abc12345");

        checkPassword("Abcd@123");
    }
}
