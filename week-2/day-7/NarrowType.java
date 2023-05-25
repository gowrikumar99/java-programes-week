//narrowing typecasting
import java.util.Scanner;
class NarrowType
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
      double number=sc.nextDouble();
      int value=(int)number;
      System.out.println(value);
                        
    }
  }