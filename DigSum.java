import java.util.*;


class DigSum
{

 public static void main(String[] args)
 {

int a,i,r,n,s=0;

 System.out.println("Enter a number:");
 
 Scanner hell= new Scanner(System.in);
 a= hell.nextInt();
n=a;

while(n>0){
r=n%10;
n= n-r;
n=n/10;
s=s+r;
}
 System.out.println("The sum of all digits is "+s);
System.out.println();
  
 }
}