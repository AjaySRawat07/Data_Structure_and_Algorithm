// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int cnt = 1;
        
        for(int i = 1; i <= n; i++){
            
            for(int j=1; j <= i; j++){
                System.out.print(cnt + "\t");
                cnt++;
            }
            
            System.out.println();
        }
    }
}