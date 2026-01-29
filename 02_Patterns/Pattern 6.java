// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int sp = 1 , star = n/2 + 1;
        
        for(int i=1; i <= n; i++){
            for(int k = 1 ; k <= star; k++){
                    System.out.print("*\t");
            }
            for(int k = 1; k <= sp; k++){
                    System.out.print("\t");
            }
            for(int k = 1; k <= star; k++){
                    System.out.print("*\t");
            }
            
            if(i <= n/2){
               star--;
               sp += 2;
            }
            else{
                star++;
                sp -= 2;
            }
            System.out.println();
        }
    }
}