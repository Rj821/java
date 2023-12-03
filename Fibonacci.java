import java.util.*;

class Fibonacci
{
 public static void main(String[] args)
 {
int i,a=0,b=1,c=0,n;
 System.out.println("Enter a number:");
  Scanner hell= new Scanner(System.in);
  n= hell.nextInt();
  if(n!=1&&n!=2&&n>0){
      for(i=1;i<=n-2;i++){
      c=a+b;
      a=b;
      b=c;
      }
 System.out.println("The Fibonacci series at "+n+" terms is "+c);
    }
    else if(n==1){
        System.out.println("The Fibonacci series at "+n+" term is "+c);
    }
    else if(n==2){
        c++;
        System.out.println("The Fibonacci series at "+n+" terms is "+c);
    }
    else{
        System.out.println("Your input is wrong");
    }
 }
}