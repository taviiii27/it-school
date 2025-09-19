import java.util.ArrayList;

public class GraduateStudentList {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();

        // Populate studentList with 10 realistic student names
        String[] firstNames = {"Alice", "Bob", "Charlie", "Diana", "Ethan", "Fiona", "George", "Hannah", "Ian", "Julia"};
        String[] lastNames = {"Smith", "Johnson", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas"};

        for (int i = 0; i < 10; i++) {
            String fullName = firstNames[i] + " " + lastNames[i];
            studentList.add(fullName);
        }

        // Copy values to graduateStudentList
        graduateStudentList.addAll(studentList);

        System.out.println("Graduated Students:");
        for (String student : graduateStudentList) {
            System.out.println("graduated " + student);
        }
    }
}
