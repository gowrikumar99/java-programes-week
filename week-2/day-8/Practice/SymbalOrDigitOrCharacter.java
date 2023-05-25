//WAP to input any character and check whether it is alphabet, digit    or special character.
import java.util.Scanner;
class SymbalOrDigitOrCharacter{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the any character : ");
    char ch=input.next().charAt(0);
    if(ch>'a'&&ch<'z'||ch>'A'&&ch<'Z'){
      System.out.println("this is character");
    }else if(ch>='0' && ch<='9'){
      System.out.println("this is digit");
    }else{
      System.out.println("this is symbal");
      
    }
  }
}