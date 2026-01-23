import java.util.Arrays;

import static java.util.Collections.swap;

public class SortColours {
    public static void main(String[] args){
        int[] nums = {2,0,2,1,1,0};

        sortColours(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void sortColours(int[] nums){
        int n = nums.length ;
        int low = 0 , mid = 0 , high = n-1;

        while(mid<=high){
            if(nums[mid] == 0){
                Swap(nums , mid , low);
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                Swap(nums , mid , high);
                high-- ;
            }
        }

    }

    public static void Swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp ;
    }
}
