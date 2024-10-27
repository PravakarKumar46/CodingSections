package Module1.ArraysClass;
import java.util.*;

import java.util.Scanner;

public class MultipleTestcases {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number of test cases
        int T = sc.nextInt();
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read the size of the array
            int n = sc.nextInt();
            int[] A = new int[n];
            
            // Read the array elements
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }
            
            // First, count how many odd and even numbers there are
            int oddCount = 0, evenCount = 0;
            for (int i = 0; i < n; i++) {
                if (A[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            
            // Create arrays for odd and even numbers
            int[] odd = new int[oddCount];
            int[] even = new int[evenCount];
            int oddIndex = 0, evenIndex = 0;
            
            // Separate odd and even numbers
            for (int i = 0; i < n; i++) {
                if (A[i] % 2 == 0) {
                    even[evenIndex++] = A[i];
                } else {
                    odd[oddIndex++] = A[i];
                }
            }
            
            // Print odd numbers
            for (int i = 0; i < odd.length; i++) {
                System.out.print(odd[i]);
                if (i < odd.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
            // Print even numbers
            for (int i = 0; i < even.length; i++) {
                System.out.print(even[i]);
                if (i < even.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}


// public class MultipleTestcases {
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt();
//         for (int index = 0; index < T; index++) {
//         int n = sc.nextInt();
//         int ar[] = new int[n];

//         for(int j = 0; j < n; j++){
//              ar[j] = sc.nextInt();
//          }
//          callFunctions(ar);
//          callFunctions(ar);
//         }
//     }

//     public static void callFunctions(int ar[]){

//         ArrayList odd = new ArrayList<>();
//         ArrayList even = new ArrayList<>();

//         for (int i = 0; i < ar.length; i++) {
//             if (ar[i] % 2 == 0 ) {
//                 even.add(ar[i]);
//             } else {
//                 odd.add(ar[i]);
//             }
//         }

//         int oddColl[] = new int[odd.size()];
//         int eventColl[] = new int[even.size()];

    
//         for (int i = 0; i < odd.size(); i++)
//             oddColl[i] = (int) odd.get(i);

//         for (int i = 0; i < even.size(); i++)
//             eventColl[i] = (int) even.get(i);
//         for (Integer x : oddColl)
//             System.out.print(x + " ");
//         System.out.println();
//         for (Integer x : eventColl)
//             System.out.print(x + " ");

//     }
// }

