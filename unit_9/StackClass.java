package unit_9;

import java.util.*;

public class StackClass {

    // Push elements onto the stack
    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    // Pop elements from the stack
    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop:");
        for (int i = 0; i < 5; i++) {
            Integer y = stack.pop();
            System.out.println(y);
        }
    }

    // Peek at the top element
    static void stack_peek(Stack<Integer> stack) {
        Integer element = stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    // Search for an element in the stack
    static void stack_search(Stack<Integer> stack, int element) {
        int pos = stack.search(element);
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is found at position: " + pos);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack_push(stack);           // Push 0 to 4
        stack_pop(stack);            // Pop all
        stack_push(stack);           // Push again 0 to 4
        stack_peek(stack);           // Show top
        stack_search(stack, 2);      // Search 2
        stack_search(stack, 6);      // Search 6 (not found)
    }
}

