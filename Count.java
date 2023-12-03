import java.util.*;

class Count{
    public static void main(String[] args){
        int num,i=1,n=0,p=0,z=0;
        Scanner hell= new Scanner(System.in);
        System.out.println("Enter 7080 to Exit");

        while(i>0){
        System.out.println("Enter a number:");
        num= hell.nextInt();

        if(num<0){
            countn(num);
            n= n+countn(num);
        }
        else if(num==0){
            countz(num);
            z= z+countz(num);
        }
        else if(num>0&&num!=7080){
            countp(num);
            p= p+countp(num);
        }
        else if(num==7080){
            System.out.println("Total number of Negative numbers are:"+n);
            System.out.println("Total number of  Zeros are:"+z);
            System.out.println("Total numbers of Positive numbers are:"+p);
            break;
        }
        else{
            break;
        }
      }
    }
    static int countn(int num){
        int cn=0;
        cn++;
      return cn;
    }
    static int countz(int num){
        int cz=0;
        cz++;
      return cz;
    }
    static int countp(int num){
        int cp=0;
        cp++;
      return cp;
    }
}