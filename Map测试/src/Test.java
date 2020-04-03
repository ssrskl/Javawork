import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");//这里的1是一个对象
		map.put(2, "two");
		map.put(3, "three");//存放键值对
		System.out.println(map.get(1));
		System.out.println(map.get(2));//获取键值对
		map.remove(1);//移除键值对
		map.containsKey(1);//测试Map中是否有1对应的键值对
		map.containsValue("two");//测试Map中是否有"two"对应的键值对
		System.out.println(map.size());//测试map的键值对的数量
		map.isEmpty();//map是否为空
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(4, "来自map2的值");
		map.putAll(map2);//将map2的所有键值对放到map中
		map2.clear();//清除map2的所有键值对
	}
}
