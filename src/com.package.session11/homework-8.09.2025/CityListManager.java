import java.util.ArrayList;
import java.util.Scanner;

public class CityListManager {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Sydney");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a city to add: ");
        String city = sc.nextLine();

        if (cities.contains(city)) {
            System.out.println(city + " is a duplicate!");
        } else {
            cities.add(city);
            System.out.println(city + " added to the list.");
        }

        System.out.println("Current Cities: " + cities);
    }
}
