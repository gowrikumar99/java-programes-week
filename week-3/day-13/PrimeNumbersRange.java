import java.util.Scanner;
class P{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number ");
    int num=input.nextInt();
  
    for(int i=50;i<=100;i++){
      int count=0;
      for(int j=1;j<=i;j++){
        if(i%j==0){
          count++;
          }
      }
      if(count==2){
        System.out.println (i+"");
        
      }
    }
    }
  }