package LCS_usingRecur;

public class Longestcommonsubsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        if(text1.length()==0||text2.length()==0){
            return 0;
        }
        char ch1=text1.charAt(0);
        char ch2=text2.charAt(0);
        String ros1=text1.substring(1);
        String ros2=text2.substring(1);
        int ans=0;
        if(ch1==ch2){
            ans= longestCommonSubsequence(ros1,ros2)+1;
        }else{
            int o1=longestCommonSubsequence(text1,ros2);
            int o2=longestCommonSubsequence(ros1,text2);
            ans=Math.max(o1,o2);
        }
        return ans;
    }

    public static void main(String[] args) {
        String text1="pmjghexybyrgzczy";
        String text2="hafcdqbgncrcbihkd";
        System.out.println(longestCommonSubsequence(text1,text2));
    }
}
