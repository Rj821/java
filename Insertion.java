import java.util.*;

class Insertion{

    public static void main(String[] args){
        int[] a;
        int i,j,temp,small=0;
        a = new int[9];
        Scanner hell = new Scanner(System.in);
        System.out.println("Enter numbers in array:");
        for(i=0;i<a.length;i++){
            a[i]=hell.nextInt();
        }
        System.out.println("The given array is:");
        for(i=0;i<a.length;i++){
          System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("The sorted array is:");
        for (i = 0; i < a.length-1; i++) {
            small=i;
            if(a[small]>a[i+1]){
             for (j = i+1; j > 0; j--) {
               if(a[j-1]>a[j]){
                temp= a[j];
                a[j]= a[j-1];
                a[j-1]= temp;
               }
             }       
            }
        }
        for (i = 0; i < a.length; i++) {
          System.out.print(a[i]+" ");
        }
    }
}    