/*(Write a program that takes two integer inputs from the user and prints "Equal" if the two numbers are eq
ual, and "Not Equal" if they are not equal. */
import java.util.Scanner;
class EqualNumberOrNot{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the number1 :");
    int num1=input.nextInt();
    System.out.print("Enter the number2 :");
    int num2=input.nextInt();
  if(num1==num2){
  System.out.println("this is equal numbers");
  }else if(num1!=num2){
  System.out.println("these numbers are not equal : ");
  }
  }
}