
public class ChouXiang {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println();
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
