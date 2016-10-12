package com.test;

import java.security.MessageDigest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年5月31日 上午11:15:28
 * @version 1.0 *
 * @since
 */
public class Test3 {

	private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d",
			"e", "f" };

	/**
	 * 
	 * @param b
	 * @return
	 */

	public static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n = 256 + n;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	public static String MD5Encode(String origin) {
		String resultString = null;

		try {
			resultString = origin;
			MessageDigest md = MessageDigest.getInstance("MD5");
			resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
		} catch (Exception ex) {
		}
		return resultString;
	}

	public static String getSign(Map<String, Object> param) {

		Map<String, Object> map = new TreeMap<String, Object>();
		// 转自然排序
		param.forEach((key, value) -> {
			map.put(key, value);

		});
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue().toString());
		}
		String sign = MD5Encode(sb.toString() + "*g#ab$7#zhoupu");
		return sign;

	}

	public static void main(String[] args) {
		
		Map<String,Object> json = new HashMap<>();
		
		Map<String,Object> params = new TreeMap<>();
		params.put("param1", "11111111111");
		params.put("param2", "22222222222");
		params.put("param3", "ccccccccccc");
		params.put("timer", new Date().getTime());
		
		String sign = getSign(params);
		
		json.put("action", "sssss");
		json.put("params", params);
		json.put("sign", sign);
		
		System.out.println();
	}

}
