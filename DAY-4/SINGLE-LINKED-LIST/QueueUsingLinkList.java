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

    public void enqueue(int data){
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

    public void dequeue(){
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

    public void front(){
        CreateNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        System.out.println("Front Element is: "+ptr.data);
    }

    public void rear(){
        CreateNode ptr = head;
        System.out.println("Rear Element is: "+ptr.data);
    }
}
public class QueueUsingLinkList {
    public static void main(String[] args) {
        SingleLinkedListOperations obj = new SingleLinkedListOperations();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n*******************************************");
            System.out.println("Enter your choice: ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Front");
            System.out.println("5. Rear");
            System.out.println("6. Exit");
            System.out.println("*******************************************");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data: ");
                    int data = sc.nextInt();
                    obj.enqueue(data);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    obj.front();
                    break;
                case 5:
                    obj.rear();
                    break;
                case 6:
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