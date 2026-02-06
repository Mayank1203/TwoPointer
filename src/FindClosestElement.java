import java.util.ArrayList;
import java.util.List;

public class FindClosestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5} ;
        int k = 4, x = 3 ;
        System.out.println(findClosestElements(arr, k, x));
    }
        public static List<Integer> findClosestElements(int[] arr, int k, int x) {
            int lo = 0;
            int hi = arr.length - 1;
            while (hi - lo >= k) {
                if (Math.abs(arr[lo] - x) > Math.abs(arr[hi] - x)) {
                    lo++;
                } else {
                    hi--;
                }
            }
            List<Integer> result = new ArrayList<>(k);
            for (int i = lo; i <= hi; i++) {
                result.add(arr[i]);
            }
            return result;
        }
    }
// Question link -> https://leetcode.com/problems/find-k-closest-elements/