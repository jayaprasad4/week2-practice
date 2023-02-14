import java.util.*;
class Factorial{  
 public static void main(String args[]){  
   Scanner s=new Scanner(System.in);
  int i,f=1;  
  int num;
   System.out.println("Enter a number");
   num=s.nextInt();
  for(i=1;i<=num;i++){    
      f=f*i;    
  }    
  System.out.println("Factorial of "+num+" is: "+f);    
 }  
}  