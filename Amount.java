import java.util.Scanner;

class Amount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
int amount = 0, n1 = 0, n2 = 0, n3 = 0;
        System.out.println("Enter Amount");
        amount = s.nextInt();

        if (amount % 100 != 0 && amount <= 0) {
            System.out.println("Invalid Amount");
        } else {
            if (amount >= 500) {
                n1 = amount / 500;
                amount = amount % 500;
            } else if (amount >= 200 && amount < 500) {
                n2 = amount / 200;
                amount = amount % 200;
            } else {
                n3 = amount / 100;
                amount = amount % 100;
            }
            System.out.println("Five Hundreds: " + n1);
            System.out.println("Two Hundreds: " + n2);
            System.out.println("Hundreds: " + n3);
        }
    }
}
