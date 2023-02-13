import java.util.Scanner;
class Voting{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int age;
    System.out.println("Enter age");
    age=s.nextInt();
    if(age>18)
    {
      System.out.println("eligible for voting");
    }else{
      System.out.println("not eligible");
    }
  }
}