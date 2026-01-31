// Array is a non-primitive (reference) data type in Java.

// Two types of memory are used:
// 1) Stack Memory
// 2) Heap Memory

// Stack Memory:
// - Stores reference variables (like arr, two)
// - Each variable holds the address of the object

// Heap Memory:
// - Stores the actual array object (values)
// - Objects are created using 'new' or array literals

STACK MEMORY                HEAP MEMORY
-------------              -------------------
arr  ────────────┐
                  ├──────> [ 1 | 100 | 3 | 4 | 5 ]
two  ────────────┘


// When an array is assigned to another variable,
// both variables point to the same heap memory location.

// Advantage:
// - Fast access (constant time O(1))
// - Same array can be accessed from multiple references


import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};

        int[] two = arr;

        two[1] = 100;

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        
        System.out.println();

        for(int j=0; j < two.length; j++){
            System.out.print(two[j]+ ", ");
        }
    }
}