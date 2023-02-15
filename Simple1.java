import java.util.Scanner;
import java.util.Scanner;
class Simple1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter principal amount");
double amount=sc.nextInt();
System.out.println("enter annual rate");
int ann=sc.nextInt();
double intrest=(amount*ann)/100;

  System.out.println("choose any option 1.day   2.months 3.week  4.annual");
    int choice=sc.nextInt();
  if(choice==1){
    double day=intrest/365;
//System.out.println("intrest earned  "+day);
//System.out.println("principal amount"+amount);
//double total=day+amount;
//System.out.println("total value"+total);
  }
else if(choice==2){
    double month=(intrest*30)/365;
//System.out.println("intrest earned  "+month);
//System.out.println("principal amount"+amount);
//double total=month+amount;
//System.out.println("total value"+total);
  }
  else if(choice==3){
    double week=(intrest*7)/365;
//System.out.println("intrest earned  "+week);
//System.out.println("principal amount "+amount);
//double total=week+amount;
//System.out.println("total value  "+total);
  }
  else if(choice==4){   
System.out.println("intrest earned  "+intrest);
System.out.println("principal amount"+amount);
double total=intrest+amount;
System.out.println("total value  "+total);
  }
  else{
    System.out.println("select correct choice");
  }

}
}
