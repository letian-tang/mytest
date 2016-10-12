package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年8月11日 下午10:24:38
 * @version 1.0 *
 * @since
 */
public class Main {

	public static void main(String[] args) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss Z", Locale.US);
		sdf.setTimeZone( TimeZone.getTimeZone("GMT+8")); // 设置时区为GMT
		Date date = sdf.parse("03/Jun/2016:10:21:57 +0800");
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		String ss  = sdf.format(date);
		System.out.println(ss);
	}
}
