import java.util.*;

class Bubble{

    public static void main(String[] args){
        int[] a;
        int i,j,temp;
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
    for(i=0;i<a.length;i++){
        for(j=0;j<a.length-1;j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    for(i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
}
}