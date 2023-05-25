// logical operator &,|,^,!
class Logical{
  public static void main(String[] args){
    int x=25;
    int y=30;
    int z=35;
    System.out.println((x>y)&&(y>z));
    System.out.println((x<y)&&(y<z));
    System.out.println((x<y)||(y>z));
    System.out.println((x>y)^(y<z));
    System.out.println((x>y)!=(y>z));
    System.out.println((x<y)!=(y<z));
  }
}