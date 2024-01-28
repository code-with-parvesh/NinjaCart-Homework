import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {

    public static void moveZeros(int[] nums) {
        int nonZeroIndex = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex++] = num;
            }
        }

        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int length = scanner.nextInt();

        int[] nums = new int[length];

        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        moveZeros(nums);

        System.out.println( Arrays.toString(nums));

        scanner.close();
    }
}
