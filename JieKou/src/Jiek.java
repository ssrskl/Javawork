
public interface Jiek {
/**
 * 接口中所有的方法都是抽象的
 * 所以不需要添加abstract
 * 常量：接口中的属性只能是常量，总是：public static final 修饰。不写也是。
 * 方法：接口中的方法只能是：public abstract。 省略的话，也是public abstract。
 */
	void test01();
	int MAX_AGE=100;//常量的规范用大写，和下划线
}
interface Two{
	public void test02();
}
class Myclass implements Jiek{

	@Override
	public void test01() {
		// TODO 自动生成的方法存根
		System.out.println("接口的方法");
		System.out.println(MAX_AGE);
	}}
