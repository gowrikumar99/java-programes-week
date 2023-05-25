//Maximum Two numbers check what is begger
import java.util.Scanner;
class MaximumTwo{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the num1 : ");
    int num1=input.nextInt();
     System.out.println("Enter the num2 : ");
    int num2=input.nextInt();
    
    if(num1>num2){
      System.out.println("this number is greatest " +num1);
      }else{
      System.out.println("this is greatest : " +num2);
      }
  }
  
}