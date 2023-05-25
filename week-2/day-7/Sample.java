import java.util.Scanner;
class Sample{
  public static void main(String[] args){
    int a=10,b=30;
    Scanner input=new Scanner(System.in);
    System.out.print("enter the a value:");
    a=input.nextInt();
    System.out.print("enter the b value:");
    b=input.nextInt();
    int c=a+b;
    System.out.println("this is output :"+c);
    
  }
}