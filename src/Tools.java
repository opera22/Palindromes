public class Tools {

    public static boolean isPalindrome(String str) {
        // initializing two pointers to creep towards the middle of a char array
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

    public static void printBox(String str) {

        // amount of space between each side of the box, then making a string w/ that amount
        int spacesInt = str.length() - 2;
        String spaces = "";
        for (int i = 0; i < spacesInt; i++) {
            spaces += " ";
        }

        // top row
        System.out.println("\n" + str);
        // middle rows
        for (int i = 0; i < spacesInt; i++) {
            System.out.println(str.charAt(i + 1) + spaces + str.charAt(i + 1));
        }
        // last row
        System.out.println(str + "\n");

    }
}
