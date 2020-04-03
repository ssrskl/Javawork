import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.sound.midi.Soundbank;

/**
 * 字节数组输出流
 * @author HASEE
 *
 */
public class Test {

	public static void main(String[] args) {
		byte[] dest = null;
		ByteArrayOutputStream baos = null;
		baos = new ByteArrayOutputStream();
		byte[] datas = "showmyway".getBytes();
		baos.write(datas,0,datas.length);
		try {
			baos.flush();
			dest = baos.toByteArray();//获取数据
			System.out.println(dest.length+"-->"+new String(dest,0,baos.size()));
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
