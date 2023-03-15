public class Stack {

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int size;

    // Constructor
    public Stack() {
        top = null;
        size = 0;
    }

    // Method to push a new element onto the stack
    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    // Method to pop the top element off the stack and return it
    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Method to return the top element of the stack without removing it
    public int peek() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to return the size of the stack
    public int size() {
        return size;
    }

    // Main method to test the stack
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek()); // Output: Top element: 3
        System.out.println("Stack size: " + stack.size()); // Output: Stack size: 3

        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }
        // Output:
        // Popped element: 3
        // Popped element: 2
        // Popped element: 1
    }
}
