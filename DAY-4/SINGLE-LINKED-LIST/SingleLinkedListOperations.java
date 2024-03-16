import java.util.*;
public class SingleLinkedListOperations{
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

    public void addAtBegin(int data){
        CreateNode newNode = new CreateNode();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        System.out.println("Node "+data+" is added into the begin of the LinkList");
    }

    public void addAtAfter(int data,int position){
        CreateNode newNode = new CreateNode();
        CreateNode ptr = head;
        while (ptr.data!=position) {
            ptr = ptr.next;
        }
        CreateNode temp = ptr.next;
        newNode.data = data;
        ptr.next = newNode;
        newNode.next = temp;
    }

    public void deleteAtBegin(){
        head = head.next;
    }

    public void deleteAtMiddle(int node){
        CreateNode ptr = head;
        while (ptr.next.data != node) {
            ptr = ptr.next;
        }
        ptr.next = ptr.next.next;
    }

    public void deleteAtEnd(){
        CreateNode ptr = head;
        while (ptr.next.next != null) {
            ptr = ptr.next;
        }
        ptr.next = null;
    }

    public void traverse(){
        CreateNode ptr = head;
        while (ptr!=null) {
            System.out.print(ptr.data+" --> ");
            ptr = ptr.next;
        }
    }
    public static void main(String[] args) {
        
        SingleLinkedListOperations obj = new SingleLinkedListOperations();
        while (true) {
            System.out.println("\n*******************************************");
            System.out.println("Enter the operation you want to perform: ");
            System.out.println("1. Append");
            System.out.println("2. Add At Begin");
            System.out.println("3. Add At After");
            System.out.println("4. Delete At Begin");
            System.out.println("5. Delete At After");
            System.out.println("6. Delete At End");
            System.out.println("7. Traverse");
            System.out.println("8. Exit");
            System.out.println("*******************************************");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter Data: ");
                    int data = sc.nextInt();
                    obj.append(data);
                    break;

                case 2:
                    System.out.println("Enter Data: ");
                    int data1 = sc.nextInt();
                    obj.addAtBegin(data1);
                    break;
                    
                case 3:
                    System.out.println("Enter Data: ");
                    int data2=sc.nextInt();
                    System.out.println("Enter the position after which you want to enter: ");
                    int position=sc.nextInt();
                    obj.addAtAfter(data2,position);
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