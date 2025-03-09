import java.util.Scanner;

public class FavoriteNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting for favorite integer
        System.out.print("Enter your favorite integer: ");
        int favoriteInteger = getInt(scanner);

        // Prompting for favorite double
        System.out.print("Enter your favorite double: ");
        double favoriteDouble = getDouble(scanner);

        // Displaying the entered numbers
        System.out.println("Your favorite integer is: " + favoriteInteger);
        System.out.println("Your favorite double is: " + favoriteDouble);
    }

    // Method to handle integer input
    public static int getInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine()); // Parses input to an integer
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid integer: ");
            }
        }
    }

    // Method to handle double input
    public static double getDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine()); // Parses input to a double
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid double: ");
            }
        }
    }
}
