package com.test.patterns.builder.b2;

public class MobilePackageImpl2 implements Builder {
	
	private MobilePackage mobilePackage;
	
	public MobilePackageImpl2(){
		mobilePackage = getMobilePackage();
		mobilePackage.setName("30元套餐");
	}

	@Override
	public void builderFee() {
		mobilePackage.setFee(30.00);
		
	}

	@Override
	public void builderNet() {
		mobilePackage.setNet(100);
		
	}

	@Override
	public void buliderMin() {
		mobilePackage.setMin(30);
	}

	@Override
	public MobilePackage build() {
		
		return mobilePackage;
	}
	

}
