import java.util.*;
public class StackOperations {
    final int CAPACITY = 10;
    int top = -1;
    int stack[] = new int[CAPACITY];
    public boolean isfull() {
        if (top >= CAPACITY - 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isempty() {
        if (top < 0) {
            return true;
        } else {
            return false;
        }
    }
    public void push(int data) {
        if (isfull()) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = data;
            System.out.println("\n\n");
            System.out.println(data + " is pushed into stack");
        }
    }
    public void pop() {
        if (isempty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("\n\n");
            System.out.println(stack[top] + " is popped from stack");
            top--;
        }
    }
    public void peek() {
        if (isempty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("\n");
            System.out.println(stack[top] + " is at the top of stack");
        }
    }
    public void traverse() {
        if (isempty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println("__");
                System.out.println("|"+stack[i]+"|");
                System.out.println("--");
            }
        }
    }
    public static void main(String[] args) {
        StackOperations s = new StackOperations();
        while (true) {
            System.out.println("*********************************");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Traverse");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            System.out.println("*********************************");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter data:");
                    int data = sc.nextInt();
                    s.push(data);
                    break;
                case 2:
                    System.out.println("\n\n");
                    s.pop();
                    break;
                case 3:
                    System.out.println("\n\n");
                    s.peek();
                    break;
                case 4:
                    System.out.println("\n\n");
                    s.traverse();
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\n\n");
                    System.out.println("Invalid choice");
            }
        }
    }
}