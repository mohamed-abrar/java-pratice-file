import java.util.Scanner;
public class brek {
      public static void main(String [] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.print("Enter  number :");
        int data = sc.nextInt();

        while(data >= 0){
          if(data % 10 ==0){
            System.out.println(data);
            break;
          }
          data--;
         
        }



        
      }
}
