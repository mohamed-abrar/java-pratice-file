package ifelse;

import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter travel (weekend/weekday): ");
        String day = sc.nextLine();

        int price;

        if (age < 5) {
            price = 0;
        }

        else if (age <= 17) {

            if (day.equals("weekend")) {
                price = 70;
            } else {
                price = 50;
            }

        }

        else if (age <= 59) {

            if (day.equals("weekend")) {
                price = 150;
            } else {
                price = 100;
            }

        }

        else {

            if (day.equals("weekend")) {
                price = 80;
            } else {
                price = 60;
            }

        }

        System.out.println("Ticket Price: $" + price);

        sc.close();
    }
}