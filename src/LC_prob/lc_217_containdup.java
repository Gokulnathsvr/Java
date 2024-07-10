package LC_prob;

import java.util.HashSet;

public class lc_217_containdup {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        System.out.println(Iscontain(arr));
    }

    public static boolean Iscontain(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hs.contains(arr[i])) {
                hs.add(arr[i]);
            } else {
                return true;
            }

        }
        return false;
    }
}


