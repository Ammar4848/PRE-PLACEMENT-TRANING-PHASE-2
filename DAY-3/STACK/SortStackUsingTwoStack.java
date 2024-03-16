import java.util.*;
class Stack {
    final int CAPACITY;
    int TOP = -1;
    private int[] arr;

    Stack(int capacity) {
        this.CAPACITY = capacity;
        this.arr = new int[capacity];
    }

    public void push(int element) {
        if (TOP == CAPACITY)
            throw new Error("Stack Overflow");
        TOP++;
        arr[TOP] = element;
    }

    public int pop() {
        if (TOP == -1) {
            throw new Error("Stack Underflow");
        }
        int poppedElement = arr[TOP];
        arr[TOP] = 0;
        TOP--;
        return poppedElement;
    }

    public int peek() {
        if (TOP == -1)
            return -1;
        return arr[TOP];
    }

    public String traverse() {
        if (TOP == -1)
            return "Stack Empty";
        String result = "";
        for (int i = 0; i <= TOP; i++) {
            result += arr[i] + " ";
        }
        return result;
    }
}

public class SortStackUsingTwoStack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of the stack");
        int capacity = sc.nextInt();
        Stack s1 = new Stack(capacity);
        System.out.println("Enter the elements of the stack");
        for (int i = 0; i < capacity; i++) {
            s1.push(sc.nextInt());
        }
        System.out.println("Input: "+s1.traverse());
        Stack s2 = new Stack(s1.CAPACITY);
        while(s1.TOP!=-1){
            int temp = s1.pop();
            while(s2.TOP!=-1 && s2.peek()>temp){
                s1.push(s2.pop());
            }
            s2.push(temp);
        }
        System.out.println("Output: "+s2.traverse());
        sc.close();
    }
}