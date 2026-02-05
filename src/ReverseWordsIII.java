public class ReverseWordsIII {
    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(reverseWords(str));
    }
//    APPROACH ONE
//    public static String reverseWords(String s) {
//        int  n = s.length() ;
//        String[] words = s.split(" ");
//        StringBuilder sb = new StringBuilder();
//
//        for(int i = 0 ; i<words.length; i++){
//            char[] Char_arr = words[i].toCharArray();
//            int j = 0 ;
//            int k = Char_arr.length -1 ;
//            while(j<k){
//                char c = Char_arr[j];
//                Char_arr[j] = Char_arr[k];
//                Char_arr[k] = c ;
//                j++;
//                k--;
//            }
//            sb.append(new String(Char_arr));
//
//            if(i<words.length-1){
//                sb.append(" ");
//            }
//        }
//
//        return sb.toString();
//    }


    // APPROACH TWO

    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;

        for (int end = 0; end <= chars.length; end++) {
            // When we find a space or reach the end of the string, reverse the word
            if (end == chars.length || chars[end] == ' ') {
                reverse(chars, start, end - 1);
                start = end + 1; // Move start to the beginning of the next word
            }
        }
        return new String(chars);
    }

    // Helper method to reverse characters in place
    private static void reverse(char[] c, int left, int right) {
        while (left < right) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
    }
}

// QUESTION LINK -> https://leetcode.com/problems/reverse-words-in-a-string-iii/
