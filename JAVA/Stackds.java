/*
A Stack is a linear data structure that follows the principle:
LIFO → Last In, First Out
 
| Operation     | Description                             | Example      |
| ------------- | --------------------------------------- | ------------ |
| **push(x)**   | Adds element `x` to the top of stack    | push(10)     |
| **pop()**     | Removes and returns the top element     | pop() → 10   |
| **peek()**    | Returns top element without removing it | peek() → 10  |
| **isEmpty()** | Checks if stack is empty                | true / false |
| **size()**    | Returns current size                    | 3            |
 
 */


import java.util.Stack;

public class Stackds {
    public static void main(String args){
        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Hollow Knight");
        stack.push("Children of sky");
        stack.push("Cult of the lamb");
        System.out.println(stack.empty());
        System.out.println("Stack: " + stack);
        
    }
    
}
