import java.util.*;

class Power{
   public static void main(String[] args){
    double n,e,r;
    Scanner hell= new Scanner(System.in);
    System.out.println("Enter a number:");
    n= hell.nextDouble();
    System.out.println("Enter a exponent:");
    e= hell.nextDouble();
    r= power(n,e);
    System.out.println("The result is "+r);
    }

    static double power(double a, double b){
    double r;
    r= Math.pow(a,b);
    return r;
    }
}