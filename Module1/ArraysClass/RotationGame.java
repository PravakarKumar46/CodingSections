package Module1.ArraysClass;

import java.util.Scanner;

public class RotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ar[] = new int [n];
        for(int i =0; i < n; i++){
           ar[i] = sc.nextInt();
        }

        rotateArray(ar, n, k);
    }

    public static void rotateArray(int ar[], int n, int k){
       int newArr[] = new int[n];

       for(int i = 0; i < n; i++){
        newArr[(i + k) % n] = ar[i];
       }

        for(int i = 0; i <n; i++){
            System.out.print(newArr[i] +" ");
        }
    }
}
