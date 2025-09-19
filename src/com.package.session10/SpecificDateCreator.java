import java.time.LocalDate;

public class SpecificDateCreator {
    public static LocalDate createSpecificDate() {
        return LocalDate.of(2025, 8, 19);
    }

    public static void main(String[] args) {
        System.out.println("Specific date: " + createSpecificDate());
    }
}
