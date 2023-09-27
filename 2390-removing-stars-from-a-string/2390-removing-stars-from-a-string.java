class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*' && stack.size() != 0) {
                stack.pop();
            } else if (s.charAt(i) != '*'){
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : stack) {
            sb.append(character);
        }
        s = sb.toString();

        return s;
    }
}