public class Test implements Runnable {
private int tickname = 99;
    @Override
    public void run() {
        while (true){
            if (tickname<0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--> "+tickname--);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        new Thread(test,"A").start();
        new Thread(test,"B").start();
        new Thread(test,"C").start();

    }
}
