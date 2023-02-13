import java.util.*;
public class Leapyear {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int year;
    System.out.println("enter a year");
    year=s.nextInt();

    
if(year % 4 == 0&&year % 100 != 0 || year % 400 == 0)
{
      System.out.println(" it is a leap year"+year);
}
    else {
      System.out.println("  not  leap year"+year);
    }
  }
}