import java.util.*;

class Matrix
{

 public static void main(String[] args)
 {

int[][] a;

int f,i,j,k,s=0,x;

a= new int[3][3];

 System.out.println("Enter numbers in a matrix:");
 
 Scanner hell= new Scanner(System.in);

for(i=0;i<a.length;i++){

 for(j=0;j<a[i].length;j++){
 
 a[i][j]= hell.nextInt();
   }
 }

System.out.println();

for(i=0;i<a.length;i++){

 for(j=0;j<a[i].length;j++){

System.out.print(a[i][j]+" ");  
    }
System.out.println();
  }    
 

for(i=0;i<a.length;i++){
 
for(j=0;j<a[i].length;j++){
  
s=s+ a[i][j];
  
}

System.out.println();
  
 } 

System.out.println("The sum of all numbers in matrix is "+s);
 
 
int count=0,countp=0; 
  
 System.out.println();
   
 
for(i=0;i<a.length;i++){ 
  
for(j=0;j<a[i].length;j++){

 for(x=1;x<=a[i][j];x++){
 
    if(a[i][j]%x==0){
    count++;
    }
   }
 if(count==2){
   countp++;
 count=0;
   }
else{}
count=0;
  }
 }
 System.out.println("The total number of prime numbers in matrix are "+countp);
  }
 }