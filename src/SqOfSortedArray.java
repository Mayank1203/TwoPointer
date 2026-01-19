import java.util.Arrays;

public class SqOfSortedArray {

    public static void main(String args[]){
        int[] arr = {-4,-1,0,3,10};

        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    public static int[] sortedSquares(int[] arr){
        int n = arr.length ;

        int[] result = new int[n];

        int left = 0;
        int right = n-1;
        int pos = n-1 ;

        while(left<=right){
            int leftOne = arr[left]*arr[left];
            int rightOne = arr[right]*arr[right];
            if(leftOne>rightOne){
                result[pos] = leftOne;
                left++;
            }else{
                result[pos] = rightOne ;
                right-- ;
            }

            pos-- ;
        }

        return result;
    }

}
