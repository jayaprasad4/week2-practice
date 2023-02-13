import java.util.*;
class Weeknum{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num=0;
    System.out.println("Enter week number");
    num=s.nextInt();
    if(num==1)
			System.out.println("Sunday");
		else if(num==2)
			System.out.println("Monday");
		else if(num==3)
			System.out.println("Tuesday");
		else if(num==4)
			System.out.println("Wednesday");
		else if(num==5)
			System.out.println("Thursday");
		else if(num==6)
			System.out.println("Friday");
		else if(num==7)
			System.out.println("Saturday");
		else
			System.out.println("Enter only between1 to 7");
    
  }
}