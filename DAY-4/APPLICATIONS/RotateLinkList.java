import java.util.*;
class LinkedList {
    class GetNode {
        int data;
        GetNode next;
        GetNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    GetNode head;
    LinkedList() {
        head = null;
    }
    public void add(int data) {
        GetNode newNode = new GetNode(data);
        if (head == null) {
            head = newNode;
        } else {
            GetNode temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = newNode;
        }
    }
    public void delete() {
        head = head.next;
    }
    public int peekFirst() {
        return head.data;
    }
    public void traverse() {
        GetNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class RotateLinkList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the list");
        while (n-- > 0) {
            list.add(sc.nextInt());
        }
        System.out.println("Input List");
        list.traverse();
        System.out.println("Enter the number of rotations");
        int k = sc.nextInt();
        while (k>0) {
            list.add(list.peekFirst());
            list.delete();
            k--;
        }
        System.out.println("List after rotation");
        list.traverse();
        sc.close();
    }
}