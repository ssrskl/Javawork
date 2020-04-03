package 捕获异常;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CatchTest {
	public static void main(String[] args) {
		try {
			int a =   1/0;
			System.out.println(a);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();//打印异常信息
			System.out.println("已捕获异常");
		}finally {
			System.out.println("异常执行完最终执行的语句");
		}
		FileReader reader=null;
		try {
			reader = new FileReader("d:/asda.txt");//这个为语句1
			char c = (char)reader.read();//这个为语句2
			//如果语句1抛出异常，则不会执行语句2
			/**
			 * FileNotFoundException是IOException的子类。
			 * 一般把子类异常放到前面，父类异常放到后面
			 * 否则异常都会在父类异常中执行
			 */
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			try {
				if(reader!=null) {
					reader.close();
				 }
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
	}
}
