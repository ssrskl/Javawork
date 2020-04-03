import java.io.File;

/**
 * 递归头:何时结束递归
 * 递归体:重复调用
 * @author HASEE
 *
 */
public class Test {
	public static void main(String[] args) {
		printTen(1);
		File file = new File("D:\\JavaWork");
		printName(file);
	}
	public static void printTen(int n) {
		if (n>10) {
			return ;
		}
		System.out.println(n);
		printTen(n+1);
	}
	public static void printName(File n) {
		System.out.println(n.getName());
		if (null == n || !n.exists()) {
			return ; 
		}else if(n.isDirectory()){
			for(File s:n.listFiles()) {
				printName(s);
			}
		}
	}
}
