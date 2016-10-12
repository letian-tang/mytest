package com.test;

import java.text.DecimalFormat;

/** 
* [简要描述]:<br/>
* [详细描述]:<br/>
* @author  tangdingyi  E-mail: 13913364179@163.com
* @date 创建时间：2016年5月31日 上午11:15:28 
* @version 1.0 *
* @since  
*/
public class Test {
	
	
	public static String toFixed(double num){
        DecimalFormat df = new DecimalFormat("#0.0");
        return df.format(num);
    }
	
	public static void main(String[] args) {
		//System.out.println(Double.parseDouble("-1"));
		//Double s = 0.0;
		//System.out.println(s==0.0);
		int s = -19;
		int ss = 10;
		System.out.println(s/ss);
	}

	
	public static String sqliteEscape(String keyWord){  
	    keyWord = keyWord.replace("/", "//").replace("'", "''").replace("[", "/[").replace("]", "/]").replace("%", "/%").replace("&","/&").replace("_", "/_").replace("(", "/(").replace(")", "/)");  
	    return keyWord;  
	}  
}
