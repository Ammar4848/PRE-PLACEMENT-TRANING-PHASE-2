import java.util.*;
public class QueueOperations {
    final int CAPACITY = 10;
    int front = -1;
    int rear = -1;
    int queue[] = new int[CAPACITY];
    public boolean isfull() {
        if (rear == CAPACITY - 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isempty() {
        if (front == -1 || front > rear) {
            return true;
        } else {
            return false;
        }
    }
    public void enqueue(int data) {
        if (isfull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            queue[++rear] = data;
            System.out.println("\n\n");
            System.out.println(data + " is enqueued into queue");
        }
    }
    public void dequeue() {
        if (isempty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("\n\n");
            System.out.println(queue[front] + " is dequeued from queue");
            front++;
        }
    }
    public void display() {
        if (isempty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements are:");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        QueueOperations q = new QueueOperations();
        while (true) {
            System.out.println("\n*********************************");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("*********************************");
            System.out.println("Enter your choice:");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be enqueued:");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}