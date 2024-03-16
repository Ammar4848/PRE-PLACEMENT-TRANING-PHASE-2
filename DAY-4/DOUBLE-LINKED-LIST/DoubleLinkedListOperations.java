import java.util.*;
public class DoubleLinkedListOperations {
    class CreateNode{
        int data;
        CreateNode left,right;
        public CreateNode(){
            right = null;
            left = null;
        }
    }
    CreateNode head=null;
    CreateNode tail=null;

    public void append(int data){
        CreateNode newNode = new CreateNode();
        newNode.data = data;
        if (head==null) {
            head = newNode;
            tail = newNode;
            System.out.println("Node "+data+" is added into LinkList");
        }
        else{
            tail.right = newNode;
            newNode.left = tail;
            tail = newNode;
            System.out.println("Node "+data+" is added into LinkList");
        }
    }

    public void addAtBegin(int data){
        CreateNode newNode = new CreateNode();
        newNode.data = data;
        newNode.right = head;
        head.left = newNode;
        head = newNode;
        System.out.println("Node "+data+" is added into the begin of the LinkList");
    }

    public void addAtAfter(int data,int position){
        CreateNode newNode = new CreateNode();
        CreateNode ptr = head;
        while (ptr.data!=position) {
            ptr = ptr.right;
        }
        CreateNode temp = ptr.right;
        newNode.data = data;
        ptr.right = newNode;
        newNode.left = ptr;
        newNode.right = temp;
        temp.left = newNode;
    }

    public void deleteAtBegin(){
        head = head.right;
        head.left = null;
    }

    public void deleteAtMiddle(int node){
        CreateNode ptr = head;
        while (ptr.right.data != node) {
            ptr = ptr.right;
        }
        ptr.right = ptr.right.right;
        ptr.right.left = ptr;
    }

    public void deleteAtEnd(){
        tail = tail.left;
        tail.right = null;
    }

    public void traverse(){
        CreateNode ptr = head;
        while (ptr!=null) {
            System.out.print(ptr.data+" --> ");
            ptr = ptr.right;
        }
    }
    public static void main(String[] args) {
        DoubleLinkedListOperations obj = new DoubleLinkedListOperations();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n*******************************************");
            System.out.println("Enter your choice: ");
            System.out.println("1. Append");
            System.out.println("2. Add at Begin");
            System.out.println("3. Add at After");
            System.out.println("4. Delete at Begin");
            System.out.println("5. Delete at Middle");
            System.out.println("6. Delete at End");
            System.out.println("7. Display");
            System.out.println("8. Exit");
            System.out.println("*******************************************");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data: ");
                    int data = sc.nextInt();
                    obj.append(data);
                    break;
                case 2:
                    System.out.println("Enter the data: ");
                    int data1 = sc.nextInt();
                    obj.addAtBegin(data1);
                    break;
                case 3:
                    System.out.println("Enter the data: ");
                    int data2 = sc.nextInt();
                    System.out.println("Enter the position: ");
                    int position = sc.nextInt();
                    obj.addAtAfter(data2, position);
                    break;
                case 4:
                    obj.deleteAtBegin();
                    break;
                case 5:
                    System.out.println("Enter the Node You want to delete: ");
                    int node = sc.nextInt();
                    obj.deleteAtMiddle(node);
                    break;
                case 6:
                    obj.deleteAtEnd();
                    break;
                case 7:
                    obj.traverse();
                    break;
                case 8:
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