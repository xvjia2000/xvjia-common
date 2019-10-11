package com.xvjia.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.text.DateFormatter;

import org.junit.Test;

/**
 * @author xvjia ʱ��2019��9��5��
 * 
 */
public class DateUtil {
	/*
	 * ����1��(5��) ���ظ������ڵ��³�
	 * ��һ��ʱ����󣬷��ظ�ʱ�������µ�1��0ʱ0��0�롣����һ��Date�����ֵ��2019-05-18 11:37:22
	 * �򷵻صĽ��Ϊ2019-05-01 00:00:00
	 */
	@SuppressWarnings("static-access")
	public static Date getDateByInitMonth(Date src) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("calendar-----" + calendar);
		System.out.println("src-----" + src);
		calendar.setTime(src);
		calendar.set(calendar.DAY_OF_MONTH, 1);
		calendar.set(calendar.HOUR_OF_DAY, 0);
		calendar.set(calendar.MINUTE, 0);
		calendar.set(calendar.SECOND, 0);

		return calendar.getTime();
	}

	@SuppressWarnings("static-access")
	public static Date getDateByFullMonth(Date src) {
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(src);
		calendar.add(calendar.MONTH, 1);

		Date date = getDateByInitMonth(calendar.getTime());

		calendar.setTime(date);
		calendar.add(calendar.SECOND, -1);
		return calendar.getTime();
	}

	public static Date randomDate(Date minDate, Date maxDate) {
		Calendar calendar = Calendar.getInstance();

		long time1 = minDate.getTime();
		long time2 = maxDate.getTime();

		long time3 = (long) (Math.random() * (time2 - time1 + 1) + time1);

		calendar.setTimeInMillis(time3);

		return calendar.getTime();
	}

	public static Date getDateByMonthSub(Date date, Integer month) {

		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);

		calendar.add(calendar.MONTH, -month);
		return calendar.getTime();
	}

	public static int getAge(Date birthday) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(birthday);

//		出生年月日
		int birthYear = calendar.get(calendar.YEAR);
		int birthMonth = calendar.get(calendar.MONTH);
		int birthDay = calendar.get(calendar.DAY_OF_MONTH);

//		当前年月日
		calendar.setTime(new Date());
		int currentYear = calendar.get(calendar.YEAR);
		int currentMonth = calendar.get(calendar.MONTH);
		int currenthDay = calendar.get(calendar.DAY_OF_MONTH);

		int age = currentYear - birthYear;

		if (birthMonth > currentMonth || birthDay > currenthDay) {
			age--;
		}

		return age;
	}

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
		Date date = dateFormat.parse("2000-10-12");

		int i = getAge(date);
		System.out.println(i);

	}

}
