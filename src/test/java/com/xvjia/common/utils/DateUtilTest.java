package com.xvjia.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * @author xvjia
 * 	时间2019年9月5日
 * 
 */
public class DateUtilTest {

	/**
	 * Test method for {@link com.xvjia.common.utils.DateUtil#getDateByInitMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByInitMonth() {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(2010, 2, 18);
		
		Date date = DateUtil.getDateByInitMonth(calendar.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		System.out.println(sdf.format(date));
	}

	/**
	 * Test method for {@link com.xvjia.common.utils.DateUtil#getDateByFullMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByFullMonth() {
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(2010, 2, 18);
		
		Date date = DateUtil.getDateByFullMonth(calendar.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		System.out.println(sdf.format(date));
		
	}

}
