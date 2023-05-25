/*Write a program that takes an input number from the user and prints whether it is a multiple of 5 or not*/
import java.util.Scanner;
class MaltipleOf5{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num=input.nextInt();
    if(num%5==0){
      System.out.println("this number is devisible by 5 :");
    }else{
      System.out.println("this number is not devisible by 5 :");
    }
  }
}