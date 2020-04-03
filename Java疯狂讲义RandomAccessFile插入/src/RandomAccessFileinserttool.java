import java.io.*;

public class RandomAccessFileinserttool {
    private String insertContent;
    private long pos;
    private String file;
    public void insert(String insertContent,long pos,String file) throws IOException {
        //初始化
        this.insertContent = insertContent;
        this.pos = pos;
        this.file = file;
        //创建临时文件来保存插入点后的数据
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
        //重新将文件指针放到pos点
        randomAccessFile.seek(pos);
        randomAccessFile.write(insertContent.getBytes());
        while ((hasRead = fileInputStream.read(bytes))>0){
            randomAccessFile.write(bytes,0,hasRead);
        }
    }
}
