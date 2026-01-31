import java.util.*;

class Main {
public static void main(String[] args) {
    Scanner scn =  new Scanner(System.in);

    int n = scn.nextInt();
    int arr1[] = new int[n];

    for(int i = 0; i < n; i++){
        arr1[i] = scn.nextInt();
    }

    int m = scn.nextInt();
    int arr2[] = new int[m];

    for(int i = 0; i < m; i++){
        arr2[i] = scn.nextInt();
    }

    // sum of 2 array and return result
    int[] sum = new int[n > m ? n : m];

    int c = 0; // carry
    // start sum from as usual end 

    int i = n - 1;
    int j = m - 1;
    int k = sum.length - 1;

    while( k >= 0){
        int d = c;

        if(i >= 0){
            d += arr1[i];
        }
        if(j >= 0){
            d += arr2[j];
        }

        c = d / 10;
        d = d % 10;

        sum[k] = d;

        i--;
        j--;
        k--;
    }

    if(c != 0){
        System.out.println(c);
    }

    for(int val : sum){
        System.out.println(val);
    }     
    }
}