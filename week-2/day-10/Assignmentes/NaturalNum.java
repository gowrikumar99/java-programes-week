//1 to N natural numbers
import java.util.Scanner;
class NaturalNum{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("enter the value n : ");
    int n=input.nextInt();
    int i=1;
    while(i<=n){
      System.out.println(i+"\t");
      i++;
    }
  }
}