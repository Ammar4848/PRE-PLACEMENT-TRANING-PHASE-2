// Creating a Thread by extending Thread Class.
class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=10;++i){
            System.out.println("Child Thread"+i);
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
        for(int i=1;i<=10;++i){
            System.out.println("Main Thread"+i);
        }
    }
}