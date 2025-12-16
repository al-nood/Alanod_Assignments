package Assignment1;

public class Dlinkedlist {
    Node head;
    //Question10
    public void removeDuplicates() {
        Node current = head;

        while (current != null) {
            Node runner = current.next;

            while (runner != null) {
                if (runner.data == current.data) {
                    Node nextNode = runner.next;

                    if (runner.prev != null) {
                        runner.prev.next = runner.next;
                    }
                    if (runner.next != null) {
                        runner.next.prev = runner.prev;
                    }

                    runner = nextNode;
                } else {
                    runner = runner.next;
                }
            }

            current = current.next;
        }
    }

    //Question12
    public boolean search(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
