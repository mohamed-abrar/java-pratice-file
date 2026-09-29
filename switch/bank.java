import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.println("          MENU       ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance");
        System.out.println("4. Exit");

        System.out.print("Enter one : ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.print("how  much money they want to  deposit \n  enter that deposit amount :");
                double amount = sc.nextDouble();
                amount = (balance + amount);
                System.out.println(amount + "Deposited");
                break;

            case 2:
                System.out.print("how  much money they want to  withdraw \n  enter that deposit amount :");
                double Withdraw = sc.nextDouble();

                if (balance >= Withdraw) {
                    Withdraw = (balance - Withdraw);
                    System.out.println(Withdraw + "Withdraw");
                } else {
                    System.out.println("Ur balance not have");
                }
                break;
            case 3:
                System.out.println("Balance " + balance);
                break;
            case 4:
                System.out.println("Thank you");
                break;
            default:
                System.out.println("Enter menu option only");
                break;

        }
        sc.close();
    }
}
