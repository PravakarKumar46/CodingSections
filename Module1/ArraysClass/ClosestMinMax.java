package Module1.ArraysClass;

public class ClosestMinMax {
    public static void main(String[] args) {
        int A[] = {1, 3, 2};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
 
        for(int i = 0; i < A.length; i++){
            if(max < A[i]){
                max = A[i];
            }
            if(min > A[i]){
                min = A[i];
            }
        }
        System.out.println("Max : "+max + " Min: "+min);
    }
}
