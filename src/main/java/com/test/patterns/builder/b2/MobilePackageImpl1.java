package com.test.patterns.builder.b2;

public class MobilePackageImpl1 implements Builder {
	
	private MobilePackage mobilePackage;
	
	public MobilePackageImpl1(){
		mobilePackage = getMobilePackage();
		mobilePackage.setName("60元套餐");
	}

	@Override
	public void builderFee() {
		mobilePackage.setFee(60.00);
		
	}

	@Override
	public void builderNet() {
		mobilePackage.setNet(300);
		
	}

	@Override
	public void buliderMin() {
		mobilePackage.setMin(90);
	}

	@Override
	public MobilePackage build() {
		
		return mobilePackage;
	}
	

}
