//dout program
import java.util.*;
class EvenOdSum{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num;
    System.out.println("enter a number");
    num=s.nextInt();
    int esum=0,osum=0;
    while(num<=10)
    {
      if(num%2==0)
      {
        esum=esum+num;
        num=num+1;
      }
else{
  osum=osum+num;
  num=num+1;
}
      System.out.println("oddsum"+esum);
      System.out.println("Evensum" +osum);
    }
  }

  }
