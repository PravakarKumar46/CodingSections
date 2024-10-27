package Module1.ArraysClass;
public class CounterGreater {
    public static void main(String[] args) {
        
        int ar[] = {-3, -2,11, 1, 4,11, 2, 10};
        System.out.println(getCount(ar));
    }

    public static int getCount(int ar[]){

        int n = ar.length;

        int max = ar[0];

        int count = 0;

        for(int i = 0; i < n; i++){
            if (ar[i] > max) {
                max = ar[i];
            }else if(max == ar[i]){
                count++;
            }
        }

        // for(int i = 0; i < n; i++){
        //     if (ar[i] == max) {
        //         count++;
        //     }
        // }

        return n - count;
        
    }
}