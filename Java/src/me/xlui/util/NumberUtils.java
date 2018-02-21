package me.xlui.util;

public class NumberUtils {
	private static final int COUNT = 10;
	private static final int RANGE = 100;

	public static int[] generate() {
		int[] res = new int[COUNT];
		for (int i = 0; i < COUNT; i++) {
			res[i] = 1 + (int) (Math.random() * RANGE);
		}
		return res;
	}

	public static void print(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
}
