package Module1.ArraysClass;

public class EvenIndexSum {
    public static void main(String[] args) {

        int ar[] = {1,2,3,-2,-2,-4,0};
        int n = ar.length;
        int PE[] = new int[n];
        PE[0] = ar[0];

        for (int i = 1; i < n; i++) {
            if(i % 2 == 1){
                PE[i] = PE[i-1];
            }else{
                PE[i] = PE[i-1] + ar[i];
            }
        }
       for (int i : PE) {
        System.out.print(i + " ");
       }
    }
}
