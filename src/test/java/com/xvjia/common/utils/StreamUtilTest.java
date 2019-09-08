package com.xvjia.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/**
 * @author xvjia
 * 	时间2019年9月5日
 * 
 */
public class StreamUtilTest {

	/**
	 * Test method for {@link com.xvjia.common.utils.StreamUtil#clostAll(java.lang.AutoCloseable[])}.
	 */
	@Test
	public void testClostAll() {
	}

	/**
	 * Test method for {@link com.xvjia.common.utils.StreamUtil#readTextFile(java.io.InputStream)}.
	 * @throws FileNotFoundException 
	 */
	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		
		String file = StreamUtil.readTextFile(new FileInputStream("d:/2.txt"));
		System.out.println(file);
		
	}

	/**
	 * Test method for {@link com.xvjia.common.utils.StreamUtil#readTextFile(java.io.File)}.
	 */
	@Test
	public void testReadTextFileFile() {
		String file = StreamUtil.readTextFile(new File("d:/2.txt"));
		
		System.out.println(file);
	}

}
