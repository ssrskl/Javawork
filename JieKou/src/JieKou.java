
public class JieKou implements Jiek,Two{//����ʵ�ֶ�����ӿ�
	public static void main(String[] args) {
		
	}

	@Override
	public void test01() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void test02() {
		// TODO �Զ����ɵķ������
		
	}
}
abstract class Anlimal{//�������󷽷��������Ϊ������
	//���󷽷�����û��ʵ�֣��������ʵ��
	abstract public void shout();//���󷽷�����Ҫ������
	public void run() {
		System.out.println("��");
	}
}
class Dog extends Anlimal{

	@Override
	public void shout() {
		// TODO �Զ����ɵķ�����
		System.out.println("������");
	}
	
}
