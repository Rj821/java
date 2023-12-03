import java.util.*;

class Details{
    public static void main(String[] args) {
        int age;
        String id,name,city;
        Scanner hell= new Scanner(System.in);
        System.out.println("Enter your details:");        
        System.out.print("Name:"); 
        name= hell.next();
        System.out.print("\nId:");
        id= hell.next();
        System.out.print("\nAge:");
        age= hell.nextInt();
        System.out.print("\nCity:");
        city= hell.next();
        System.out.println("\n\n\n");
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("Age:"+age);
        System.out.println("City:"+city);
    }
}