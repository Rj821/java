import java.util.*;

 class FLSum
 {
   static int a,f,l,n,s;
   public static void main(String args[])
   {  
  
    System.out.println("Enter a number:");
  Scanner hell= new Scanner(System.in);
  a= hell.nextInt();
  n=a;
  l=n%10;
  System.out.println("The last digit of the number is "+l);
  s=l;
  while(n>9){
    n= n-l;
    n=n/10;
    l= n%10;
  }
  System.out.println("The first digit of the number is "+n);
 s=s+n;
System.out.println("The sum of first and last digit is "+s); 

int count=0,sp=0,i;
n=a;
l=n%10;
while(n>0){
    n= n-l;
    n=n/10;
  for(i=1;i<=l;i++){
   if(l%i==0){
    count++;
   }
  }
   if(count==2){
  sp= sp+l;
  count=0;
   }
else{
count=0;
}
    l= n%10;
  }
System.out.println("The sum of prime numbers in the input is "+sp);
  }
 }