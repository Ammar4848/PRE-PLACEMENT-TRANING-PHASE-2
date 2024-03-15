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
public class ReverseStringUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse: ");
        String str = sc.nextLine();
        StackOperations s = new StackOperations(str.length());
        for (int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        System.out.println("Reversed string: ");
        for (int i=0;i<str.length();i++){
            System.out.print((char)s.pop());
        }
        sc.close();
    }   
}