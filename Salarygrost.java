import java.util.Scanner;

class Salarygrost {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
float sal = 0, da = 0, hra = 0, gs = 0;
System.out.println("enter basesalary ");
sal = s.nextFloat();
      if (sal <= 10000) {
            hra = (67 * sal) / 100;
            da = (78 * sal) / 100;
            gs =sal+hra+da;
        } else if (sal > 10000 && sal < 20000) {
            hra = (70 * sal) / 100;
            da= (80 * sal) / 100;
            gs = sal+hra+da;
        } else {
            hra = (73 * sal) / 100;
            da = (87 * sal) / 100;
          gs = sal+hra+da;
        }

        System.out.println("Gross Salary" + gs);

    }
}