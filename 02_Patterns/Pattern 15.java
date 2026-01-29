// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int space = n / 2 , val = 1 , star = 1;
        
        for(int i=1; i <= n; i++){
            
            for(int j=0; j < space; j++){
                System.out.print("\t");
            }
            
            int cval = val;
            for(int j = 0; j < star; j++){
                System.out.print(cval + "\t");
                
                if(j < star / 2){
                    cval++;
                }
                else{
                    cval--;
                }
            } 
            
            if(i <= n/2){
                space--;
                star += 2;
                val++;
            }
            else{
                space++;
                star -= 2;
                val--;
            }
            System.out.println();
        }
    }
}

// output       // 5

// 		1	
// 	2	3	2	
// 3	4	5	4	3	
// 	2	3	2	
// 		1	
// 2 * 10 = 20