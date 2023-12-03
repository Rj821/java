import java.util.*;

 class FL
 {
   static int a,f,l;
   public static void main(String args[])
   {  
  
    System.out.println("Enter a number:");
  Scanner hell= new Scanner(System.in);
  a= hell.nextInt();
  l=a%10;
  System.out.println("The last digit of the number is "+l);
  while(a>9){
    a= a-l;
    a=a/10;
    l= a%10;
  }
  System.out.println("The first digit of the number is "+a);
   }
 }