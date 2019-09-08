package com.xvjia.common.utils;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

/**
 * @author xvjia
 * 	时间2019年9月6日
 * 
 */
public class StringUtilTest {

	/**
	 * Test method for {@link com.xvjia.common.utils.StringUtil#randomChineseString()}.
	 */
	@Test
	public void testRandomChineseString() {
		System.out.println(StringUtil.randomChineseString());
	}

	
	public static void main(String[] args) {
		Random ran = new Random();
		int ranNumber = ran.nextInt(504) + 155;
		System.out.println(ranNumber);
	}
	
}
