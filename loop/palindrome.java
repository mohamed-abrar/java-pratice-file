package loop;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc  = new  Scanner(System.in);

        System.out.print("Enter  name :");
        String n = sc.nextLine();
        String rev="  ";
        for(int i=n.length()-1;i>=0; i--){
            rev+=n.charAt(i);
        }
            System.out.println(rev);
        }
    }
