//age find out mager or miner

import java.util.Scanner;
class AgeFindout
  {
public static void main(String args[])
    {
      
      Scanner gowri=new Scanner(System.in);
      System.out.println("ENTER DATE OF BIRTH YEAR");
      int dob=gowri.nextInt();
      int age=2023-(dob);
      System.out.println("tHE AGE IS :"+age);
      if(age>=18)
      {
      System.out.println("The age is :"+age+" "+":MAJOR");
      }
      else if(age<18)
      {
      System.out.println("The age is :"+age+" "+":MINOR");
      }
       else 
      {
      System.out.println("Enter valid age");
      }
     }
  }