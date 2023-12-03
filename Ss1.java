import java.util.*;

class Ss1{
 
public static void main(String[] args){
double i,n,s,s1=0,x;
Scanner hell= new Scanner(System.in);
System.out.println("Enter a number:");
x=hell.nextInt();
System.out.println("Enter number of terms:");
n=hell.nextInt();
for(i=1;i<=n;i++){
  s=Math.pow(x,i);
  s=Math.pow(-1,i-1)*s/i;
  s1=s1+s;
  }
System.out.println("The result of the series is "+s1);
 }
}
