import java.util.*;
public class Armstrong {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a number");
      int num=s.nextInt();
        int temp=num;
        int power=0;
 
        
        
        while (num > 0){
          int rem = num % 10;
            power = (power) + (rem * rem * rem);
            num = num / 10;
        }
      
        if (temp == power) {
            System.out.println(" It is Armstrong");
        }
        else {
            System.out.println("It is not an Armstrong");
        }
    }
}