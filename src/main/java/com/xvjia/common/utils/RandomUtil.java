package com.xvjia.common.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * @author xvjia ʱ��2019��9��6��
 * 
 */
public class RandomUtil {

	// ����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	public static int random(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	/*
	 * ����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������
	 * ������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£�
	 * �¿����ܻ�ʹ�õ��� (8��)
	 */
	public static int[] subRandom(int min, int max, int subs) {

		int[] i = new int[subs];

		HashSet<Integer> hashSet = new HashSet<Integer>();

		while (hashSet.size() != subs) {
			hashSet.add(random(min, max));
		}

		int j = 0;
		for (Integer integer : hashSet) {
			i[j] = integer;
			j++;
		}
		
		return i;
	}

	// 随机生成字母或数字
	public static char randomCharacter() {
		
		String str = "123456789wertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		
		char c = str.charAt(random(0,str.length()-1));
		
		return c;
	}

	// 随机生成length个随机字母或数字
	public static String randomString(int length) {
		String str = "";
		for(int i = 0 ; i < length ; i++) {
			str += randomCharacter();
		}
		
		return str;
	}

}
