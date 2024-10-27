package Module1;

public class BinarySearch {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 9;
      
        System.out.println(getTargetValue(ar, target));
    }

    public static int getTargetValue(int ar[], int target){
        int n = ar.length;
        int start = 0, end = n - 1;

        while (start <= end) {
           int mid = start + (end - start)/2;
           if (ar[mid] < target) {
            start = mid + 1;
           }else if(ar[mid] > target){
            end = mid - 1;
           }else{
            return mid;
           }
        }
        return -1;
    }
}
