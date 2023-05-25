// calculator app
import java.util.Scanner;
class Calculator1{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter value num1 :");
    int num1=input.nextInt();
     System.out.println("Enter value num2 :");
    int num2=input.nextInt();
     System.out.println("Enter the result:");
    char ch=input.next().charAt(0);
    if(ch=='+')
    {
      System.out.println("Addition if two numbers :" +(num1+num2));
    }else if(ch=='/')
    {
      System.out.println("division value is : " + (num1/num2));
    }else if(ch=='*')
    {
      System.out.println("maltiplication value is : " +  (num1*num2));
    }else if(ch=='%')
    {
      System.out.println("modulus value is : " +  (num1%num2));
    }else if(ch=='-')
    {
      System.out.println("substractionis value is: " +  (num1-num2));
    }else{
      System.out.println("Invalid operation");
    }
  }
}