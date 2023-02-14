import java.util.Scanner;
 
public class StrongNum {
    public static void main(String args[])
    {
        int num,onum,rem,fact,i,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num=in.nextInt();
        onum=num;
        while (num>0)
        {
            rem=num%10;
            fact=1;
            for(i=1;i<=rem;i++){
                fact*=i;
            }
            sum+=fact;
            num=num/10;
        }
        if (sum == onum) {
            System.out.println("strong number"+onum);
        } else {
             System.out.println("not strong number"+onum);
        }
    }
}