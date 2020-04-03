import java.io.*;

public class RandomAccessFileinserttool {
    private String insertContent;
    private long pos;
    private String file;
    public void insert(String insertContent,long pos,String file) throws IOException {
        //��ʼ��
        this.insertContent = insertContent;
        this.pos = pos;
        this.file = file;
        //������ʱ�ļ�����������������
        var tmp = File.createTempFile("tmp",null);
        tmp.deleteOnExit();
        RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw");
        FileOutputStream fileOutputStream = new FileOutputStream(tmp);
        FileInputStream fileInputStream = new FileInputStream(tmp);
        randomAccessFile.seek(pos);
        byte[] bytes = new byte[1024];
        var hasRead = 0;
        while ((hasRead = randomAccessFile.read(bytes))>0){
            fileOutputStream.write(bytes,0,hasRead);
        }
        //���½��ļ�ָ��ŵ�pos��
        randomAccessFile.seek(pos);
        randomAccessFile.write(insertContent.getBytes());
        while ((hasRead = fileInputStream.read(bytes))>0){
            randomAccessFile.write(bytes,0,hasRead);
        }
    }
}
