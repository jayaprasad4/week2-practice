import java.util.Scanner;
class SimpleIntrest{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    double amount=0,rate,interest,total=0,period;
    System.out.println("enter the amount");
    amount=s.nextInt();
    System.out.println("annual rate:");
    rate=s.nextInt();
    System.out.println("Period unit 1.Day 2.week 3.month 4.yearly");
    period=s.nextInt();
    if(period==1){
      interest=((amount*rate)/100)/365;
      total=amount+interest;
      System.out.println("Interest earned:" +interest);
      System.out.println("principal amount: " +amount);
      System.out.println("Total value :" +total );
    }
    else if(period==2){
      interest=((amount*rate)/100)/52;
      total=amount+interest;
      System.out.println("Interest earned:" +interest);
      System.out.println("principal amount: " +amount);
      System.out.println("Total value :" +total );
    }
    else if(period==3){
      interest=((amount*rate)/100)/12;
      total=amount+interest;
      System.out.println("Interest earned:" +interest);
      System.out.println("principal amount: " +amount);
      System.out.println("Total value :" +total );
    }
    else{
    interest=(amount*rate)/100;
    total=amount+interest;
    System.out.println("Interest earned:" +interest);
    System.out.println("principal amount: " +amount);
    System.out.println("Total value :" +total );
  }
  }
}
