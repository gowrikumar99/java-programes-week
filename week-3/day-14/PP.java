import java.util.ArrayList;
import java.util.List;
public class PP{
  public static void main(String[] args){
    int n=10;
    List<Integer>primes=new ArrayList<>();
    int num=2;
    while(primes.size()<n){
      boolean isprime=true;
      for(int i=2;i<=Math.sqrt(num);i++){
        if(num%i==0){
          isprime=false;
          break;
        }
      }
      if (isprime){
        primes.add(num);
      }
      num++;
    }
    System.out.println(primes);
  }
}