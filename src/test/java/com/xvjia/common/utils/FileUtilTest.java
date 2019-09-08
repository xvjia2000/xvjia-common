package com.xvjia.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

/**
 * @author xvjia
 * 	时间2019年9月6日
 * 
 */
public class FileUtilTest {

	/**
	 * Test method for {@link com.xvjia.common.utils.FileUtil#getExtendName(java.lang.String)}.
	 */
	@Test
	public void testGetExtendName() {
		String extendName = FileUtil.getExtendName("add.jsp");
		System.out.println(extendName);
	}

	/**
	 * Test method for {@link com.xvjia.common.utils.FileUtil#getTempDirectory()}.
	 */
	@Test
	public void testGetTempDirectory() {
		File tempDirectory = FileUtil.getTempDirectory();
		System.out.println(tempDirectory);
	}

	/**
	 * Test method for {@link com.xvjia.common.utils.FileUtil#getUserDirectory()}.
	 */
	@Test
	public void testGetUserDirectory() {
		File userDirectory = FileUtil.getUserDirectory();
		
		System.out.println(userDirectory);
	}

}
