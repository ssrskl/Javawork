import java.io.*;

public class Test {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            //循环获取键盘的输入（exit退出）,输出此内容
            String msg = "";
            while (!msg.equals("exit")){
                msg = bufferedReader.readLine();
                bufferedWriter.write(msg);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("操作失败");
        } finally {
        }
    }
}
