package Assignment1;
import java.util.Random;

public class SLinkedlist {
    Node head=null;
    //question 2:
    public static int[]  removeRandom(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }

        Random rand = new Random();
        int randomIndex = rand.nextInt(arr.length);

        int[] newArr = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != randomIndex) {
                newArr[j++] = arr[i];
            }
        }

        return newArr;
    }

    //Question4:
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    //Question6:
    public void rotateRight(int k) {
        if (head == null || head.next == null || k == 0)
            return;

        Node current = head;
        int length = 1;

        while (current.next != null) {
            current = current.next;
            length++;
        }

        current.next = head;

        k = k % length;
        int stepsToNewHead = length - k;

        Node newTail = current;
        while (stepsToNewHead-- > 0) {
            newTail = newTail.next;
        }
        head = newTail.next;
        newTail.next = null;
    }

    //Question8:
    public int indexOf(int value) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == value) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
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
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void printList() {
        Node temp = head;        // ابدأ من رأس القائمة
        while (temp != null) {   // استمر حتى آخر عنصر
            System.out.print(temp.data + " "); // اطبع بيانات العقدة
            temp = temp.next;    // انتقل للعقدة التالية
        }
        System.out.println();    // سطر جديد بعد الطباعة
    }

}
