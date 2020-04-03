import java.io.File;
import java.util.concurrent.CancellationException;

public class CountFilesTool {

	//文件夹路径
	private String path;
	//文件夹的个数
	//文件的个数
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

	//大小
	private long len;
	public long getLen() {
		return len;
	}//private获取len的值
//	public void setLen(long len) {
//		this.len = len;
//	}
	//源
	private File src;
	//构造方法
	public CountFilesTool(String string) {
		// TODO 自动生成的构造函数存根
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
//	//计算文件夹的大小
	private void count(File file ) {
		//获取文件的大小
		if (null != file && file.exists()) {
			if (file.isFile()) {//这里才会有大小
				len += file.length();
				this.fileSize++;
			}else {//子孙级
				this.dirSize++;
				for (File file2 : file.listFiles()) {
					count(file2);
				}
			}
		}
	}
}
