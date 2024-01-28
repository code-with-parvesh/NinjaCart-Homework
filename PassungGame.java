import java.util.Scanner;

 class PassingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int result = getMaxDuration(N, A);
        System.out.println(result);
    }


    private static int getMaxDuration(int N, int[] A) {
        int result = -404;

        int maxDuration = 0;

        for (int i = 0; i < N; i++) {
            int duration = 0;
            int currentPlayer = i;
            int[] energy = A.clone();

            while (energy[currentPlayer] > 0) {
                int nextPlayer = (currentPlayer + 1) % N;
                energy[currentPlayer]--;
                currentPlayer = nextPlayer;
                duration++;
            }

            maxDuration = Math.max(maxDuration, duration);
        }

        result = maxDuration;

        return result;
    }
}
