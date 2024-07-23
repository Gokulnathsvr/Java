package Leetcode;

import java.util.Scanner;

public class LC_1768_MergeStr {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
         String word1 = sc.nextLine();
         String word2 =sc.nextLine();
        System.out.println(mergeAlternately(word1,word2));


    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i=0;
        while(i<word1.length()||i<word2.length()){
            if(i< word1.length()){
                result.append(word1.charAt(i));
            }
            if(i<word2.length()){
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}
