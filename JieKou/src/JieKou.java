
public class JieKou implements Jiek,Two{//可以实现多个父接口
	public static void main(String[] args) {
		
	}

	@Override
	public void test01() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void test02() {
		// TODO 自动生成的方法存根
		
	}
}
abstract class Anlimal{//包含抽象方法的类必须为抽象类
	//抽象方法父类没有实现，子类必须实现
	abstract public void shout();//抽象方法不需要方法体
	public void run() {
		System.out.println("跑");
	}
}
class Dog extends Anlimal{

	@Override
	public void shout() {
		// TODO 自动生成的方法存
		System.out.println("汪汪汪");
	}
	
}
