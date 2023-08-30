import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(stringToInt("-+283472"));
    }

    /**
     * Вывод массива индексов по равенству суммы их значений
     * заданному проверочному числу
     *
     * @param nums   Массив целых чисел
     * @param target Проверочное целое число
     * @return Массив целых чисел, заполненный индексами,
     * сумма значений которых равна проверочному числу
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }

    private static int stringToInt(String s) {
        Pattern pattern = Pattern.compile("[:punct]|[^:alnum]");
        Matcher matcher = pattern.matcher(s);
        char[] charArray = s.toCharArray();
        char[] buffer = new char[charArray.length];
        int count = 0;
        int iterate = 0;
        for (char symbol : charArray) {
            if (Character.isDigit(symbol) || symbol == '-') {
                buffer[count] = symbol;
                count++;
            }
            if (symbol == ' ' && iterate == 0) {
                continue;
            }
            if (symbol == ' ' && count == 0) {
                return 0;
            }
            if (matcher.find() && iterate != 0) {
                String string = new String(buffer);
                if (string.startsWith("-")) {
                    return -Integer.parseInt(string.substring(1, count));
                } else return Integer.parseInt(string.substring(0, count));
            }
            if (matcher.find() && iterate == 0){
                return 0;
            }
            iterate++;
        }
        if (count > 9) {
            return Integer.MIN_VALUE;
        }
        String string = new String(buffer);
        if (string.startsWith("-")) {
            return -Integer.parseInt(string.substring(1, count));
        } else return Integer.parseInt(string.substring(0, count));
    }
}