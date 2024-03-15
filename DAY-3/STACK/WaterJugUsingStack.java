class StackOperations{
    final int capacity=10;
    int stack[] = new int[capacity];
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

    public void push(int val){
        if (!isFull()){
            stack[++top] = val;
        }else{
            System.out.println("Stack is full");
        }
    }

    public void pop(){
        if (!isEmpty()){
            stack[top] = 0;
            top--;
        }else{
            System.out.println("Stack is empty");
        }
    }
}

public class WaterJugUsingStack {
    int itr = 1;
    StackOperations s1 = new StackOperations();
    StackOperations s2 = new StackOperations();

    public void show(){
        System.out.println("\tIteration: "+itr++);
        System.out.println("---------------------------------");
        System.out.println("|\t"+"Jug 1"+"\t|\t"+"Jug 2"+"\t|");
        System.out.println("---------------------------------");
        for (int i=4;i>=0;i--){
            System.out.println("|\t"+s1.stack[i]+"\t|\t"+s2.stack[i]+"\t|");
            System.out.println("---------------------------------");
        }
        
    }
    public static void main(String[] args) {
        WaterJugUsingStack h = new WaterJugUsingStack();

        for(int i=0;i<5;i++){
            h.s1.push(1);
        }
        h.show();

        for(int i=0;i<3;i++){
            h.s1.pop();
            h.s2.push(1);
        }
        h.show();

        for(int i=0;i<3;i++){
            h.s2.pop();
        }
        h.show();

        for(int i=0;i<2;i++){
            h.s1.pop();
            h.s2.push(1);
        }
        h.show();

        for(int i=0;i<5;i++){
            h.s1.push(1);
        }
        h.show();

        for(int i=0;i<1;i++){
            h.s1.pop();
            h.s2.push(1);
        }
        h.show();

        for(int i=0;i<3;i++){
            h.s2.pop();
        }
        h.show();
    }
}