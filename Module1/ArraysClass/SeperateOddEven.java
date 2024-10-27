package Module1.ArraysClass;

import java.util.ArrayList;
import java.util.Scanner;

public class SeperateOddEven {
     public static void main(String[] args) {
             // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
       
        for(int i = 0; i < T; i++){
            int n = sc.nextInt();
            int A[] = new int[n];
            for(int j = 0; j < n; j++){
                A[j] = sc.nextInt();
            }
            findOddEvent(A);
        }
    }

    public static void findOddEvent(int ar[]){
        ArrayList even = new ArrayList();
        ArrayList odd = new ArrayList();
        for(int i = 0; i < ar.length; i++){
            if(ar[i] % 2 == 0){
                even.add(ar[i]);
            }else{
                odd.add(ar[i]);
            }
        }
        int oddColl[] = new int[odd.size()];
        int eventColl[] = new int[even.size()];

    
        for (int i = 0; i < odd.size(); i++)
            oddColl[i] = (int) odd.get(i);

        for (Integer x : oddColl)
            System.out.print(x + " ");

        for (int i = 0; i < even.size(); i++)
            eventColl[i] = (int) even.get(i);

        for (Integer x : eventColl)
            System.out.print(x + " ");
    }
}
