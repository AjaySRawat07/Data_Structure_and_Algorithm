import java.util.*;

class Main {
public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        // search for ele
        int find = scn.nextInt();

        int idx = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == find){
               idx = i;
            } 
        }
        System.out.print(idx);
    }
}