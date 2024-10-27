package Module1.ArraysClass;

public class PrefixArrayEqillibrium {
    public static void main(String[] args) {
        

        int ar[] = {-7, 1, 5, 2, -4, 3, 0};

        int pa[] = new int[ar.length];
        pa[0] = ar[0];
        for (int i = 1; i < pa.length; i++) {
            
            pa[i] = pa[i-1]  + ar[i];
        }

        // for (int i : pa) {
        //     System.out.print(i + " ");
        // }

        int index = 0;
        int sl = 0;
        int n = pa.length;
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                sl = pa[i - 1];
            }
            int sr = pa[n-1] - pa[i];
            if (sl == sr) {
                System.out.println("index : "+ i);
                return;
            }
        }
        System.out.println("-1");
    }
}
