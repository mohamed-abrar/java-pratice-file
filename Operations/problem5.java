package Operations;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number :");
    float num = sc.nextFloat();

     System.out.print("Enter Division Number :");
    float sum = sc.nextFloat();

    float Quotient =num % sum;
    System.out.println("Quotient :"+ Quotient);

    float Remainder =num / sum;
    System.out.println("Remainder :"+ Remainder);

    }   
}
