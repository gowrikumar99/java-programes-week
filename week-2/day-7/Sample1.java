import java.util.Scanner;
class Sample1{
  public static void main(String[] args){
   Scanner input=new Scanner(System.in);
    System.out.println("Enter your name : ");
    String Name=input.nextLine();
    System.out.println("Enter your Number : ");
    int Rollnumber=input.nextInt();
    System.out.println("Enter your grade : ");
     char grade=input.next().charAt(0);
    System.out.println("Enter your percentage : ");
     float percentage=input.nextFloat();
    System.out.println("Enter your material states : ");
    boolean material_states=input.nextBoolean();
     System.out.print("Enter your Address : ");
    String Address=input.next();
    System.out.println("Enter your Dob : ");
    String dob=input.next();
    System.out.println("this is my name :" +Name);
    System.out.println("this is my Rollnumber :"+ Rollnumber);
    System.out.println("this is my grade:"+grade);
    System.out.println("this is my percentage :"+percentage);
    System.out.println("this is my boolean :"+material_states);
    System.out.println("this is my dob:"+grade);
    System.out.println("this is my Adress:"+Address);
  }
  
}