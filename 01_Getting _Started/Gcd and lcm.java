// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        
        int orgN1 = n1, orgN2 = n2;
        
        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        
        int gcd = n2;
        int lcm = (orgN1 * orgN2) / gcd;
        
        System.out.println(gcd);
        System.out.println(lcm);
        
    }
}