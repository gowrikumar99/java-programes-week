//check alphabet or not
import java.util.Scanner;
class AlphabetOrNot{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number : ");
    char ch=input.next().charAt(0);
    if((ch>'a'&&ch>'z')||(ch>'A'&&ch>'Z')){
      System.out.println("this is alphabe");
    }else{
       System.out.print("these are not alphabetes");
    }
  }
}