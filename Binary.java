import java.lang.*;
import java.util.*;

class Binary{

public static void main(String [] args){
double b=0,i=0,j=0,n,r;
System.out.println("Enter a number");
Scanner hell = new Scanner(System.in);
n= hell.nextInt();
while(n>=1){
r=n%2;
if(r==0){
b=b+9*Math.pow(10,i);
i++;
}
else{
b=b+Math.pow(10,j);
i++;
j=i;
}
n=n-r;
n=n/2;
  }
System.out.println(b);
 }
}