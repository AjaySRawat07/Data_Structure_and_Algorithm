import java.util.*;

class Main {

public static void reverse(int []arr, int i, int j){
   int li = i , ri = j;

    while(li < ri){
        int temp = arr[li];
        arr[li] = arr[ri];
        arr[ri] = temp;

        li++;
        ri--;
    }
}

public static void rotate(int[] arr, int k){
    // remove negative and make small rotations for larger number

    k = k % arr.length;

    if( k < 0){
        k = k + arr.length;
    }

    // part-1

    reverse(arr, 0, arr.length - k - 1);

    // part-2

    reverse(arr, arr.length - k, arr.length - 1 );

    // rotate all whole array

    reverse(arr, 0 , arr.length - 1);
}

public static void display(int[] arr){
    for(int val : arr){
        System.out.print(val + "\t");
    }
}
public static void main(String[] args) {
    Scanner scn =  new Scanner(System.in);

    int n = scn.nextInt();
    int arr[] = new int[n];

    for(int i = 0; i < n; i++){
        arr[i] = scn.nextInt();
    }

    int k = scn.nextInt();


    rotate(arr,k);
    display(arr);

}
}