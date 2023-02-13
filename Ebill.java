import java.util.*;

class Ebill {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        float units;
        float bill;
      System.out.println("Enter the  number : ");
        units = s.nextInt();

        if (units <= 50) {
            bill = units * 0.50f;
        } else if (units > 50 && units <= 150) {
            bill = units * 1.23f;
        } else if (units > 150 && units <= 250) {
            bill = units * 1.90f;
        } else {
            bill = units * 2.34f;
        }

        System.out.println("Bill is : " + bill);
    }
}