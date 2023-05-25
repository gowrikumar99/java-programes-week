//electricity bill
import java.util.Scanner;
class ElectricityBill{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a bill");
    int unit=input.nextInt();
    int amount=0;
    if(unit<100){
      amount=unit*5;
      System.out.println("bill amount= "+amount);
    }else if(unit<200){
      amount=unit*10;
      System.out.println("bill amount= "+amount);
    }else{
      amount=unit*20;
      System.out.println("bill amount="+amount);
    }
  }
}