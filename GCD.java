import java.util.*;

class GCD{
    public static void main(String[] args){
        int a,b,r;

        Scanner hell= new Scanner(System.in);
        System.out.println("Enter first number:");
        a= hell.nextInt();
        System.out.println("Enter second number:");
        b= hell.nextInt();
        hcf(a,b);
        r=hcf(a,b);
        System.out.println("The greatest common divisor of "+a+" and "+b+" is:"+r);
    }
    
    static int hcf(int x, int y){
        int i,j,r=0;
        if(x>y){
        for (i=y;i>=1;i--) {
            if(y%i==0&&x%i==0){
                r=i;
                break;
            }
        }
        }
        else if(x<y){
        for (i=x;i>=1;i--) {
            if(y%i==0&&x%i==0){
                r=i;
                break;
            }
        }
        }
        else if(x==y){
        for (i=x;i>=1;i--) {
            if(y%i==0&&x%i==0){
                r=i;
                break;
            }
        }
        }
        
        return r;
    }
}