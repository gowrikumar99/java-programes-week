//duplicates remove
//duplicate elements from array
import java.util.Scanner;
class ArrayEx
  {
    public static void main(String args[])
    {
      int a[]={2,3,5,2,4,5,7};
      System.out.println("duplicate elements are");
      for(int i=0;i<a.length;i++)
        {
          for(int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
              {
                System.out.println(a[i]+" ");
              }
            }
        }
    }
  }