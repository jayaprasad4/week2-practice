import java.util.Scanner;
class Posneg{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num;
    System.out.println("Enter a number");
      num=s.nextInt();
    if(num>0)
    {
     System.out.println("number is positive"); 
    }
    else if(num<0)
      {
      System.out.println("number negative");
      }
    else if(num==0)
    {
      System.out.println("zero");
    }
      
  }
}