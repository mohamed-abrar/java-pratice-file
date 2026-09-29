package ifelse;

import java.util.Scanner;

public class program3 {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number");
        int num = sc.nextInt();

        if(num >18){
            System.out.println("ur  are  elgiable vote ");
        }
        else if(num <18){
            System.out.println("ur not elegiable  vote");
        }
        else {
            System.out.println("after  complete 18 to vote");
        }

      }
}
