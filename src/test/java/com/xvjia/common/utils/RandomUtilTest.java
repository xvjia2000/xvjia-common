package com.xvjia.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.junit.Test;

/**
 * @author xvjia ʱ��2019��9��6��
 * 
 */
public class RandomUtilTest {

	/**
	 * Test method for {@link com.xvjia.common.utils.RandomUtil#random(int, int)}.
	 */
	@Test
	public void testRandom() {

		System.out.println(RandomUtil.random(1, 10));

	}

	/**
	 * Test method for
	 * {@link com.xvjia.common.utils.RandomUtil#subRandom(int, int, int)}.
	 */
	@Test
	public void testSubRandom() {

		int[] subRandom = RandomUtil.subRandom(1, 10, 5);
		for (int j : subRandom) {
			System.out.print(j + " ");
		}
	}

	/**
	 * Test method for {@link com.xvjia.common.utils.RandomUtil#randomCharacter()}.
	 */
	@Test
	public void testRandomCharacter() {
		System.out.println(RandomUtil.randomCharacter());
	}

	/**
	 * Test method for {@link com.xvjia.common.utils.RandomUtil#randomString(int)}.
	 */
	@Test
	public void testRandomString() {
		System.out.println(RandomUtil.randomString(4));
	}

	@Test
	public  void test() {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2000, 1, 1);
		
		Date date = DateUtil.randomDate(calendar.getTime(), new Date());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		
		
		System.out.println("date------"+dateFormat.format(date));
		
	}

}
