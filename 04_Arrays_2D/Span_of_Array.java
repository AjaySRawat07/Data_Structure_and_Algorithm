import java.util.*;

class Main {
    public static int checkMax_Min(int arr[]){
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            
            if(max < arr[i]){
                max = arr[i];
            }

            if(min > arr[i]){
                min = arr[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i=0; i< n ; i++){
            arr[i] = scn.nextInt();
        }

        int ans = checkMax_Min(arr);
        System.out.print("Span of the array : " + ans);
    }
}