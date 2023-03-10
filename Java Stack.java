import java.util.*;

public class BalancedParentheses {
    
    public static void main(String... vamsi) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(isBalanced(s));
        }
        
        sc.close();
    }
    
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>(); 
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.peek(); 
                if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    stack.pop(); 
                } else {
                    return false; 
                }
            }
        }
        return stack.isEmpty(); 
}
}
