
class counter {
    int count = 0;
    public void Increment(){
        count++;
    }
}

public class count {
    public static void main(String[] args)throws InterruptedException{
        counter counter = new counter();
        Runnable task = () ->{
            for(int i=1; i<=1000000; i++){
                counter.Increment();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();


        t1.join();
        t2.join();
    
        System.out.println("Final value of counter is : " + counter.count);
    }  
    
}

