package RtoI;
import java.util.*;
public class Roman {
        public int romanToInt(String s) {
            Map<Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                    result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
                } else {
                    result += map.get(s.charAt(i));
                }
            }
            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String romanNumeral = scanner.nextLine();

            Roman converter = new Roman();
            int result = converter.romanToInt(romanNumeral);
            System.out.println(result);
        }
    }


