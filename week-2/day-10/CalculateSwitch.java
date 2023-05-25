//CalculateSwitch case
import java.util.Scanner;
class CalculateSwitch{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("this is num1 value");
    double num1=input.nextInt();
     System.out.println("this is num2 value");
    double num2=input.nextInt();
    System.out.println("enter the operator +,-*.%,/");
    char operator=input.next().charAt(0);
    double result;
      switch (operator)
        {
          case '+':
            result=num1+num2;
            System.out.println("result"+result);
            break;
          case '-':
            result=num1-num2;
            System.out.println("result"+result);
            break;
          case '*':
            result=num1*num2;
            System.out.println("result"+result);
            break;
          case '%':
            result=num1%num2;
            System.out.println("result"+result);
            break;
           
        }
     
    }
  }
    
    
    
    
