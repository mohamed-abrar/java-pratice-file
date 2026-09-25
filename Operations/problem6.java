package Operations;

import java.util.Scanner;

public class problem6 {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter unit :");
    double unit  = sc.nextDouble();
    double price = 0;
    if(unit <= 100){
        price = unit * 0;}
    else if(unit <=200){
        price = unit * 10;
    }
    else if(unit <=300){
        price = unit * 20;}
    else if(unit <= 400){
        price = unit * 30;}
    else{ 
        price = unit * 40;}

    
    if(price == 0){
        System.out.println(" This Your  EB  Bill not genarate \n Good \n Save Energy Save Earth");
    }
    else{
        System.out.println("Bill Amount : $ " + price);}
    
    sc.close();
 }
}
