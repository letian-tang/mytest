package com.test.patterns.bridge;

public class Clinet {
	public static void main(String[] args) {

		TV tv = new SANSUNG();
		TV tv2 = new ChangHong();

		Control control1 = new SANSUNGControl(tv);

		Control control2 = new ChangHongControl(tv2);
		
		control1.on();
		control1.swithChannel(2);
		control1.off();
		
		
		control2.on();
		control2.swithChannel(33);
		control2.off();
	}

}
