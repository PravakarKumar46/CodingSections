package Module1.ArraysClass;

public class OddInexSum {
    public static void main(String[] args) {
        int ar[] = {1,2,3,-2,-2,-4,0};
        int n = ar.length;
        int PO[] = new int[n];
        PO[0] = 0;

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                PO[i] = PO[i-1];
            }else{
                PO[i] = PO[i-1] + ar[i];
            }
        }
        for (int i : PO) {
            System.out.print(i+ " ");
        }
    }
}
