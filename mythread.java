class MyThread extends Thread {
    public void run() {
        for(int i=2;i<=3;i++){
        System.out.println("thread is running" +i);
        try {
            Thread.sleep(500);
            
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
  
}
class MyThread1 extends Thread {
    public void run(){
        System.out.println("thread 1 is running");
    }

}
public class mythread {
    public static void main(String[] args) {
        MyThread t1 =  new MyThread();
        MyThread1 t2 =  new MyThread1();
        t1.start();
        t2.start();
        try {
            
       t1.join();
       t2.join();
        } catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("The main Thread end...");

    }

}
