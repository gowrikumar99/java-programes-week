
/*5.Write a program that takes two input numbers from the user and prints whether the first number is div
isible by the second number.*/
import java.util.Scanner;
class OneNumberDivisibleByAnotherNumber{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num1=input.nextInt();
    System.out.println("Enter the number2 : ");
    int num2=input.nextInt();
    if(num1%num2==0){
      System.out.println("this is divisible by other number : ");
      }else{
      System.out.println("this is not divesible other number : ");
      }
  }
}