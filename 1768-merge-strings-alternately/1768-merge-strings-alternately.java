class Solution {
    public String mergeAlternately(String word1, String word2) {
        int word1Pointer = 0;
        int word2Pointer = 0;
        boolean checkLoop1 = true;
        boolean checkLoop2 = true;

        StringBuffer mergedString = new StringBuffer();

        while (checkLoop1 || checkLoop2) {
            if (word1Pointer == word1.length()) {
                checkLoop1 = false;
            } else {
                mergedString.append(word1.charAt(word1Pointer));
                word1Pointer++;
            }
            if (word2Pointer == word2.length()) {
                checkLoop2 = false;
            } else {
                mergedString.append(word2.charAt(word2Pointer));
                word2Pointer++;
            }
        }

        String result = mergedString.toString();

        return result;
    }
}