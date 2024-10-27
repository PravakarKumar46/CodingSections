package Module1.ArraysClass;

public class SpecialIndex {
    public static void main(String[] args) {
        int A[] = {2,1,6,4};
        int ar[] = new int[A.length-1]; 
        int noOfIndext = 0;  
       
       for(int k = 0; k < A.length; k++){
        int j = 0;
        for(int i = 0; i < A.length; i++){
            if(i != k){
               ar[j++] = A[i];
            }
        }
         for(int i: ar){
             System.out.print(i + " ");
         }
         System.out.println();
        int PE[] = new int[ar.length];
        int[] PO = new int[ar.length];
        PE[0] = ar[0];
         // sum of even index
         for (int i = 1; i < ar.length; i++) {
            if (i % 2 == 1) {
                PE[i]=PE[i-1];
            }else{
                PE[i]=PE[i-1]+ar[i];
            }
            System.out.print(PE[i]+" ");
         }
         PO[0] = 0;
         for (int i = 1; i < ar.length; i++) {
            if (i % 2 == 0) {
                PO[i]=PO[i-1];
            }else{
                PO[i]=PO[i-1]+ar[i];
            }
            System.out.print(PO[i]+" ");
         }
         System.out.println();
         for(int i: PO){
             System.out.print(i + " ");
         }
         System.out.println();
         if ((PE[ar.length-1] - PE[0]) == (PO[ar.length-1] - PO[0])) {
            noOfIndext++;
         }
       }
        System.out.println(noOfIndext);
    }
}
