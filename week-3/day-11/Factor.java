import java.util.Scanner;
class Factor{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number:");
    int num=input.nextInt();
    int i=1;
    
    for(i=1;i<=120;i++){
      if(num%i==0){
        System.out.println(i);
      }
      
    }
  }
}