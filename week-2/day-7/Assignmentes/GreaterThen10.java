import java.util.Scanner;
class GreaterThen10{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num=input.nextInt();
    if(num>10){
      System.out.println("this is greaterthen 10  ");
    }else{
      System.out.println("this is lessthen 10  ");
    }
  }
}