package com.sxn.io;

public class Test {
	public static void main(String[] args) {
		int[] number = {43,32,53,54,4545};
		//for语句
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		//foreach语句
		System.out.println("--------foreach--------");
		for ( int i : number) {
			System.out.println(i);
		}
		System.out.println("--------foreach2--------");
		System.out.println();
		String[] string = {"http","csdn","jingdong"};
		for (String string2 : string) {
			System.out.println(string2);
		}
		System.out.println("--------foreach3--------");
		String[] string2 = {"c++","c","java"};
		System.out.println("学过的编程语言有：");
		for (String string3 : string2) {
			System.out.println(string3);
		}

	}
}
