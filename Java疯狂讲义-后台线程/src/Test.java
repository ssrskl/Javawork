public class Test extends Thread {
    public Test(){
        setName("后台线程");
    }
    @Override
    public void run() {
        for (int i = 0; i < 999 ; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        var t = new Test();
        t.setDaemon(true);//将线程t设置为后台线程
        t.start();
        for (int i = 0; i < 10 ; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        //主线程结束，则后台线程也结束
    }
}
