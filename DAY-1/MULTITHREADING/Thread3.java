//Getname and Setname of a Thread in Java.
class Thread3 extends Thread{
    //public void run(){ }
    public static void main(String[] args) {
        Thread3 t = new Thread3();
        Thread3 t1 = new Thread3();
        System.out.println("Name of Thread One: "+t.getName());
        System.out.println("Name of Thread Two: "+t1.getName());
        t.start();
        t1.start();
        t.setName("Ammar-1");
        System.out.println("Name of Thread One: "+t.getName());
        System.out.println("Name of Thread Two: "+t1.getName());
        System.out.println("Name of Current Thread: "+Thread.currentThread().getName());
    }
}