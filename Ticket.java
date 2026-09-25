import java.time.LocalDate;
import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter  ur name");
        String name = scanner.nextLine();

        System.out.println("Pickup location");
        String pickuplocation = scanner.nextLine();

        System.out.println("Drop location");
        String droplocation = scanner.nextLine();

        System.out.println(" how many seat  have?");
        int seat = scanner.nextInt();

        System.out.println(" Enter ur phone number");
        int phonenumber = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter email ");
        String email = scanner.nextLine();

        System.out.println("Enter your date (YYYY-MM-DD):");
        String dateInput = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateInput);

        System.out.println("Did you confirm your ticket? (true/false)");
        boolean confirmed = scanner.nextBoolean();
        
        System.out.println("your  name:" + name);
        System.out.println("You are from :" + pickuplocation);
        System.out.println("You are To :" + droplocation);
        System.out.println("you have booked seats:" + seat);
        System.out.println("Your phone  no: " + phonenumber);
        System.out.println("Email id:  " + email);
        System.out.println("Selected date: " + date);
        System.out.println("Ticket confirmed: " + confirmed);

    }
}
