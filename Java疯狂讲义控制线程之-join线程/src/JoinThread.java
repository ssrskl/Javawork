public class JoinThread extends Thread {
    public JoinThread(String nmae){
        super(nmae);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        new JoinThread("新线程").start();
        //JoinThread joinThread = new JoinThread("xinxiancheng");
        //joinThread.start();}
        for (int i = 0; i < 100 ; i++) {
            if (i == 20) {
                JoinThread joinThread = new JoinThread("被join的线程");
                joinThread.start();
                /**
                 * mian调用了join方法，mian、必须等jt执行完才会向下执行
                 */
                try {
                    joinThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }

