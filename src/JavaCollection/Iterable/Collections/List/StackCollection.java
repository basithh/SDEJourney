package JavaCollection.Iterable.Collections.List;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Ayush");
        stack.add("df");
        stack.remove("df");
        stack.pop();
        System.out.println(stack);
    }
}
