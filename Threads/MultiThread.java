public class MultiThread {
    public static void main(String[] args) {
        new Thread(new SampleY()).start();
        new Thread(new SampleY()).start();
        new Thread(new SampleY()).start();
        new Thread(new SampleY()).start();
        new Thread(new SampleY()).start();
        new Thread(new SampleY()).start();
        new Thread(new SampleY()).start();
        new Thread(new SampleY()).start();
        new Thread(new SampleY()).start();
        new Thread(new SampleY()).start();
    }
}

class SampleY implements Runnable {
    static int i;

    public synchronized void run() {
        System.out.println("this is from thread " + (++i));
    }
}