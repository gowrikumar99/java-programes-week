//1 to 100 odd numbers using while loop
import java.util.Scanner;
class Odd1To100
{  
    public static void main(String args[])   
    {
      Scanner input=new Scanner(System.in);
          
        System.out.print("List of even numbers from 1 to 100:");  
      int n=100, i=1;  
        for(i=1;i<=n;i++)   
        { 
            if ( i%2 != 0 )
            {
                System.out.print(i + " ");
            }
          i++;
        }
    }  
}
