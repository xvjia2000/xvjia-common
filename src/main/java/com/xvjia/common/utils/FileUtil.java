package com.xvjia.common.utils;

import java.io.File;

/**
 * @author xvjia ʱ��2019��9��6��
 * 
 */
public class FileUtil {
	/*
	 * ����1������һ���ļ��������ظ��ļ�������չ�������硰aaa.jpg�������ء�.jpg��(3��)
	 */
	/// String str="aaa.jpg"
	public static String getExtendName(String fileName) {
		if (null != fileName && fileName.length() > 0)
			return fileName.substring(fileName.lastIndexOf("."));
		return null;
	}

	/*
	 * ����2�����ز���ϵͳ��ʱĿ¼(5��)
	 */
	public static File getTempDirectory() {
		String path = System.getProperty("java.io.tmpdir");
		System.getProperty("java.io.tmpdir");
		return new File(path);
	}

	/*
	 * ����3�����ز���ϵͳ�û�Ŀ¼(5��) ����Linuxϵͳ����/home/{�û��˺���}��Windowsϵͳ����C:\Users\{�û��˺���}>
	 */
	public static File getUserDirectory() {

		String path = System.getProperty("user.home");

		return new File(path);
	}
}
