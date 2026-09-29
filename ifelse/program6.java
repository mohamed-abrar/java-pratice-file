package ifelse;

import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter  number");
        int year= sc.nextInt();

        if(year % 400 == 0){
            System.out.println(year + "Leap year");
        }
        else  if(year %100 == 0){
            System.out.println(year + "not  a Leap  year");
        }
        else if (year % 4 == 0 ){
            System.out.println(year + " Leap year");
        }
        else{
            System.out.println(year + "not  Leap Year");
        }
 
    }
}
