//Creating a Thread and using yield method to pause the execution of the current thread and give the chance to remaining threads of same priority.
class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=10;++i){
            System.out.println("Child Thread"+i);
            Thread.yield();
        }
    }
}

public class Thread5 {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
        for(int i=1;i<=10;++i){
            System.out.println("Main Thread"+i);
        }
    }
}