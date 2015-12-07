package com.test.patterns.builder.b2;

public class Director {

	/**
	 * 调用具体建造者角色以创建产品对象
	 * @param builder
	 * @return
	 */
	public MobilePackage createMobilePackage(Builder builder) {

		builder.builderFee();
		builder.builderNet();
		builder.buliderMin();
		
		return builder.build();
	}

}
