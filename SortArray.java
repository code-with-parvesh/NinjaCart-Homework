import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] P = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = scanner.nextInt();
        }

        int result = sortArray(N, K, P);
        System.out.println(result);
    }

    private static int sortArray(int N, int K, int[] P) {
        int operations = 0;
        int i = 0;

        while (i < N) {
            if (P[i] == i + 1) {
                i += 1;
                continue;
            }

            int maxPos = i;
            for (int j = i; j < Math.min(i + K, N); j++) {
                if (P[j] <= i + 1) {
                    maxPos = j;
                }
            }

            Arrays.sort(P, i, maxPos + 1);
            operations += 1;
            i = maxPos + 1;
        }

        return operations;
    }
}
