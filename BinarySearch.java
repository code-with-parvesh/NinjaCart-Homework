import java.util.*;
public class BinarySearch {

    public static int search(int[] nums, int target) {
        final int i = Arrays.binarySearch(nums, target);
        return i < 0 ? -1 : i;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int result =  search(nums, target);
        System.out.print(result);
    }
}