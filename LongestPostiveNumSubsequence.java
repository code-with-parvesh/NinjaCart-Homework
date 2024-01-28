import java.util.*;
public class LongestPostiveNumSubsequence {


    public static int longestPositiveSubsequence(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > 0 && arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max = 0;
        for (int value : dp) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = longestPositiveSubsequence(arr);
        System.out.println(result);


    }
}
