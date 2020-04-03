package ÈÝÆ÷;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<>();
		collection.add("À²À²À²");
		System.out.println(collection);
		boolean b = collection.contains("À²À²À²");
		System.out.println(b);
		collection.remove("À²À²À²");
		System.out.println(collection);
		//###############################
		ArrayList arrayList = new ArrayList();
		ArrayList arrayList2 = new ArrayList();
		arrayList.add("one");
		arrayList.add("two");
		arrayList.add("three");
		arrayList2.addAll(arrayList);
		arrayList2.add("four");
		System.out.println("Õâ¸öÊÇarrayList2"+arrayList2);
		System.out.println("arrayListÊÇ£º"+arrayList);
		Iterator iterator = arrayList2.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+",");
		}
	}
}
