package com.sunflower.crawler.algorithm;

/**
 * 排序算法
 * 
 * @author Hannibal
 * @version 0.1
 *
 */
public class SortAlgorithm {

	/**
	 * 冒泡排序,升序和降序
	 */
	public static void bubbleSort(int[] arrs, int len, boolean desc) {
		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1 - i; j++) {
				if (desc) {
					if (arrs[j] < arrs[j + 1]) {
						swap(arrs, j, j + 1);
					}
				} else {
					if (arrs[j] > arrs[j + 1]) {
						swap(arrs, j, j + 1);
					}
				}
			}
		}
	}

	public static void swap(int[] arrs, int i1, int i2) {
		arrs[i1] = arrs[i1] ^ arrs[i2];
		arrs[i2] = arrs[i1] ^ arrs[i2];
		arrs[i1] = arrs[i1] ^ arrs[i2];
	}

	public static void main(String[] args) {
		int[] arrs = new int[] { 2, 1, 9, 2, 10, 5, 7, 11, 22, 0 };
		DisplayUtils.showArray(arrs);
		bubbleSort(arrs, arrs.length, false);
		DisplayUtils.showArray(arrs);

	}

	public static class DisplayUtils {
		public static void showArray(int[] arrs) {
			for (int a : arrs) {
				System.out.print(a + "  ");
			}
			System.out.println();
		}
	}

}
