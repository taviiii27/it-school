import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListStudentManager {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name to remove: ");
        String name = sc.nextLine();

        if (students.contains(name)) {
            students.remove(name);
            System.out.println(name + " removed from the list.");
        } else {
            System.out.println(name + " not found.");
        }

        System.out.println("Remaining students: " + students);
    }
}
