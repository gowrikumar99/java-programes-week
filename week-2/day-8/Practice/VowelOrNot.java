// WAP to check whether a character is alphabet or not.
import java.util.Scanner;
class VowelOrNot{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the anykeyword : ");
    char ch=input.next().charAt(0);
    if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
      System.out.println("this is vowel : ");
      }else{
      System.out.println("this is not vowel");
      }
    }
}