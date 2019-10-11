package com.xvjia.common.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author xvjia 时间2019年10月11日
 * 
 */
public class StreamUtils {

	/**
	 * 关闭所有的流
	 * 
	 * @param n
	 * @param streams
	 * @throws IOException
	 */
	public static void closeStream(Closeable... streams) throws IOException {

		for (int i = 0; i < streams.length; i++) {
			streams[i].close();
		}

	}

}
