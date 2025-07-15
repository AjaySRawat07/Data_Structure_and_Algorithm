import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        for(int i=1; i<=n; i++){
            c = a + b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }
}
