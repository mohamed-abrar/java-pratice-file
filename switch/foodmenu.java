import java.util.Scanner;



public class foodmenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("         FOOD MENU       ");
        System.out.println("1. chicken  Biryani");
        System.out.println("2. Mutton  briyani");
        System.out.println("3. Egg briyani");
        System.out.println("4. plain briyani");
        System.out.println("5. ghee  briyani");


        System.out.print("Enter menu ");
        int menu = sc.nextInt();

        switch (menu) {
           case 1:
                System.out.println("u Selected chicken briyani \n price  :120");
                break;
            case 2:
                System.out.println("u Selected  Mutton briyani \n price :220  ");
                break;
            case 3:
                System.out.println("u Selected  plain briyani \n price: 80");
                break;
            case 4:
                System.out.println("u Selected  Egg briyani \n price: 90 ");
                break;
            case 5:
                System.out.println("u Selected Ghee rice \n price: 70");
                break;
            case 6:
                System.out.println("u Selected veg  rice \n price: 120");
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        
    }
}
