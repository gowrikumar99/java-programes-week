// Tax calculation
import java.util.Scanner;
class SalaryTaxNet{
  public static void main(String[] args){
    Scanner gowri=new Scanner(System.in);
    System.out.println("Enter a monthely salary : ");
    double basicsalary=gowri.nextDouble();
    if(basicsalary<=100000){
      //double hra=basicsalary*0.5;
      //double da=basicsalary*0.2;
      double tax=0;
      double netsalary=basicsalary-tax;
      System.out.println(netsalary);
    }else if(basicsalary<=600000){
      //double hra=basicsalary*0.6;
      //double da=basicsalary*0.3;
      double tax=basicsalary*0.1;
      double netsalary=basicsalary-tax;
      System.out.println(netsalary);
    }else{
      //double hra=basicsalary*0.7;
      //double da=basicsalary*0.2;
      double tax=basicsalary*0.2;
      double netsalary=basicsalary-tax;
      System.out.println(netsalary);
    }
  }
}