public class AThread extends Thread {
    public AThread(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        System.out.println("������߳�:"+this.getName());
    }
}
