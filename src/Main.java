import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
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
}