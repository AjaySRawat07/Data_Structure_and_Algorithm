import java.util.*;

class Main {

public static void reverseArray(int arr[],int n){
     int i = 0 , j = n - 1;

     while(i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
     }
}

public static void display(int []arr){
    for(int val : arr){
        System.out.print(val + "\t");
    }
}
public static void main(String[] args) {
    Scanner scn =  new Scanner(System.in);
    
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        reverseArray(arr,n);
        display(arr);
    }
}