// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // 20 => 1, 2, 3, 4

        // Bulbs on for perfect square number
        
        for(int i = 1; i * i <= n; i++){
            System.out.println(i);
        }
    }
}