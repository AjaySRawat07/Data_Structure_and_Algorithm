// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int a = 0 , b = 1;
        
        for(int i=0; i < n; i++){
            
            for(int j = 0; j < i; j++){
                System.out.print(a + "\t");
                
                int c = a + b;
                
                a = b;
                
                b = c;
            }
            System.out.println();
        }
    }
}