class MultiThreadRunnable extends Parent implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getId());
    }
    public static void main(String[] args) {
        MultiThreadRunnable obj=new MultiThreadRunnable();
        Thread t=new Thread(obj);
        t.start();
    }
}