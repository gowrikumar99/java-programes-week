/*Write a program that takes an integer input from the user and prints "Even" if the number is even, and "
Odd" if the number is odd.*/
import java.util.Scanner;
class EvenNumberOrOddNumber{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("enter the number : ");
    int num=input.nextInt();
    if(num%2==0){
      System.out.println("this is even number : ");
    }else{
      System.out.println("this is odd number : ");
    }
  }
}