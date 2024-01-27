import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for( int i =0; i<nums.length; i++){
            for (int j= i +1; j<nums.length; j++){
                if (nums[i] +nums[j] == target){
                    return new int[]{i,j} ;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int[] result =  twoSum(nums, target);
        System.out.print(Arrays.toString(result));
    }
}
