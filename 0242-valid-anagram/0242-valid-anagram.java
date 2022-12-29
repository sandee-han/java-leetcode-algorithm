class Solution {
        public boolean isAnagram(String s, String t) {
        int[] sFreq = new int[26];
        int[] tFreq = new int[26];

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            sFreq[s.charAt(i) - 97]++;
            tFreq[t.charAt(i) - 97]++;
        }

        int count = 0;
        while (count < 26) {
            if (sFreq[count] != tFreq[count]) {
                return false;
            }
            count++;
        }

        return true;
    }
}