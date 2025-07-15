// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int  div = 2;
        while(div*div <= n){
            if(n % div == 0){
                n = n / div;
                System.out.print(div + " ");
            }
            else{
                div++;   
            }
        }
        // if no factor found
        if(n != 1){
            System.out.print(n);
        }
    }
}