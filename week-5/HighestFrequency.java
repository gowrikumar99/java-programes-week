//WAP to find highest frequency character in a string.
import java.util.Scanner;
class HighestFrequency
  {
    public static void frequency(String str)
    {
      char ch[]=str.toCharArray();

 

      int size=ch.length;

 

      boolean b[] = new boolean [size];

 

       int count; 

 

       for(int k=0;k<size;k++)
        {
          b[k]=false;
        }

 

      
      
     int max=0;
      char temp='\u0000';
      
      for(int i=0;i<size;i++)
        {
          count=1;
          if( b[i]==true)
          {
          continue;
          }
        for(int j=i+1;j<size;j++)
          {
            if(ch[i]==ch[j])
            {
              count++;
              b[j]= true;

 

            }
          }
System.out.println(ch[i]+ " = = "+ count);
          
          if(count>max)
          {
            
            max=count;
            temp=ch[i];
            
            
          }
        }
      System.out.println("the high freqency char is " + temp + " frequency is " + max);
}
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String str=sc.nextLine();
      frequency(str);
      
    }
  }   