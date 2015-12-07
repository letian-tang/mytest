package com.test.patterns.builder.b2;

public interface Builder {
	
	
	default MobilePackage getMobilePackage(){
		return new MobilePackage();
	}
	
	//金额
	void builderFee();
	
	//上网流量
	void builderNet();
	
	//免费分钟
	void buliderMin();
	
	MobilePackage build();

}
