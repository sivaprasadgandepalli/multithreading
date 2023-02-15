class WorkerThread extends Thread{
    private int num;

    public WorkerThread(final int num) {
        this.num = num;

    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(num+" x "+i+" = "+(num*i));
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}

public class task1{
    public static void main(final String[] args) {
        System.out.println("program started");
        WorkerThread obj1 = new WorkerThread(2);
        final Thread t1 = new Thread(obj1);
        t1.start();
        t1.setName("first thread");
        WorkerThread obj2 = new WorkerThread(5);
        final Thread t2 = new Thread(obj2);
        t2.start();
        t2.setName("second thread");
        WorkerThread obj3 = new WorkerThread(3);
        final Thread t3 = new Thread(obj3);
        t3.start();
        t3.setName("third thread");
        WorkerThread obj4 = new WorkerThread(4);
        final Thread t4 = new Thread(obj4);
        t4.start();
        t4.setName("fourth thread");
        // System.out.println("ending");
    }

}
