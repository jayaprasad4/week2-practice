import java.util.*;

class Salarygros {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int basesal;
    int hra;
    int da;
    int gs;

    System.out.println("enter basesal");
    basesal = s.nextInt();
    hra = (basesal * 89) / 100;
    da = (basesal * 90) / 100;
    gs = basesal + hra + da;
    System.out.println("gross salary" + gs);

  }

}