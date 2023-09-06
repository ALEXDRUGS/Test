public class Solution {

    public static int reverse(int x) {
        String input = String.valueOf(x);
        char[] charArray = input.toCharArray();
        StringBuilder result = new StringBuilder();
        if (input.startsWith("-")) {
            String buff = input.substring(1);
            char[] arr = buff.toCharArray();
            for (int i = arr.length - 1; i >= 0; i--) {
                result.append(arr[i]);
            }
            if (-Long.parseLong(result.toString()) < Integer.MIN_VALUE) {
                return 0;
            } else
                return -Integer.parseInt(result.toString());
        } else {
            for (int i = charArray.length - 1; i >= 0; i--) {
                result.append(charArray[i]);
            }
            if (Long.parseLong(result.toString()) > Integer.MAX_VALUE) {
                return 0;
            } else
                return Integer.parseInt(result.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(1239999999));
    }
}
