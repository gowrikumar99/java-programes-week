class Ternary{
  public static void main(String[] args){
    int a=100,b=200,c=300;
    int max=(a>b &&a>c) ? a:(b>c ? b:c);
    System.out.print("maximum value : " +max);
  }
}