package com.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年7月26日 下午5:22:26
 * @version 1.0 *
 * @since
 */
public class PrcessExec {

	public static void main(String[] args) {
		try {
			String fPath = "e:/5_db_init_func.sql";
			Runtime rt = Runtime.getRuntime();

			// 调用 mysql 的 cmd:
			Process child = rt.exec("E:/Program Files/mysql-5.6.29/bin/mysql.exe -uroot -pqazWSX098 t_0526_saas_common ");
			OutputStream out = child.getOutputStream();// 控制台的输入信息作为输出流
			String inStr;
			StringBuffer sb = new StringBuffer("");
			String outStr;
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fPath), "utf8"));
			while ((inStr = br.readLine()) != null) {
				sb.append(inStr + "\r\n");
			}
			outStr = sb.toString();

			OutputStreamWriter writer = new OutputStreamWriter(out, "utf8");
			writer.write(outStr);
			// 注：这里如果用缓冲方式写入文件的话，会导致中文乱码，用flush()方法则可以避免
			writer.flush();
			// 别忘记关闭输入输出流
			out.close();
			br.close();
			writer.close();

			InputStream fis = child.getInputStream();
			// 用一个读输出流类去读
			InputStreamReader isr = new InputStreamReader(fis);
			// 用缓冲器读行
			BufferedReader br2 = new BufferedReader(isr);
			String line = null;
			// 直到读完为止
			while ((line = br2.readLine()) != null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
