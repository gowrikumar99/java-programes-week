//divisibleby 11 and 5
import java.util.Scanner;
class DivisibleNumber
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
     System.out.println("Enter the number");
        int num=s.nextInt();
        if((num%5==0) && (num%11==0))
        {
        System.out.print("it is divisible by 5 and 11");
        }
      else
      {
        System.out.println("it is not divisible by 5 and 11");
      }
    }
  }