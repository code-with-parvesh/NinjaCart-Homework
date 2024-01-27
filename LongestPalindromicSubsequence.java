import java.util.*;
public class LongestPalindromicSubsequence {

    public static int longestPalindromeSubseq(String s) {
        final int n = s.length();
        int[][] mem = new int[n][n];
        return lps(s, 0, n - 1, mem);
    }

    private static int lps(String s, int i, int j, int[][] mem) {
        if (i > j)
            return 0;
        if (i == j)
            return 1;
        if (mem[i][j] > 0)
            return mem[i][j];
        if (s.charAt(i) == s.charAt(j))
            return mem[i][j] = 2 + lps(s, i + 1, j - 1, mem);
        return mem[i][j] = Math.max(lps(s, i + 1, j, mem), lps(s, i, j - 1, mem));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int result =  longestPalindromeSubseq(s);
        System.out.print(result);
    }
}