package loop;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i ;
        System.out.print("Enter  number");
        int reverse = sc.nextInt();

        for(i=reverse; i>=1;i--){
            System.out.println(i);
        }

    }
}
