import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDiff {
    public static void main(String[] args){
        int[] arr = { 3,8,-10,23,19,-4,-14,27};
        System.out.print(minimumAbsDifference(arr));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>() ;
        Arrays.sort(arr);
        int n = arr.length ;
        int a = 0 ;
        int b = a+1 ;
        int diff = Integer.MAX_VALUE ;

        while(b<n){
            int currentDiff = arr[b]-arr[a];
            if(currentDiff < diff){
                diff = currentDiff ;
                ans.clear();
                ans.add(Arrays.asList(arr[a],arr[b]));
            }else if(currentDiff == diff){
                ans.add(Arrays.asList(arr[a],arr[b]));
            }

            a++;
            b++;
        }

        return ans ;
    }
}


// Question Link -> https://leetcode.com/problems/minimum-absolute-difference/