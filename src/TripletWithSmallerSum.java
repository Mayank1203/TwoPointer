import java.util.Arrays;

public class TripletWithSmallerSum {
    public static void main(String[] args){
        int n = 4, sum = 2 ;
        long arr[] = {-2, 0, 1, 3} ;

        System.out.println(countTriplets(4,2,arr));
    }

    public static long countTriplets(int n, int sum, long arr[]){
        long ans = 0 ;
        Arrays.sort(arr) ;

        for(int i = 0 ; i<n-2 ; i++){
            int j = i+1 ;
            int k = n-1 ;

            while(j<k){
                long currentSum = arr[i]+arr[j]+arr[k];
                if(currentSum>=sum){
                    k--;
                }else{
                    ans = ans+(k-j);
                    j++;
                }
            }
        }

        return ans;
    }
}
