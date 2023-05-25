import java.util.Scanner;
class whileloop
  {
    public static void main(String args[])
    {      
   Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
      int number=sc.nextInt();
      System.out.println("the numbers are");
      int i=1;
      while(i<=50)
        {
          System.out.print(i+" ");
          i++;
        }
     
    }
  }