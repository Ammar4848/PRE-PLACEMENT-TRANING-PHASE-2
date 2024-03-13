// Code to demonstrate the use of synchronized keyword in multithreading.
class A{
    public static synchronized void print(String name){
        for(int i=1;i<=3;i++){
            System.out.println("Batting = "+name);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Thread1 extends Thread{
    public void run(){
        A.print("Ammar");
    }
}
class Thread2 extends Thread{
    public void run(){
        A.print("Anurag");
    }
}
class Thread3 extends Thread{
    public void run(){
        A.print("Bharat");
    }
}
public class Thread8 {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
        new Thread3().start();
    }
}