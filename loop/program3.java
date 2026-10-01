package loop;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
       Scanner sc = new  Scanner(System.in);
       
       System.out.print("Enter Number :");
       int number = sc.nextInt();

        for(int i=1; i<=10;i++){
            System.out.println(number +"x" + i + "=" + number*i );
        }
    }  
}
