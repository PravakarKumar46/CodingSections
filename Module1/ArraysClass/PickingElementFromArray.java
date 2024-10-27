package Module1.ArraysClass;

public class PickingElementFromArray {
    public static void main(String[] args) {
        int ar[] = {-584,-714,-895,-512,-718,-545,734,-886,701,316,-329,786,-737,-687,-645,185,-947,-88,-192,832,-55,-687,756,-679,558,646,982,-519,-856,196,-778,129,
            -839,535,-550,173,-534,-956,659,-708,-561,253,-976,-846,510,-255,-351,186,-687,
            -526,-978,-832,-982,-213,905,958,391,-798,625,-523,-586,314,824,334,874,-628,
            -841,833,-930,487,-703,518,-823,773,-730,763,-332,192,985,102,-520,213,627,-198,
            -901,-473,-375,543,924,23,972,61,-819,3,432,505,593,-275,31,-508,-858,222,286,64,
            900,187,-640,-587,-26,-730,170,-765,-167,711,760,-104,-333};
        int n = ar.length;
        int B = 32;
        int k = 6;
        int SA[] = new int [n];
        SA[n-1] = ar[n-1];
        for (int i = n - 2; i >=0; i--) {
            SA[i] = SA[i+1] + ar[i];
            // System.out.println(SA[i]);
        }
        // System.out.println("Suffix Sum : ");
        // for (int i : SA) {
        //     System.out.print(i+" ");
        // }

        // System.out.println();
        int PA[] = new int[n];
        PA[0] = ar[0];
     
        for (int i = 1; i < n ; i++) {
            PA[i] = PA[i-1] + ar[i];
        }
        // System.out.println("Prefux Sum : ");
        // for (int i : PA) {
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // System.out.println(PA[k-1]);
        // System.out.println(SA[n - B + k - 1 + 1]);
        // int sum =  PA[k-1]  + SA[n - B + k];
        // System.out.println(sum);
        // System.out.println(PA[k-1]+PA[n-1]+PA[n-B+k-1]);
        int ans = PA[B-1];
        int sum  = 0;
        for(int i = 0; i < B; i++){
            if (i == 0) {
                sum = SA[n-B+i];
            }else{
                sum =  PA[i-1]  + SA[n - B + i];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        System.out.println(ans);
    }
}
