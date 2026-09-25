import java.util.Scanner;

public class CheckOddorEven{
    public static void main(String [] args) {
        Scanner scanner = new  Scanner(System.in);

        
        System.out.print("Enter your input :");
        int a =scanner.nextInt();

        if(a%2==0){
            System.out.println(  a + " is  even number");
        }
        else{
            System.out.println(a + " is  odd number" );
        }
    }

}

