import java.util.*;

class Factorial
{
 public static void main(String[] args)
 {
int f=1,i,n;
 System.out.println("Enter a number:");
  Scanner hell= new Scanner(System.in);
  n= hell.nextInt();
for(i=1;i<=n;i++){
  f=f*i;
  }
System.out.println("The factorial of "+n+" is "+f);
 }
}