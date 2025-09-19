import java.time.Duration;
import java.time.LocalTime;

public class ElapsedTimeCalculator {
    public static void elapsedTimeSince(String timeStr) {
        LocalTime inputTime = LocalTime.parse(timeStr);
        LocalTime now = LocalTime.now();

        Duration duration = Duration.between(inputTime, now);
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();

        System.out.println("Elapsed: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }

    public static void main(String[] args) {
        elapsedTimeSince("12:00:00");
    }
}
