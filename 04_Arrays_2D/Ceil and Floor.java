import java.util.*;

class Main {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int arr[] = new int[n];

    for(int i=0; i<n; i++){ 
        arr[i] = scn.nextInt();
    }

    int data = scn.nextInt();

    int ceil = 0;
    int floor = 0;  

    int l = 0 , h = n -1;

    while(l <= h){
        int mid = l + (h - l ) / 2;

        if(arr[mid] > data){
            h = mid - 1;
            floor = arr[mid];
        }
        else if(arr[mid] < data){
            l = mid + 1;
            ceil = arr[mid];
        }
        else{
            ceil = arr[mid];
            floor = arr[mid];
        }
    }
  
    System.out.println("Ceil : " + ceil + "\t : Floor : "+ floor );
}
}