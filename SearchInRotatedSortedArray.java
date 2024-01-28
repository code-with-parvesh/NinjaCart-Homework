import java.util.Scanner;

public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
              
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {

                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rotated sorted array: ");
        int length = scanner.nextInt();

        int[] nums = new int[length];
        System.out.println("Enter the elements of the rotated sorted array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element to find: ");
        int target = scanner.nextInt();

        int result = search(nums, target);
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the rotated sorted array.");
        }

        scanner.close();
    }
}
