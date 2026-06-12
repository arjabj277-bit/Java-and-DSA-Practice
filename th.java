class EvenThread extends Thread {

    public void run() {
        for (int i = 2; i <= 10; i = i + 2) {

            System.out.println("Even : " + i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Exception");
            }
        }
    }
}

class OddThread extends Thread {

    public void run() {
        for (int i = 1; i <= 9; i = i + 2) {

            System.out.println("Odd : " + i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

public class th {

    public static void main(String[] args) {

        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();
        t1.start();
        t2.start();
    }
}
