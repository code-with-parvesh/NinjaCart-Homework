import java.util.*;
public class SortanArray {

    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void mergeSort(int[] A, int l, int r) {
        if (l >= r)
            return;

        final int m = (l + r) / 2;
        mergeSort(A, l, m);
        mergeSort(A, m + 1, r);
        merge(A, l, m, r);
    }

    private static void merge(int[] A, int l, int m, int r) {
        int[] sorted = new int[r - l + 1];
        int k = 0;
        int i = l;
        int j = m + 1;

        while (i <= m && j <= r)
            if (A[i] < A[j])
                sorted[k++] = A[i++];
            else
                sorted[k++] = A[j++];

        while (i <= m)
            sorted[k++] = A[i++];


        while (j <= r)
            sorted[k++] = A[j++];

        System.arraycopy(sorted, 0, A, l, sorted.length);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] result =  sortArray(nums);
        System.out.println(Arrays.toString(result));
    }
}