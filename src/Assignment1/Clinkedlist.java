package Assignment1;

public class Clinkedlist {

        Node head = null;
        //Q14
        public void deleteAtPosition(int position) {
            if (head == null) return;

            Node temp = head;

            if (position == 0) {
                if (head.next == head) {
                    head = null;
                    return;
                }

                Node last = head;
                while (last.next != head) {
                    last = last.next;
                }

                head = head.next;
                last.next = head;
                return;
            }

            Node prev = null;
            int count = 0;
            do {
                prev = temp;
                temp = temp.next;
                count++;
            } while (temp != head && count != position);

            if (temp == head) return;

            prev.next = temp.next;
        }

        //Question16
        public void splitList() {
            if (head == null || head.next == head) {
                System.out.println("لا يمكن تقسيم قائمة فارغة أو تحتوي عنصر واحد");
                return;
            }

            Node slow = head;
            Node fast = head;


            while (fast.next != head && fast.next.next != head) {
                slow = slow.next;
                fast = fast.next.next;
            }

            Node head1 = head;
            Node head2 = slow.next;

            slow.next = head1;

            Node temp = head2;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head2;

            System.out.print("First half: ");
            printCircularList(head1);

            System.out.print("Second half: ");
            printCircularList(head2);
        }
        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                newNode.next = head;
                return;
            }

            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        public void printList() {
            if (head == null) return;

            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    public void printCircularList(Node start) {
        if (start == null) return;
        Node temp = start;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != start);
        System.out.println();
    }



}
