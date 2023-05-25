import java.util.Scanner;
class RPS
{
  public static void main(String args [])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the user input R or P or S");
    char user=sc.next().charAt(0);
    System.out.println("enter the computer input R or P or S");
    char computer=sc.next().charAt(0);
    if((user=='R')&&(computer=='S'))
    {
      System.out.println("user wins");
    }
    else if((user=='S')&&(computer=='R'))
    {
      System.out.println("computer wins");
    }
    else if((user=='R')&&(computer=='P'))
    {
      System.out.println("computer wins");
    }
    else if((user=='P')&&(computer=='R'))
    {
      System.out.println("user wins");
    }
    else if((user=='P')&&(computer=='S'))
    {
      System.out.println("computer wins");
    }
    else if((user=='S')&&(computer=='P'))
    {
      System.out.println("user wins");
    }
    else
    {
      System.out.println("invalid input");
    }
  }
}
