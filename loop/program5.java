package loop;
import java.util.Scanner;

public class program5 {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    System.out.print("Enter number");
    int n = sc.nextInt();

        int sum = 2;

        for (int i = 1; i<=n; i++){
            sum = sum + i;
            System.out.println(sum);

         }
   sc.close();
    }

}
