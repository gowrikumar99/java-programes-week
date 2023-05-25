//week
import java.util.Scanner;
class week{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("enter the day :");
    //int day=input.nextInt();
    int day=8;
    switch(day){
      case 1:
      System.out.println("this is monday");
      break;
      case 2:
      System.out.println("this is thuesday");
      break;
      case 3:
      System.out.println("this is wensday");
      break;
      case 4:
      System.out.println("this is thursday");
      break;
      case 5:
      System.out.println("this is friday");
      break;
      case 6:
      System.out.println("this is saterday");
      break;
      case 7:
      System.out.println("this is sunday");
      break;
      default:
      System.out.println("this invalid day");
    
    }
  }
}