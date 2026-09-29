import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("         Shopping MENU       ");
        System.out.println("1.Note = 30 ");
        System.out.println("2. pen = 20");
        System.out.println("3. Eraser  =10");
        System.out.println("4. ink = 28");
        System.out.println("5. Scale = 40");

        System.out.print("Enter menu :");
        int menu = sc.nextInt();

        System.out.print("Enter  Quantity :");
        int quantity = sc.nextInt();
        int price =0;

        switch (menu) {
            case 1:
                
                price = menu * quantity;
                break;
            case 2:
                price = menu * quantity;
                break;
            case 3:
                price = menu * quantity;
                break;
            case 4:
                price = menu * quantity;
                break;
            case 5:
                price = menu * quantity;
                break;
            default:
                System.out.println("Sry enter menu only");
        }
        System.out.println("Total Amount" + price);

        sc.close();
    }
}