import java.util.*;

class Reverse{
    public static void main(String[] args){
        StringBuilder r = new StringBuilder("My name is Rajat Kumar");
        for(int i=0;i<r.length()/2;i++){
        int f = i;
        int b = r.length()-1-i;
        char fChar = r.charAt(f);
        char bChar = r.charAt(b);

        r.setCharAt(f,bChar);
        r.setCharAt(b,fChar);
        }
        System.out.println(r);
    }
}