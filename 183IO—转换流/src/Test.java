import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            //ѭ����ȡ���̵����루exit�˳���,���������
            String msg = "";
            while (!msg.equals("exit")){
                msg = bufferedReader.readLine();
                bufferedWriter.write(msg);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("����ʧ��");
        } finally {
        }
    }
}
