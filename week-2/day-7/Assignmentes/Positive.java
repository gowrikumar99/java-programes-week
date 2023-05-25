//this is positive number or negetive number
import java.util.Scanner;
class Positive{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num=input.nextInt();
    if(num>0){
      System.out.println("this is positive number :" );
    }else if(num<0){
      System.out.println("this is negetive number :");
    }else{
      System.out.println("this is zero");
    }
  }
}