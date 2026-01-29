// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
    
        // Pythagorean right angle triangle => [P^2 + B^2 = H^2];
        
        // find maximum
        int max = a;
        
        if(b > max){
            max = b;
        }
        else if(c > max){
            max = c;
        }
        
        // know find Height so apply the formula
        
        if(max == a){
            boolean flag = ((b*b + c*c) == a*a);
            System.out.println(flag);
        }
        
        else if(max == b){
            boolean flag = ((a*a + c*c) == b*b);
            System.out.println(flag);
        }
        else if(max == c){
            boolean flag = ((a*a + b*b) == c*c);
            System.out.println(flag);
        }
    }
}