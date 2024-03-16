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

    public void push(int data){
        CreateNode newNode = new CreateNode();
        newNode.data = data;
        if (head==null) {
            head = newNode;
            System.out.println("Node "+data+" is added into LinkList");
        }
        else{
            CreateNode ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next=newNode;
            System.out.println("Node "+data+" is added into LinkList");
        }
    }

    public void pop(){
        CreateNode ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next = null;
    }

    public void display(){
        CreateNode ptr = head;
        while (ptr != null) {
            System.out.println(ptr.data+" ");
            ptr = ptr.next;
        }
        System.out.println();
    }

    public void peek(){
        CreateNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        System.out.println("Peek Element is: "+ptr.data);
    }
}
public class StackUsingLinkList {
    public static void main(String[] args) {
        SingleLinkedListOperations obj = new SingleLinkedListOperations();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n*******************************************");
            System.out.println("Enter your choice: ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.println("5. Exit");
            System.out.println("*******************************************");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data: ");
                    int data = sc.nextInt();
                    obj.push(data);
                    break;

                case 2:
                    obj.pop();
                    break;

                case 3:
                    obj.display();
                    break;

                case 4:
                    obj.peek();
                    break;

                case 5:
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}