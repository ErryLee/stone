package com.sunflower.crawler.algorithm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sunflower.crawler.algorithm.SortAlgorithm.DisplayUtils;

public class SortAlgorithmTest {
	public static final int ARRAY_LENGTH = 15;
	public static final boolean SORT_DESC = false;
	
	public static int[] arrs = new int[] { 2, 1, 9, 2, 10, 5, 7, 11, 22, 0 };
	
	public static void initArrays(){
		arrs = new int[] { 2, 1, 9, 2, 10, 5, 7, 11, 22, 0 };
	}
	
	public static void showLine(int len){
		for(int i = 0; i <= arrs.length*2; i++){
			System.out.print("==");
		}
		System.out.println();
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		showLine(arrs.length);
		System.out.println("\t排序算法");
		DisplayUtils.showArray(arrs);
		showLine(arrs.length);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		initArrays();
		assertArrayEquals(arrs, new int[] { 2, 1, 9, 2, 10, 5, 7, 11, 22, 0 });
		
	}

	@After
	public void tearDown() throws Exception {
		DisplayUtils.showArray(arrs);
		showLine(arrs.length);
	}
	
	@Test
	public void testBubbleSort(){
		assertNotNull(arrs);
		System.out.println("\t冒泡排序");
		SortAlgorithm.bubbleSort(arrs, arrs.length, false);
	}
	
	@Test
	public void testCocktailSort(){
		assertNotNull(arrs);
		System.out.println("\t鸡尾酒排序");
		SortAlgorithm.cocktailSort(arrs, arrs.length, false);
	}

}
