package com.stone.utility;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

/**
 * 日历工具类
 * 
 * @author Hannibal
 * @version 0.1
 *
 */
public class CalendarUtils {

	/**
	 * 明天的起始日期
	 * 
	 * @param currentTime
	 * @return
	 */
	public static Date nextDay(Date currentTime) {
		return DateUtils.truncate(DateUtils.addDays(currentTime, 1),
				Calendar.DATE);
	}

	/**
	 * 指定数量天后的起始日期
	 * 
	 * @param currentTime
	 * @param amount
	 * @return
	 */
	public static Date nextDay(Date currentTime, int amount) {
		return DateUtils.truncate(DateUtils.addDays(currentTime, amount),
				Calendar.DATE);
	}

	/**
	 * 下周的起始日期
	 * 
	 * @param currentTime
	 * @return
	 */
	public static Date nextWeekDay(Date currentTime) {
		Calendar c = DateUtils.toCalendar(DateUtils.addWeeks(currentTime, 1));
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return DateUtils.truncate(c, Calendar.DATE).getTime();
	}

	/**
	 * 指定数量周的起始日期
	 * 
	 * @param currentTime
	 * @param amount
	 * @return
	 */
	public static Date nextWeekDay(Date currentTime, int amount) {
		Calendar c = DateUtils
				.toCalendar(DateUtils.addWeeks(currentTime, amount));
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return DateUtils.truncate(c, Calendar.DATE).getTime();
	}

	/**
	 * 下个月的起始日期
	 * 
	 * @param currentTime
	 * @return
	 */
	public static Date nextMonth(Date currentTime) {
		return DateUtils.truncate(DateUtils.addMonths(currentTime, 1),
				Calendar.MONTH);
	}

	/**
	 * 指定数量月后的开始日期
	 * 
	 * @param currentTime
	 * @param amount
	 * @return
	 */
	public static Date nextMonth(Date currentTime, int amount) {
		return DateUtils.truncate(DateUtils.addMonths(currentTime, amount),
				Calendar.MONTH);
	}

}
