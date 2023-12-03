import java.util.*;
import java.math.*;

class QRoot
{
 public static void main(String[] args)
 {
double
 a,b,c,b2,a4c,d,x1,x2;
 System.out.println("Enter a number for a:");
  Scanner hell= new Scanner(System.in);
  a= hell.nextDouble();
 System.out.println("Enter a number for b:");
  b= hell.nextDouble();
System.out.println("Enter a number for c:");
  c= hell.nextDouble();
  b2=b*b;
  a4c=4*a*c;
  d=b2-a4c;
  d= Math.sqrt(d);
  a=2*a;
  x1=-b+d;
  x1=x1/a;
  x2=-b-d;
  x2=x2/a;
System.out.println("The values of x are "+x1+" and "+x2);
System.out.println("The values of alpha is "+-b/a);
System.out.println("The values of beta is "+c/a);

  }
 }