import java.util.Scanner;

class Studiep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int p = 0, i = 0, e = 0, total = 0;
        char grade = 'N';
        System.out.println("Enter Project marks");
        p = s.nextInt();
        System.out.println("Enter Internal marks");
        i = s.nextInt();
        System.out.println("Enter External marks");
        e = s.nextInt();

        if (p < 50 && i < 50 && e < 50) {
            if (p < 50) {
                System.out.println("failed in Project with " + p  );
            }
            if (i < 50) {
                System.out.println("failed in Internals " + i );
            }
            if (e < 50) {
  System.out.println("failed in External " + e );
            }
        } else {
            int project = 0, internal = 0, external = 0;

            project = (70 * project) / 100;
            internal = (10 * project) / 100;
            external = (20 * project) / 100;

            total = project + internal + external;

            if (total >= 90) {
                grade = 'A';
            } else if (total >= 70 && total < 90) {
                grade = 'B';
            } else {
                grade = 'C';
            }
            System.out.println("You are assigned grade " + grade);
        }
    }
}