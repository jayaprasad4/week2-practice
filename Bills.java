import java.util.Scanner;
class Bills{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int sal,bill1,bill2,bill3;
    int total=0;
    int per=0;
    System.out.println("enter salary");
    sal=s.nextInt();
    System.out.println("enter bill1");
    bill1=s.nextInt();
    System.out.println("enter bill2");
    bill2=s.nextInt();
    System.out.println("enter bill3");
    bill3=s.nextInt();
    total=bill1+bill2+bill3;
    per=(total/100)*sal;
    System.out.println("total"+total);
    System.out.println("percentage"+per);
    
      }
}