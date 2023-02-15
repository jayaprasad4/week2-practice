import java.util.Scanner;
class GradeCal {
   public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int marks;
       System.out.println("Enter the marks");
  marks=s.nextInt();//suppose marks interms of 100
     if(marks>90)
     {
       System.out.println("Grade A");
     }
     else if(marks>60)
     {
         System.out.println("Grade B");
     }
     else if(marks>35)
     {
         System.out.println("Grade C");
     }
     else
     {
         System.out.println("Grade F");
     }
   }
}