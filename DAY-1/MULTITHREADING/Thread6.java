//Creating a Thread and using Join method.
class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=10;++i){
            System.out.println("Child Thread"+i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class Thread6 {
    public static void main(String[] args) throws InterruptedException{
        MyThread m = new MyThread();
        m.start();
        m.join();
        for(int i=1;i<=10;++i){
            System.out.println("Main Thread"+i);
        }
    }
}