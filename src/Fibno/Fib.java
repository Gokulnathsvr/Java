package Fibno;

public class Fib {
    public static void main(String[] args) {
        int n = 100;
        int[] strg = new int[n + 1];

        System.out.println(Fibono(n, strg));
    }

    public static int Fibono(int n, int[] strg) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (strg[n] != 0) {
            return strg[n];
        }
        int fnm1 = Fibono(n - 1, strg);
        int fnm2 = Fibono(n - 2, strg);
        int fn=fnm1+fnm2;
        strg[n] = fn;
        return fn;
    }
}
