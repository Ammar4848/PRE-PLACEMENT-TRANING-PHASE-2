import java.util.*;
class SingleLinkedListOperations{
    class CreateNode{
        int data;
        CreateNode next;
        public CreateNode(){
            next = null;
        }
    }
    CreateNode head=null;

    public void append(int data){
        CreateNode newNode = new CreateNode();
        newNode.data = data;
        if (head==null) {
            head = newNode;
        }
        else{
            CreateNode ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next=newNode;
        }
    }

    public void deleteAtMiddle(int pos){
        CreateNode ptr = head;
        while (pos > 1) {
            ptr = ptr.next;
            pos--;
        }
        ptr.next = ptr.next.next;
    }

    public void traverse(){
        CreateNode ptr = head;
        while (ptr!=null) {
            System.out.print(ptr.data+" --> ");
            ptr = ptr.next;
        }
    }
}

public class DeleteMiddleOfLinkList {
    public static void main(String[] args) {
        SingleLinkedListOperations list = new SingleLinkedListOperations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list");
        int n = sc.nextInt();
        int size = n;
        System.out.println("Enter the elements of the list");
        while (n-- > 0) {
            list.append(sc.nextInt());
        }
        System.out.println("Input List");
        list.traverse();
        int middle = size/2;
        list.deleteAtMiddle(middle);
        System.out.println("\nList after deleting middle element");
        list.traverse();
        sc.close();
    }
}