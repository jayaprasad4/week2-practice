import java.util.*;
class Totalavg {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int sub1=0;
    int sub2=0;
    int sub3=0;
    int total=0;
    int avg=0;
    System.out.println("Enter subject 1 marks");
    sub1=s.nextInt();
    System.out.println("Enter subject 2 marks");
    sub2=s.nextInt();
    System.out.println("Enter subject 3 marks");
    sub3=s.nextInt();
    total=sub1+sub2+sub3;
    avg=total/3;
     System.out.println("subjects total marks"+total);
    System.out.println("avg marks"+avg);
    
    
  }
}