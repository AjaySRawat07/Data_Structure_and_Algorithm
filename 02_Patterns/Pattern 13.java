// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // using combination formula
        
        for(int i = 0; i < n; i++){
             int icj = 1;
            for(int  j = 0; j <= i; j++){
                System.out.print(icj + "\t");
                
                int icjp1 = icj * (i - j) / (j + 1);
                icj = icjp1;
            }
            System.out.println();
        }   
    }
}

// output
// 5
// 1	
// 1	1	
// 1	2	1	
// 1	3	3	1	
// 1	4	6	4	1