package LC_prob;
import java.util.HashSet;

public class Lc_202_Happynum {
   /* static HashSet<Integer> hs = new HashSet<>();
    public static void main(String[] args) {
        int n = 19;
        ishappy(n);

    }
    public static void ishappy(int n){
        int rem=n%10;
        int qut=n/10;
        int sq= rem*rem+qut*qut;
        hs.add(sq);
        if(sq==1){
            System.out.println("happy");
            return;
        }else{
            ishappy(sq);
        }

        }
    }*/
        static HashSet<Integer> hs = new HashSet<>();

        public static void main(String[] args) {
            int n = 19;
            if (isHappy(n)) {
                System.out.println(n + " is a happy number.");
            } else {
                System.out.println(n + " is not a happy number.");
            }
        }

        public static boolean isHappy(int n) {
            if (n == 1) {
                return true;
            }
            if (hs.contains(n)) {
                return false;
            }
            hs.add(n);

            int sumOfSquares = 0;
            while (n > 0) {
                int rem = n % 10;
                sumOfSquares += rem * rem;
                n /= 10;
            }

            return isHappy(sumOfSquares);
        }
    }



