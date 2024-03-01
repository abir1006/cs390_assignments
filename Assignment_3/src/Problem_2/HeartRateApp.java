package Problem_2;

import java.time.LocalDate;
import java.util.Scanner;

public class HeartRateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Please enter last name:");
        String lastName = scanner.nextLine();

        System.out.println("Please enter your birth date in the format (YYYY-MM-DD) - example 1989-4-14:");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());

        HeartRates person = new HeartRates(firstName, lastName, dateOfBirth);

        person.printTargetHeartRateRange();

        System.out.println(person);

        scanner.close();
    }
}
