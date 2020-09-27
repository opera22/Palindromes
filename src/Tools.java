public class Tools {

    public static boolean isPalindrome(String str){
        // setting up two pointers to creep towards the middle of a char array
        int left = 0;
        int right = str.length() - 1;
        char[] array = str.toCharArray();

        while (left < right) {
            if (array[left] != array[right]) {
                 return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
