 import java.util.Scanner;

public class program3 {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("choose grade (A-c):");
        char Grade  = sc.next().charAt(0);

        switch (Grade) {
            case 'A':
                System.out.println("Execellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                  System.out.println("only  choose  grade");
            }

    }
}


