
public class TestinClass {
	public static void main(String[] args) {
		//创建内部类对象
		One.Two two = new One().new Two();//先创建外部类对象，再创建内部类对象
		two.name2();
		Three.Four fouu = new Three.Four();
		fouu.four();
	}
}
//非静态内部类
class One{
	//外部类不能访问内部类的属性
	int number=100;
	public void name() {}
		class Two{
			//非静态内部类不能有静态属性和方法
		//	static int b=999;
			int age=98;
			public void name2() {
				int age=99;
				System.out.println("外部类的成员变量number："+One.this.number);
				System.out.println("内部类的："+this.age);
				System.out.println("方法的："+age);
			}
		}
}
//静态内部类
class Three{
	static class Four{
		public void four() {
			System.out.println("静态内部类");
		}
	}
}