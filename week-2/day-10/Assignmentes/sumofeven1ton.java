import java.util.Scanner;
class sumofeven1ton{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("enter n value");
    int n=input.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
      if(i%2==0){
        sum=sum+i;
        System.out.println(sum);
      }
    }
    
  }
}