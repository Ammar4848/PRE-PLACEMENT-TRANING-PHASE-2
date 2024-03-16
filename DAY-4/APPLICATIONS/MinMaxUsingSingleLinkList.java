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

    public void traverse(){
        CreateNode ptr = head;
        while (ptr!=null) {
            System.out.print(ptr.data+" --> ");
            ptr = ptr.next;
        }
    }

    public void getMin(){
        CreateNode ptr = head;
        int min = ptr.data;
        while (ptr!=null) {
            if (ptr.data<min) {
                min = ptr.data;
            }
            ptr = ptr.next;
        }
        System.out.println("\nMinimum value in the list is: "+min);
    }

    public void getMax(){
        CreateNode ptr = head;
        int max = ptr.data;
        while (ptr!=null) {
            if (ptr.data>max) {
                max = ptr.data;
            }
            ptr = ptr.next;
        }
        System.out.println("Maximum value in the list is: "+max);
    }
}

public class MinMaxUsingSingleLinkList {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedListOperations obj = new SingleLinkedListOperations();
        System.out.println("Enter the number of elements you want to add in the list: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            obj.append(sc.nextInt());
        }
        System.out.println("The list is: ");
        obj.traverse();
        obj.getMin();
        obj.getMax();
        sc.close();
      } 
}