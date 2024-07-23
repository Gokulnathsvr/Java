public class MaxWordsInSentence {
    public int maxWords(String[] sentences) {
        int maxWords = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            maxWords = Math.max(maxWords, words.length);
        }
        return maxWords;
    }

    public static void main(String[] args) {
        MaxWordsInSentence solution = new MaxWordsInSentence();
        String[] sentences1 = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(solution.maxWords(sentences1));
    }
        
}

