//maximum three numbers
 //WAP to find maximum between three numbers.
import java.util.Scanner;
class MaximumThree{
  public static void main(String[] args){
    Scanner input=new Scanner (System.in);
    System.out.println("Enter the number1 : ");
    int num1=input.nextInt();
     System.out.println("Enter the number2 : ");
    int num2=input.nextInt();
     System.out.println("Enter the number3 : ");
    int num3=input.nextInt();
    if(num1>num2 && num1>num3){
      System.out.println("this is num1 is greatest : +num1");
    }else if(num2>num3){
      System.out.println("this is num2 is greatest : "+num2);
    }else{
      System.out.println("this is num3 is greatest : "+num3);
    }
  }
}