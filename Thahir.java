import java.util.Scanner;

public class Thahir {
    public static void main(String[] args) {
       
        Scanner dl =  new Scanner(System.in);

        System.out.print("Enter  the Number :");
        int i = dl.nextInt();
        System.out.print("Enter  the Number :");
        int b = dl.nextInt();

        if (i  >= b) {
            System.out.println(i  + " greater number");
        }
        else{
            System.out.println(b + " greater number");
        }
        
     dl.close();

    }
}
