import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("choose  menu \n Home \n About  us  \n Contact\n :");
        int menu  = sc.nextInt();
        
        switch (menu) {
            case 1:
                System.out.println("Home  Selected");
                break;
            case 2:
                System.out.println("About us Selected");
                break;
            case 3:
                System.out.println("COntact Selected");
                break;
            default:
                  System.out.println("only  choose  menu");
            }

    }
}
