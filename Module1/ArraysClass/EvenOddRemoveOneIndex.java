package Module1.ArraysClass;

public class EvenOddRemoveOneIndex {
   

    public static void main(String[] args) {
        int ar[] = {2, 1, 6, 4};
        int n = ar.length;
        int PE[] = new int[n];
        PE[0] = ar[0];
        int count = 0;

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
       System.out.println();

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
       System.out.println();
       int SE = PE[0];
       int SO = 0;
       for (int i = 0; i < n; i++) {
        if (i == 0) {
            SE = PO[n-1] - PO[i];
            SO = PE[n-1] - PE[i];
            if (SE == SO) {
                count++;
            }
        }else{
            SE = PE[i-1] + PO[n-1] - PO[i];
            SO = PO[i-1] + PE[n-1] - PE[i];
            System.out.println("index -> "+ i +" Even: "+SE + " <-> Odd: "+SO);
            if (SE == SO) {
                count++;
            }
        }
       }
       if (count != 0) {
            System.out.println("No of count : "+count);
       }else{
            System.out.println(-1);
       }
    }
}
