package ����;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		collection.add("������");
		System.out.println(collection);
		boolean b = collection.contains("������");
		System.out.println(b);
		collection.remove("������");
		System.out.println(collection);
		//###############################
		ArrayList arrayList = new ArrayList();
		ArrayList arrayList2 = new ArrayList();
		arrayList.add("one");
		arrayList.add("two");
		arrayList.add("three");
		arrayList2.addAll(arrayList);
		arrayList2.add("four");
		System.out.println("�����arrayList2"+arrayList2);
		System.out.println("arrayList�ǣ�"+arrayList);
		Iterator iterator = arrayList2.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+",");
		}
	}
}
