package com.test.annotation;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年7月19日 下午5:09:06
 * @version 1.0 *
 * @since
 */
public class Main {
	public static void main(String[] args) {
		AnnotationUtil.parse(TableTest.class);
	}
}

@Table("测试表")
class TableTest {
	@Column(column = "名字", type = "java.lang.String", length = 12)
	private String name;
	@Column(column = "年龄", type = "int", length = 12)
	private int age;
	@Column(column = "地址", type = "String")
	private String address;
}
