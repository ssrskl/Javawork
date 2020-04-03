
public interface Jiek2 {

}
interface jie01{
	void name1();
}
interface jie02{
	void name2();
}
interface jie03 extends jie01,jie02{//接口可以多继承，与类的继承一样。
	void name3();
}
class My implements jie03{

	@Override
	public void name1() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void name2() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void name3() {
		// TODO 自动生成的方法存根
		
	}
	
}
