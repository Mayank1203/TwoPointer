import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args){
        int[] nums = {-1,1,2,-4};

        int target = 1 ;

        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int n = nums.length;

        int closestSum = nums[0]+nums[1]+nums[2] ;

        for(int i = 0; i<n-2; i++) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int currentSum = nums[i] + nums[j] + nums[k];

                if (currentSum == target) return currentSum;

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    j++;
                } else {
                    k--;
                }
            }

        }

        return closestSum ;

    }
}
