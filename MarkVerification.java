import java.util.Scanner;

public class MarkVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  ur  mark");
        int mark = sc.nextInt();

       if(mark >=90)
            System.out.println("Grade C");
        else if(mark >=80)
            System.out.println("Grade B");
        else  
            System.out.println("Prepere  Well");
    }    
}
