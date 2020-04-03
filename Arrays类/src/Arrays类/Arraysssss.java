package Arrays¿‡;

import java.util.Arrays;

public class Arraysssss {
	public static void main(String[] args) {
		int a[]= {1,2,7,5,9,4,5,6,8};
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 8));
		System.out.println(a[0]);
		Arrays.fill(a, 2,4,100);
		System.out.println(Arrays.toString(a));
	}
}
