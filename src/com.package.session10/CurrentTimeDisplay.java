import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CurrentTimeDisplay {
    public static void displayCurrentTime() {
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now.truncatedTo(ChronoUnit.SECONDS));
    }

    public static void main(String[] args) {
        displayCurrentTime();
    }
}
