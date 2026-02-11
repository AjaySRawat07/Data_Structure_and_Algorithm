import java.util.*;

class Main {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int arr[] = new int[n];

    for(int i=0; i<n; i++){ 
        arr[i] = scn.nextInt();
    }

    int data = scn.nextInt(); // number to search

    int low = 0 , high = n - 1;
    int fi = -1;

    while(low <= high){
        int mid = low + (high - low) / 2;

        if(data < arr[mid]){
            high = mid - 1;
        }
        else if(data > arr[mid]){
            low = mid + 1;
        }
        else{
            // for first index
            fi = mid;
            high = mid - 1;
        }
    }

    System.out.println("First index is "+ fi);

    int li = -1;
    low = 0 ;
    high = n - 1;
    while(low <= high){
        int mid = low + (high - low) / 2;

        if(data < arr[mid]){
            high = mid - 1;
        }
        else if(data > arr[mid]){
            low = mid + 1;
        }
        else{
            // for last index
            li = mid;
            low = mid + 1;
        }
    }
    System.out.println("Last index is "+ li);
}
}