import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 文件字符输出流
 * @author HASEE
 *
 */
public class Test {

	public static void main(String[] args) {
		File file = new File("dest.txt");
		Writer writer = null;
		try {
			//写法一
			String string = "Oh ! 你啊太棒了！！";
			writer = new FileWriter(file);
			char[] datas = string.toCharArray();
			writer.write(datas,0,datas.length);
			writer.flush();
			//写法二
			writer.write(string+"哈哈哈哈");
			writer.flush();
			//写法三
			writer.append("啦啦啦啦啦").append("嘻嘻嘻嘻");
			writer.flush();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}
}
