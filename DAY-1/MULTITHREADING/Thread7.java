//Code to demonstrate the use of interrupt() method to interrupt a thread.
class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=5;++i){
            System.out.println("Child Thread"+i);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("Interrupted Exception Occured"+e);
            }
        }
    }
}

public class Thread7 {
    public static void main(String[] args) throws InterruptedException{
        MyThread m = new MyThread();
        m.start();
        m.interrupt();
        for(int i=1;i<=5;++i){
            System.out.println("Main Thread"+i);
        }
    }
}