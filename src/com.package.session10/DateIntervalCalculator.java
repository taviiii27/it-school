import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateIntervalCalculator {
    public static long daysBetween() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date (YYYY-MM-DD): ");
        LocalDate d1 = LocalDate.parse(sc.nextLine());
        System.out.print("Enter second date (YYYY-MM-DD): ");
        LocalDate d2 = LocalDate.parse(sc.nextLine());
        return ChronoUnit.DAYS.between(d1, d2);
    }

    public static void main(String[] args) {
        System.out.println("Days between: " + daysBetween());
    }
}
