//traffic signal
import java.util.Scanner;
class Traffic{
  public static void main(String[] args){
    Scanner gowri=new Scanner(System.in);
      System.out.println("Enter The Time 24 hrs");
      int time=gowri.nextInt();
      if((time>=6)&&(time<=8))
      {
        System.out.println("The Signal is Green");
      }
      else if((time>=8)&&(time<=10))
      {
        System.out.println("The Signal is Red");
      }
      else if((time>=10)&&(time<=13))
      {
        System.out.println("The Signalis Orange");
      }
      else if((time>=13)&&(time<=17))
      {
        System.out.println("The Signal is Green");
      }
      else if((time>=17)&&(time<=21))
      {
        System.out.println("The Signalis Orange");
      }
      else if((time>=21)&&(time<=5))
      {
        System.out.println("The Signal is Green");
      }
      else{
      System.out.println("invalid signal");
    }
    
  }
}