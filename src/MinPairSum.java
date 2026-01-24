import java.util.Arrays;

public class MinPairSum {
    public static void main(String args){
        int nums[]={ 3,5,4,2,4,6};

        System.out.print(minPairSum(nums));
    }
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length ;

        int i = n/2 - 1 ;
        int j = n/2 ;

        int sum = 0 ;

        while(i>=0 && j<n){
            int currentSum = nums[i]+nums[j];
            sum = Math.max(sum , currentSum);
            i--;
            j++;
        }

        return sum ;
    }
}
