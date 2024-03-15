public class ArrayRotationUsingQueue {
    final int CAPACITY = 10;
    int front = 0;
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
        if (front == 0 || front > rear) {
            return true;
        } else {
            return false;
        }
    }
    public void enqueue(int data) {
        if (isfull()) {
            System.out.println("Queue is full");
        } else {
            if (front == 0) {
                front = 1;
            }
            queue[++rear] = data;
        }
    }
    public static void main(String[] args) {
        ArrayRotationUsingQueue q = new ArrayRotationUsingQueue();
        int arr[] = {1, 2, 3, 4, 5};
        int d = 5;
        for (int i = 0; i < d; i++) {
            q.enqueue(arr[i]);
        }
        for (int i = 0; i < d; i++) {
            System.out.print(q.queue[i]+" ");
        }
    }
}