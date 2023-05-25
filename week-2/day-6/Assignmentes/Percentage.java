/*1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off.
  Allow user to input the marks from the terminal.
  Sample Input:
        maximum_marks=500
        total_marks=348
  Expected Output:
        percentage= 70%
      
*/
 
class Percentage{
  public static void main(String[] args){
    double phy=50,eng=60,math=70,soc=56,bio=90;
    double percentage=((phy+eng+math+soc+bio)/500)*100;
    System.out.print("percentage :"+percentage);
    
  }
}