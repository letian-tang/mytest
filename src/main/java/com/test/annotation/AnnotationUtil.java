package com.test.annotation;

import java.lang.reflect.Field;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年7月19日 下午5:06:37
 * @version 1.0 *
 * @since
 */
public class AnnotationUtil {
	public static void parse(Class target) {
		Table table = (Table) target.getAnnotation(Table.class);
		System.out.println("数据库表名: " + table.value());
		Field[] fields = target.getDeclaredFields();
		for (Field f : fields) {
			Column column = f.getAnnotation(Column.class);
			System.out.println("列名: " + column.column() + ", 数据类型: " + column.type() + ", 数据大小: " + column.length());
		}
	}
}
