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

    public void peek(){
        System.out.println("Element peeked on stack top: "+stack[top]);
    }
}


public class TowerOfHanoi {
    int itr = 1;
    StackOperations s1 = new StackOperations();
    StackOperations s2 = new StackOperations();
    StackOperations s3 = new StackOperations();

    public void show(){
        System.out.println("\t\tIteration: "+itr++);
        System.out.println("-------------------------------------------------");
        System.out.println("|\t"+"Tower 1"+"\t|\t"+"Tower 2"+"\t|\t"+"Tower 3"+"\t|");
        System.out.println("-------------------------------------------------");
        for (int i=2;i>=0;i--){
            System.out.println("|\t"+s1.stack[i]+"\t|\t"+s2.stack[i]+"\t|\t"+s3.stack[i]+"\t|");
            System.out.println("-------------------------------------------------");
        }
        
    }
    public static void main(String[] args) {
        TowerOfHanoi h = new TowerOfHanoi();

        h.s1.push(3);
        h.s1.push(2);
        h.s1.push(1);
        h.show();

        h.s1.pop();
        h.s3.push(1);
        h.show();

        h.s1.pop();
        h.s2.push(2);
        h.show();

        h.s3.pop();
        h.s2.push(1);
        h.show();

        h.s1.pop();
        h.s3.push(3);
        h.show();

        h.s2.pop();
        h.s1.push(1);
        h.show();

        h.s2.pop();
        h.s3.push(2);
        h.show();

        h.s1.pop();
        h.s3.push(1);
        h.show();
    }
}