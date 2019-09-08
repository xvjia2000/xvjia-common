package com.xvjia.common.utils;

import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author xvjia
 * 	ʱ��2019��9��5��
 * 
 */
public class Demo {

	public static void main(String[] args) {
		/*
		 * ����1��(5��) ���ظ������ڵ��³� ��һ��ʱ����󣬷��ظ�ʱ�������µ�1��0ʱ0��0�롣����һ��Date�����ֵ��2019-05-18 11:37:22
		 * �򷵻صĽ��Ϊ2019-05-01 00:00:00
		 */
		System.out.println("�³�----------------------------------------------------------------------------------");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		System.out.println(new Date());
		calendar.set(calendar.DAY_OF_MONTH, 1);
		calendar.set(calendar.HOUR_OF_DAY, 0);
		calendar.set(calendar.MINUTE, 0);
		calendar.set(calendar.SECOND, 0);
		
		Date date = calendar.getTime();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		
		String string = dateFormat.format(date);
		System.out.println(string);
		System.out.println("��ĩ---------------------------------------------------------------------------------------");
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.setTime(new Date());
		
		calendar2.add(calendar2.MONTH, +1);
		calendar2.set(calendar2.DAY_OF_MONTH, 1);
		calendar2.set(calendar2.HOUR_OF_DAY, 0);
		calendar2.set(calendar2.MINUTE, 0);
		calendar2.set(calendar2.SECOND, 0);
		
		Date date2 = calendar.getTime();
		calendar2.setTime(date2);
		calendar2.set(calendar2.SECOND, -1);
		
		System.out.println(dateFormat.format(calendar2.getTime()));
		
	}
}
