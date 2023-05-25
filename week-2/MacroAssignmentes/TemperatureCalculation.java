//temperatureOrForenheat
import java.util.Scanner;
class TC
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter c or f to convert the temperature");
      char ch=sc.next().charAt(0);
      if((ch=='c'||ch=='C'))
      {
        System.out.println("Enter the temperature in celcius");
       double celcius=sc.nextDouble();
       double fahrenheit = (celcius*1.8) + 32;
        System.out.println("Converted temperature in fahrenheit is "+fahrenheit);
      }
      else if((ch=='f'||ch=='F'))
      {
        System.out.println("Enter the temperature in fahrenheit");
        double fahrenheit=sc.nextDouble();
        double celcius= (fahrenheit - 32) * 5/9;
        System.out.println("Converted temperature in celcius is "+celcius);
      }
       else
      {
        System.out.println("Enter correct option to covert the temperature");
      }
    }
  }
