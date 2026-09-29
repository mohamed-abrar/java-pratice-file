package ifelse;

import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println(num +"this is even  number");
        }
        else{
            System.out.println(num +"this is oddnumber");
        }
    }
}
