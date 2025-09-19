import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateAuthenticator {
    public static boolean isValidDate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String input = sc.nextLine();
        try {
            LocalDate.parse(input, DateTimeFormatter.ISO_LOCAL_DATE);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Valid date? " + isValidDate());
    }
}
