import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTool {
//要复制的文件的路径
	private String shur;
//被拷贝到的文件的路径
	private String shuc;
	//输入流
	private InputStream inputStream = null;
	//输出流
	private OutputStream outputStream = null;
	
	public FileCopyTool(String shur,String shuc) {
		//1.先判断文件是否存在
		this.shuc = shuc;
		this.shur = shur;
		//要复制的文件
		File filer = new File("shuru.txt");
		if (filer.exists()) {
			System.out.println("我帮你创建了一个，要是不想要使用时可以把它删掉");
			try {
				filer.createNewFile();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else {
			System.out.println(shur);
			System.err.println("文件不存在");
			System.exit(0);
		}
		//复制到的文件
		File filec = new File("shuchu.txt");
		// TODO 自动生成的构造函数存根
		try {
			inputStream = new FileInputStream(filer);
			outputStream = new FileOutputStream(filec);
			//读取数据
			byte[] bs = new byte[1024];
			int len = -1;
			while((len = inputStream.read()) != -1) {
				outputStream.write(bs);
				outputStream.flush();
				System.out.println("复制完成");
			}
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}

			
}
