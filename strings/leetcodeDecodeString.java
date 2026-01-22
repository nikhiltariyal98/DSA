package strings;

import java.util.Stack;

public class leetcodeDecodeString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            // Process only when we hit a closing bracket
            if (c == ']') {
                StringBuilder temp = new StringBuilder();
                
                // 1. Pop characters until '['
                while (!st.isEmpty() && st.peek() != '[') {
                    temp.append(st.pop());
                }
                
                // 2. Remove '['
                if (!st.isEmpty()) st.pop();

                // 3. Get the number (your base/num logic works great here)
                int num = 0;
                int base = 1;
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    num += (st.pop() - '0') * base;
                    base *= 10;
                }

                // 4. Repeat the string (Reverse 'temp' first because stack is LIFO)
                String decodedSegment = temp.reverse().toString().repeat(num);

                // 5. Push back to stack as characters
                for (char d : decodedSegment.toCharArray()) {
                    st.push(d);
                }
            } else {
                // Just push numbers, letters, and '[' onto the stack
                st.push(c);
            }
        }

        // Final result assembly
        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }
        System.out.println(res.reverse().toString());
    }
}