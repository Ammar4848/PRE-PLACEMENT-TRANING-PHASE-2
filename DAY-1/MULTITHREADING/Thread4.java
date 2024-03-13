//Creating a Thread and Settting the priority of the Thread.
public class Thread4 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        Thread4 t1 = new Thread4();
        Thread4 t2 = new Thread4();
        Thread4 t3 = new Thread4();
        t1.setPriority(4);
        t2.setPriority(2);
        t3.setPriority(6);
        System.out.println("By Default Thread Priority");
        System.out.println("Thread Priority of t1: "+t1.getPriority());
        System.out.println("Thread Priority of t2: "+t2.getPriority());
        System.out.println("Thread Priority of t3: "+t3.getPriority());
        t1.start();
        t2.start();
        t3.start();

        
        // System.out.println("After Setting Thread Priority");
        // System.out.println("Thread Priority of t1: "+t1.getPriority());
        // System.out.println("Thread Priority of t2: "+t2.getPriority());
        // System.out.println("Thread Priority of t3: "+t3.getPriority());
        // System.out.println("Name of Current Thread: "+Thread.currentThread().getName());
        // System.out.println("Default Thread Priority of Main Thread: "+Thread.currentThread().getPriority());
        // Thread.currentThread().setPriority(10);
        // System.out.println("New Thread Priority of Main Thread: "+Thread.currentThread().getPriority());
    }
}