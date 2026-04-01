class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()) {
            if(!stack.isEmpty()) {
                char c = stack.peek();
                if((c == '(' && ch == ')') || (c == '{' && ch == '}') || (c == '[' && ch == ']')) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
    }
}
