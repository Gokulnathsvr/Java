package LC_lettercombi_phone_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phone {
    static HashMap<Character,String> hp =new HashMap<>();
    static List<String> letter = new ArrayList<>();
    public static void main(String[] args) {
        hp.put('2', "abc");
        hp.put('3', "def");
        hp.put('4', "ghi");
        hp.put('5', "jkl");
        hp.put('6', "mno");
        hp.put('7', "pqrs");
        hp.put('8', "tuv");
        hp.put('9', "wxyz");
        String digits = "2";
        if(digits.length()==0){
            System.out.println(letter);
        }
        if(digits.length()==1) {
            String str=hp.get('2');
            for (int a = 0; a < str.length(); a++) {
                lettercom1(str.charAt(a));
            }
            System.out.println(letter);
        }

        if(digits.length()==2){
            String str1=hp.get('2');
            String str2=hp.get('3');
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str2.length();j++){
                    lettercom(str1.charAt(i),str2.charAt(j));
                }
            }
            System.out.println(letter);
        }
        if(digits.length()==3){
            String str1=hp.get(digits.charAt(0));
            String str2=hp.get(digits.charAt(1));
            String str3=hp.get(digits.charAt(2));
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str2.length();j++) {
                    for (int k = 0; k < str3.length(); k++) {
                        lettercom3(str1.charAt(i), str2.charAt(j),str3.charAt(k));
                    }
                }
            }
            System.out.println(letter);
        }
    }
    public static void lettercom1(char s1){
        letter.add(""+s1);
    }
    public static void lettercom(char s1,char s2){
        letter.add(""+s1+s2);
    }
    public static void lettercom3(char s1,char s2,char s3){
        letter.add(""+s1+s2+s3);
    }
}
