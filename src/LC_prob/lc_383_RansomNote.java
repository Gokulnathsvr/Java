package LC_prob;

import java.util.HashMap;

public class lc_383_RansomNote {
    public static boolean RansomNote(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "happy sad evening light";
        String t = "help";
        System.out.println(RansomNote(s, t));


    }
}
