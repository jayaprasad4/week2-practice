import java.util.*;
class Palindrome{  
 public static void main(String args[]){
   Scanner s=new Scanner(System.in);
   
  int r,sum=0,temp;    
  int num;
   System.out.println("Enter the number");
   num=s.nextInt();
   temp=num;    
  while(num>0){    
   r=num%10;    
   sum=(sum*10)+r;    
   num=num/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  