package Assignment1;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] result =SLinkedlist.removeRandom(arr);//Q2
        System.out.println("after remove random: "+Arrays.toString(result));

        SLinkedlist.reverse(arr);//Q4
        System.out.println("after Reverse :"+Arrays.toString(arr));

        SLinkedlist list = new SLinkedlist();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.rotateRight(2);
        System.out.print("Rotated List: ");//Q6
        list.printList();

        System.out.println("Index of 3 : " + list.indexOf(3));//Q8

        Dlinkedlist list2 = new Dlinkedlist();
        list2.add(10);
        list2.add(20);
        list2.add(10);
        list2.add(30);
        list2.add(20);
        System.out.print("Before removing duplicates: ");
        list.printList();
        list2.removeDuplicates();//Q10
        System.out.print("After removing duplicates: ");
        list2.printList();

        System.out.println("is found? "+list2.search(30));//Q12

        Clinkedlist list3 = new Clinkedlist();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.deleteAtPosition(0); //Q14
        System.out.print("After deleting position 0: ");
        list.printList();

        System.out.print("split list: \n");//Q16
        list3.splitList();
    }


    }

