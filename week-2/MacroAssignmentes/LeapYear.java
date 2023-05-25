//chech leapyear or not
import java.util.Scanner;
class LeapYear{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter year :");
    int year=input.nextInt();
    boolean leaf=false;
    if((year%4==0&&year%100!=0) || (year%400==0)){
      System.out.println("this is leapyear :" +year);
    }else{
      System.out.println("this is not a leapyear" +year);
    }
  }
}