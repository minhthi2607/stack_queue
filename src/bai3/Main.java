package bai3;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < a.length; i++) {
            stack.push(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = stack.pop();
        }

        for (int x : a) {
            System.out.print(x + " ");
        }

        String str = "Hello World";

        Stack<String> stringStack  = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stringStack.push(str.substring(i, i+1));
        }

        StringBuilder reversed = new StringBuilder();
        while (!stringStack.isEmpty()) {
            reversed.append(stringStack.pop());
        }

        System.out.println(reversed.toString());
    }
}
