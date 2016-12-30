package com.stone.utility;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalendarUtilsTest {
	public static final String FORMAT_DATE = "yyyy-MM-dd:HH:mm:ss";
	public static SimpleDateFormat dateFormat = new SimpleDateFormat(
			FORMAT_DATE);
	public static Date currentTime = new Date();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("=============================");
		System.out.println("currentTime:" + dateFormat.format(currentTime));
		System.out.println("=============================");
	}

	@After
	public void setUpAfter() throws Exception {
		System.out.println("-----------------------------");
	}

	@Test
	public void testNextDay() {
		assertNotNull(currentTime);
		Date nextDate = CalendarUtils.nextDay(currentTime);
		Date amountDate = CalendarUtils.nextDay(currentTime, 3);
		assertNotNull(nextDate);
		assertNotNull(amountDate);
		System.out.println("nextDayDate:" + dateFormat.format(nextDate));
		System.out.println("amountDayDate:" + dateFormat.format(amountDate));
	}

	@Test
	public void testNextWeekDay() {
		assertNotNull(currentTime);
		Date nextDate = CalendarUtils.nextWeekDay(currentTime);
		Date amountDate = CalendarUtils.nextWeekDay(currentTime, 3);
		assertNotNull(nextDate);
		assertNotNull(amountDate);
		System.out.println("nextWeekDayDate:" + dateFormat.format(nextDate));
		System.out
				.println("amountWeekDayDate:" + dateFormat.format(amountDate));
	}

	@Test
	public void testNextMonth() {
		assertNotNull(currentTime);
		Date nextDate = CalendarUtils.nextMonth(currentTime);
		Date amountDate = CalendarUtils.nextMonth(currentTime, 3);
		assertNotNull(nextDate);
		assertNotNull(amountDate);
		System.out.println("nextMonthDate:" + dateFormat.format(nextDate));
		System.out.println("amountMonthDate:" + dateFormat.format(amountDate));
	}

}
