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
	 * @param arrs
	 * @param len
	 * @param desc
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
	
	/**
	 * 鸡尾酒排序
	 * @param arrs
	 * @param len
	 * @param desc
	 */
	public static void cocktailSort(int [] arrs, int len, boolean desc){
		for(int i = 0; i < len/2; i++){
			for(int j = i; j < len-i-1; j++){
				if(arrs[j] > arrs[j+1]){
					swap(arrs, j, j+1);
				}
			}
			for(int g = len-i-1; g > i; g--){
				if(arrs[g-1] > arrs[g]){
					swap(arrs, g, g-1);
				}
			}
		}
	}
	

	/**
	 * 交换两个数组中的值
	 * @param arrs
	 * @param i1
	 * @param i2
	 */
	public static void swap(int[] arrs, int i1, int i2) {
		arrs[i1] = arrs[i1] ^ arrs[i2];
		arrs[i2] = arrs[i1] ^ arrs[i2];
		arrs[i1] = arrs[i1] ^ arrs[i2];
	}

	/**
	 * 输入数组工具类
	 * @author Hannibal
	 *
	 */
	public static class DisplayUtils {
		public static void showArray(int[] arrs) {
			for (int a : arrs) {
				System.out.print(a + "  ");
			}
			System.out.println();
		}
	}

}
