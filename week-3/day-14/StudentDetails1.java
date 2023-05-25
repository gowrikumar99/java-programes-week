//student details
import java.util.Scanner;
class StudentDetails1{
  public static void studentDetails(String name,int rollnumber){
    System.out.println("student name is name"+name);
    System.out.println("student rollnumber"+rollnumber);
  }public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    System.out.println("enter the name");
    String name=input.next();
    System.out.println("Enter the rollnumber");
    int rollnumber=input.nextInt();
    studentDetails(name,rollnumber);
    }
  }
  
