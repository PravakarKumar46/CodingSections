package Module1.ArraysClass;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int A[] = {-7, 1, 5, 2, -4, 3, 0};
        // int A[] = {1,2,3,4,5,1,3,2,4};
        int SL = 0, SR = 0, count = 0;
        for(int i = 0; i < A.length; i++){
            SR+=A[i];
        }
        for(int i = 0; i < A.length; i++){
            SR = SR - A[i];
            System.out.println("index: " + i +" SR : "+SR + " :: SL: "+SL);
            if(SL == SR){
                count++;
            }
            SL = SL + A[i];
        }
        if(count > 0){
           System.out.println(count);
           return;
        }
       System.out.println(-1);
    }
}
