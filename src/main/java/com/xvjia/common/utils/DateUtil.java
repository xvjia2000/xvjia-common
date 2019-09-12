package com.xvjia.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * @author xvjia
 * 	ʱ��2019��9��5��
 * 
 */
public class DateUtil {
	/*
	 * ����1��(5��) ���ظ������ڵ��³� ��һ��ʱ����󣬷��ظ�ʱ�������µ�1��0ʱ0��0�롣����һ��Date�����ֵ��2019-05-18 11:37:22
	 * �򷵻صĽ��Ϊ2019-05-01 00:00:00
	 */
	@SuppressWarnings("static-access")
	public static Date getDateByInitMonth(Date src) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("calendar-----"+calendar);
		System.out.println("src-----"+src);
		calendar.setTime(src);
		calendar.set(calendar.DAY_OF_MONTH, 1);
		calendar.set(calendar.HOUR_OF_DAY, 0);
		calendar.set(calendar.MINUTE, 0);
		calendar.set(calendar.SECOND, 0);
		
		return calendar.getTime();
	}
	/*
	 * ����2��(5��) ���ظ���������ĩ ��һ��ʱ����󣬷��ظ�ʱ�������µ������23ʱ59��59�룬��Ҫ�����´���С�Ͷ������������
	 * ����һ��Date�����ֵ��2019-05-18 11:37:22���򷵻ص�ʱ��Ϊ2019-05-31 23:59:59
	 * ����һ��Date�����ֵ��2019-02-05 15:42:18���򷵻ص�ʱ��Ϊ2019-02-28 23:59:59
	 */
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
	
	public static Date randomDate(Date minDate,Date maxDate) {
		Calendar calendar = Calendar.getInstance();
		
		long time1 = minDate.getTime();
		long time2 = maxDate.getTime();
		
		long time3 = (long) (Math.random()*(time2-time1+1)+time1);
		
		calendar.setTimeInMillis(time3);
		
		return calendar.getTime();
	}
	
	public static Date getDateByMonthSub(Date date , Integer month) {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(date);
		calendar.add(calendar.MONTH , -month);
		
		return calendar.getTime();
	}
	
}
