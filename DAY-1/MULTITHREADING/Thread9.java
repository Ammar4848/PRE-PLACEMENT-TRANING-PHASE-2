//Creating a Daemon Thread.
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Demon Thread : "+i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Thread9 {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.setDaemon(true);
        m.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread : "+i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}