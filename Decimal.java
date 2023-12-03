import java.lang.*;
import java.util.*;

class Decimal{

public static void main(String [] args){
double b,r,d=0,i=0;
System.out.println("Enter a binary number");
Scanner hell = new Scanner(System.in);
b= hell.nextInt();
while(b>0){
r=b%10;
d=d+r*Math.pow(2,i);
i++;
b=b-r;
b=b/10;
 }
System.out.println("The decimal number is "+d);
 }
}
