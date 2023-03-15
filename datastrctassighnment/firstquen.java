public class MMUSTLinkedln {
    
    // Inner class for linked list operations
    private class Node {
        private String data;
        private Node next;
        
        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node head;
    private int size;
    
    // Constructor
    public MMUSTLinkedln() {
        head = null;
        size = 0;
    }
    
    // Method to add a new node to the list
    public void addNode(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        size++;
    }
    
    // Method to display the contents of the list
    public void displayList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}
