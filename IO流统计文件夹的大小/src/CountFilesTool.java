import java.io.File;
import java.util.concurrent.CancellationException;

public class CountFilesTool {

	//�ļ���·��
	private String path;
	//�ļ��еĸ���
	//�ļ��ĸ���
	private long fileSize;
	private long dirSize;
	public long getDirSize() {
		return dirSize;
	}
//	public void setDirSize(long dirSize) {
//		this.dirSize = dirSize;
//	}
	public long getFileSize() {
		return fileSize;
	}
//	public void setFileSize(long fileSize) {
//		this.fileSize = fileSize;
//	}

	//��С
	private long len;
	public long getLen() {
		return len;
	}//private��ȡlen��ֵ
//	public void setLen(long len) {
//		this.len = len;
//	}
	//Դ
	private File src;
	//���췽��
	public CountFilesTool(String string) {
		// TODO �Զ����ɵĹ��캯�����
		this.path = string;
		this.src = new File(path);
		count(src);
	}
//	public File getSrc() {
//		return src;
//	}
//	public void setSrc(File src) {
//		this.src = src;
//	}
//	//�����ļ��еĴ�С
	private void count(File file ) {
		//��ȡ�ļ��Ĵ�С
		if (null != file && file.exists()) {
			if (file.isFile()) {//����Ż��д�С
				len += file.length();
				this.fileSize++;
			}else {//���Ｖ
				this.dirSize++;
				for (File file2 : file.listFiles()) {
					count(file2);
				}
			}
		}
	}
}
