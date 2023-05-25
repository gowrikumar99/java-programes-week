//basicsalary calculation
import java.util.Scanner;
class BasicSalary{
  public static void main(String[] args){
    Scanner gowri=new Scanner(System.in);
    System.out.println("Enter basicsalary :");
    double salary=gowri.nextDouble();
    if(salary<=10000){
      double hra=salary*0.8;
      double da=salary*0.2;
      double grasssalary=(salary+hra+da);
      System.out.println("this is grasssalary" +(salary+hra+da));
    }else if(salary<=20000){
       double hra=salary*0.9;
      double da=salary*0.25;
      double grasssalary=(salary+hra+da);
      System.out.println("this is grasssalary" +(salary+hra+da));
    }else if(salary>20000){
      double hra=salary*0.95;
      double da=salary*0.3;
      double grasssalary=(salary+hra+da);
      System.out.println("this is grasssalary" +(salary+hra+da));
    }
  }
}