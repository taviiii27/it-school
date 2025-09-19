import java.time.LocalDate;

public class DateArithmetic {
    public static LocalDate addWeeksToToday(int weeks) {
        return LocalDate.now().plusWeeks(weeks);
    }

    public static void main(String[] args) {
        System.out.println("Date after 4 weeks: " + addWeeksToToday(4));
    }
}
