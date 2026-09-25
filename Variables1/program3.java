package Variables1;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  ur Principle  Amount :");
        int Principle = sc.nextInt();

       double interestRate = 10;

       System.out.print("Enter  ur time :");
        int time = sc.nextInt();
        
      double PerMonth = ((Principle * interestRate * time)/100);
      System.out.println("Per  Month :" + PerMonth);



    }
}
