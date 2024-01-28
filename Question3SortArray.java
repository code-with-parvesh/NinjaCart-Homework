import java.util.Scanner;

public class Question3SortArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }

        int result = sortArray(N, A, S);
        System.out.println(result);
    }

    private static int sortArray(int N, int[] A, int[] S) {
        boolean isSorted = true;
        for (int i = 0; i < N - 1; i++) {
            if (A[i] > A[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            return 0;
        }

        int operations = 0;
        int i = 0;

        while (i < N) {
            int j = i;
            while (j + 1 < N && !(S[j] != S[j + 1] && A[j] > A[j + 1])) {
                j += 1;
            }


            if (i == j) {
                return -1;
            }

            operations += 1;
            i = j + 1;
        }

        return operations;
    }
}
