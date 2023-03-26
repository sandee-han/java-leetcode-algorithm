class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        StringBuilder sb = new StringBuilder(s);

        int checkLength;

        while (sb.length() > 0) {

            checkLength = sb.length();

            for (int i = 1; i < sb.length(); i++) {
                if (sb.charAt(i) == ')') {
                    if (sb.charAt(i - 1) == '(') {
                        sb.delete(i - 1, i + 1);
                        i = 0;
                    } else {
                        return false;
                    }
                } else if (sb.charAt(i) == '}') {
                    if (sb.charAt(i - 1) == '{') {
                        sb.delete(i - 1, i + 1);
                        i = 0;
                    } else {
                        return false;
                    }
                } else if (sb.charAt(i) == ']') {
                    if (sb.charAt(i - 1) == '[') {
                        sb.delete(i - 1, i + 1);
                        i = 0;
                    } else {
                        return false;
                    }
                }
            }
            if (sb.length() == checkLength) {
                return false;
            }
        }
        return true;
    }
}