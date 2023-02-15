import java.util.Scanner;
class TrafficLight {
   public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
   int time=0;
            System.out.println("Enter the time to check the traffic:");
  time=s.nextInt();
     if(time>=9&&time<=12)
     {
       System.out.println("It has heavy traffic");
     }
     else if(time<=4&&time>12)
     {
       System.out.println("It has low traffic");
     }
     else{
       System.out.println("There is no traffic");
     }
   }
}