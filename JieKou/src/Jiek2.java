
public interface Jiek2 {

}
interface jie01{
	void name1();
}
interface jie02{
	void name2();
}
interface jie03 extends jie01,jie02{//�ӿڿ��Զ�̳У�����ļ̳�һ����
	void name3();
}
class My implements jie03{

	@Override
	public void name1() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void name2() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void name3() {
		// TODO �Զ����ɵķ������
		
	}
	
}
