import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");//�����1��һ������
		map.put(2, "two");
		map.put(3, "three");//��ż�ֵ��
		System.out.println(map.get(1));
		System.out.println(map.get(2));//��ȡ��ֵ��
		map.remove(1);//�Ƴ���ֵ��
		map.containsKey(1);//����Map���Ƿ���1��Ӧ�ļ�ֵ��
		map.containsValue("two");//����Map���Ƿ���"two"��Ӧ�ļ�ֵ��
		System.out.println(map.size());//����map�ļ�ֵ�Ե�����
		map.isEmpty();//map�Ƿ�Ϊ��
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(4, "����map2��ֵ");
		map.putAll(map2);//��map2�����м�ֵ�Էŵ�map��
		map2.clear();//���map2�����м�ֵ��
	}
}
