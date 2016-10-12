package com.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * [简要描述]:<br/>
 * [详细描述]:<br/>
 * 
 * @author tangdingyi E-mail: 13913364179@163.com
 * @date 创建时间：2016年7月19日 下午5:02:36
 * @version 1.0 *
 * @since
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {

	String column() default "";

	String type() default "";

	int length() default 0;
}
