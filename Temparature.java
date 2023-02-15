import java.util.Scanner;

public class Temparature
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        double f = s.nextDouble();
        System.out.println("Enter temparature in Celsius");
        double g=s.nextDouble();
        double c = (f - 32) * 5.0 / 9.0;
        double d=((c*9)/1.8)+32;
        System.out.println(f + " degree Fahrenheit = " + c + " degree Celsius");
        System.out.println(g + " degree celsius = " + d + " degree farenheit");
      
    }
}