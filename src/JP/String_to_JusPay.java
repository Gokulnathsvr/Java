package JP;

public class String_to_JusPay {
    public static int minCharsToRemove(String s, String target) {
        int m = s.length();
        int n = target.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == target.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int lcsLength = dp[m][n];
        int charsToRemove = m - lcsLength;
        return charsToRemove;
    }

    public static void main(String[] args) {
        String s = "Justpay";
        String target = "Juspay";

        int charsToRemove = minCharsToRemove(s, target);

        System.out.println("No. of characters to be removed: " + charsToRemove);
    }
}



