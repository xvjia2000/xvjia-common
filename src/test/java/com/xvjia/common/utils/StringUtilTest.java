package com.xvjia.common.utils;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

/**
 * @author xvjia
 * 	ʱ��2019��9��6��
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
	
	/*
	 * (2)测试StringUtil工具类中的是否为中国地区手机号码isPhone()工具方法。传一个非法的手机号码测试不通过（4分）。
	 * 传一次合法的手机号码，测试通过（4分）。
	 */
	
	@Test
	public void isPhoneNumTest() {
		boolean b = StringUtil.isPhoneNumber("15127672018");
		System.out.println(b);
	}
	
	/*
	 * (3)测试StringUtil工具类中的是否为邮箱isEmail()工具方法。传一个非法的邮箱测试不通过（4分）。
	 *  传一次合法的邮箱，测试通过（4分）。
	 */
	@Test
	public void isemail() {
		boolean b = StringUtil.isEmail("992@qq.com");
		System.out.println(b);
	}
	
}
