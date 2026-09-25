package Operations;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number :");
        int a = sc.nextInt();

         int Square = (a* a);
         System.out.println("SQUARE No :" +  Square + " ^2 ");

         int  Cube =  (a * a * a);
         System.out.println("Cube =" + Cube +  " ^3 ");
    }
}
