
public interface Jiek {
/**
 * �ӿ������еķ������ǳ����
 * ���Բ���Ҫ���abstract
 * �������ӿ��е�����ֻ���ǳ��������ǣ�public static final ���Ρ���дҲ�ǡ�
 * �������ӿ��еķ���ֻ���ǣ�public abstract�� ʡ�ԵĻ���Ҳ��public abstract��
 */
	void test01();
	int MAX_AGE=100;//�����Ĺ淶�ô�д�����»���
}
interface Two{
	public void test02();
}
class Myclass implements Jiek{

	@Override
	public void test01() {
		// TODO �Զ����ɵķ������
		System.out.println("�ӿڵķ���");
		System.out.println(MAX_AGE);
	}}
