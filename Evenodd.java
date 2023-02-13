import java.util.Scanner;
class Evenodd{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num;
    System.out.println("enter a number");
    num=s.nextInt();
    if(num==0)
    {
      System.out.println("zero");
    }
    else if(num%2==0)
    {
      System.out.println("number is even"+num);
    }else{
      System.out.println("number is odd");
    }
    
  }
}