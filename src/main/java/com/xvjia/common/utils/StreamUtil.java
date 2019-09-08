package com.xvjia.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author xvjia
 * 	时间2019年9月5日
 * 
 */
public class StreamUtil {
	public static void clostAll(AutoCloseable ...autoCloseables) {
		
		if (autoCloseables!=null&&autoCloseables.length>0) {
			for (AutoCloseable autoCloseable : autoCloseables) {
				autoCloseables.clone();
			}
		}
		
	}
	
	public static String readTextFile(InputStream src){
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		
		byte[] b = new byte[1024];
		
		int a = 0;
		try {
			while((a=src.read(b)) != -1) {
				outputStream.write(b);
			}
			return outputStream.toString("utf-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			clostAll(outputStream,src);
		}
		
		return null;
	}
	/*
	 * 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	 */
	public static String readTextFile(File txtFile) {
		try {
			FileInputStream inputStream = new FileInputStream(txtFile);
			String readTextFile = readTextFile(inputStream);
			return readTextFile;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
