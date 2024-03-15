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
public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of Array: ");
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        StackOperations s = new StackOperations(n);
        for (int i=0;i<n;i++){
            s.push((char)arr[i]);
        }
        System.out.println("Reversed Array: ");
        for (int i=0;i<n;i++){
            System.out.print((int)s.pop()+" ");
        }
        sc.close();
    }   
}