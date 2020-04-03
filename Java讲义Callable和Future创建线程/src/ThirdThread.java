import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThirdThread {
    public static void main(String[] args) {
        ThirdThread rt = new ThirdThread();
        FutureTask<Integer> task = new FutureTask<>((Callable<Integer>)()->{
            int i = 0;
            for ( ; i < 100 ; i++){
                System.out.println(Thread.currentThread().getName() + " ��ѭ������i��ֵ: " + i);
            }
            return i;
        });
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " ��ѭ������i��ֵ: " + i);
            if (i == 20){
                new Thread(task,"�з���ֵ���߳�").start();
            }
        }
        try {
            System.out.println("���̵߳ķ���ֵ: " + task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
