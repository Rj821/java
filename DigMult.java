import java.util.*;


class DigMult
{

 public static void main(String[] args)
 {

int a,i,r,n,p=1;

 System.out.println("Enter a number:");
 
 Scanner hell= new Scanner(System.in);
 a= hell.nextInt();
n=a;

while(n>0){
r=n%10;
n= n-r;
n=n/10;
p=p*r;
}
 System.out.println("The product of all digits is "+p);
System.out.println();
  
 }
}