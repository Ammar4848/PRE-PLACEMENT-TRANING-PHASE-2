import java.util.*;
class StackOperations{
    final int capacity;
    char stack[];
    StackOperations(int capacity){
        this.capacity = capacity;
        stack = new char[capacity];
    }
    int top =-1;
    public boolean isEmpty() {
        if (top ==-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (top == capacity-1){
            return true;
        }else{
            return false;
        }
    }
    public void push(char val){
        if (!isFull()){
            stack[++top] = val;
        }else{
            System.out.println("Stack is full");
        }
    }
    public int pop(){
        int temp = stack[top];
        if (!isEmpty()){
            stack[top] = 0;
            top--;
        }else{
            System.out.println("Stack is empty");
        }
       return temp;
    }
}

public class DeleteMiddleUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Stack: ");
        int n = sc.nextInt();
        StackOperations s = new StackOperations(n);
        System.out.println("Enter the elements of Stack: ");
        for (int i=0;i<n;i++){
            s.push((char)sc.nextInt());
        }
        int top = n/2;
        StackOperations temp = new StackOperations(n);
        for (int i=0;i<top;i++){
            temp.push((char)s.pop());
        }
        s.pop();
        for (int i=0;i<top;i++){
            s.push((char)temp.pop());
        }
        System.out.println("Stack after deleting middle element: ");
        for (int i=0;i<n-1;i++){
            System.out.print((int)s.pop()+" ");
        }
        sc.close();
    }
}