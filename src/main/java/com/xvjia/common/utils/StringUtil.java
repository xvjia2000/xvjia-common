package com.xvjia.common.utils;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * @author xvjia
 * 	ʱ��2019��9��6��
 * 
 */
public class StringUtil {

	/**
	 * 
	 * @param src
	 * @return
	 */
//	(5)该方法必须是在自己的工具包工程中，且在StringUtil工具中。（2分）
	public static String toHtml(String src) {
		
		String str = src.replaceAll(System.getProperty("line.separator"), "|")	;
		String[] split = str.split("\\|");
		String newStr="";
		for (String string2 : split) {
//			(2)将\n结尾的这行文本用<p></p>标签包起来。（6分）
			newStr+="<p>"+string2+"</p>";
		}
		return newStr;
	}
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	
	public static boolean isPhoneNumber(String number) {
	
		String regex = "[1][3578]\\d{9}";
		
		if (number.length()!=11) {
			System.out.println("手机号应为11位");
			return false;
		}
		return number.matches(regex);
	}	
	
	/**
	 * 
	 * @param email
	 * @return
	 */
	public static boolean isEmail(String email) {
		
		String regex = "[A-z]+[A-z0-9_-]*\\@[A-z0-9]+\\.[A-z]";
		
		if (email.length()==0) {
			System.out.println("不能为空");
			return false;
		}
		
		return email.matches(regex);
	}	
	
	
//	public static String strReplace(String string) {
//		return string;
//	}
	
	
	public static String randomChineseString() {
		
		String str = null;
		
		int higPos,lowPos;
		
		Random random = new Random();
		
		higPos = (176 + Math.abs(random.nextInt(39)));
		lowPos = (161 + Math.abs(random.nextInt(94)));
		byte[] bArr = new byte[2];
		
		bArr[0]= new Integer(higPos).byteValue();
		bArr[1]=new Integer(lowPos).byteValue();
		
		try {
			str = new String(bArr,"GB2312");
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

	/**
	 * @param textarea 
	 * 
	 */
	public static boolean hasText(String textarea) {
//			if (textarea!=null) {
//				if (textarea.length()!=0) {
//				return true;
//			}
//		}
		return textarea!=null && textarea.trim().length()>0;
	}
	
	
}
