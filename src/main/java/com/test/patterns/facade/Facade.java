package com.test.patterns.facade;

class Step1{
	public void step1(){
		System.out.println("第一步");
	}
}
class Step2{
	public void step2(){
		System.out.println("第二步");
	}
}
class Step3{
	public void step1(){
		System.out.println("第三步");
	}
}
class Step4{
	public void step4(){
		System.out.println("第四步");
	}
}
public class Facade {
	
	
	public void AllStep(){
		Step1 s1 = new Step1();
		s1.step1();
		
		Step2 s2 = new Step2();
		s2.step2();
		
		Step3 s3 = new Step3();
		s3.step1();
		
		Step4 s4 = new Step4();
		s4.step4();
	}
	

	public static void main(String[] args) {
		Step1 s1 = new Step1();
		s1.step1();
		
		Step2 s2 = new Step2();
		s2.step2();
		
		Step3 s3 = new Step3();
		s3.step1();
		
		Step4 s4 = new Step4();
		s4.step4();
		
		
		System.out.println("===========外观模式=========");
		
		Facade facade = new Facade();
		facade.AllStep();
	}
	

}
