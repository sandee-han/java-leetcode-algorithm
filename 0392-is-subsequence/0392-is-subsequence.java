class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0;

        if (s.equals(t) || s.equals("")) {
            return true;
        }

        if (s.length() > t.length()) {
            return false;
        }

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(sPointer) == t.charAt(i)){
                sPointer++;
            }
            
            if (sPointer == s.length()) {
                return true;
            }
        }
        
        return false;
    }
}