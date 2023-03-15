public class Queue {

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    // Constructor
    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    // Method to add an element to the rear of the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Method to remove and return the front element of the queue
    public int dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    // Method to return the front element of the queue without removing it
    public int peek() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Method to return the size of the queue
    public int size() {
        return size;
    }

    // Main method to test the queue
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front element: " + queue.peek()); // Output: Front element: 1
        System.out.println("Queue size: " + queue.size()); // Output: Queue size: 3

        while (!queue.isEmpty()) {
            System.out.println("Dequeued element: " + queue.dequeue());
        }
        // Output:
        // Dequeued element: 1
        // Dequeued element: 2
        // Dequeued element: 3
    }
}

