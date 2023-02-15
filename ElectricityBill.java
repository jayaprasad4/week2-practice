import java.util.Scanner; 
class ElectricityBill { 
   public static void main(String args[]){   
    int unit;
      int punit;
        Scanner s=new Scanner(System.in);
       int n;
    System.out.println("enter the number of units");
     unit=s.nextInt();
          System.out.println("enter the previous units");
           punit=s.nextInt();
         double bill=0;
         
        if(punit==0){
           if(unit<=100){
             bill=unit*1.20;
           }
         else if(unit<=300){
             bill=100*1.20+(unit-100)*2;
          }
     else {
          bill=100*1.20+200 *2+(unit-300)*3;
           }
          System.out.println("Bill to pay is: " + (bill*10)/100); 
           
        }
          
          else{
            n=punit+unit;
            if(n<=100){
  bill=n*1.20;
            }
         else if(n<=300){
  bill=100*1.20+(n-100)*2;
          }
     else {
  bill=100*1.20+200 *2+(n-300)*3;
            }
            System.out.println("Bill to pay : " + (bill*10)/100); 
      
          }
              
   } 
}