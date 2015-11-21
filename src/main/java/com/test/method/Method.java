package com.test.method;

/**
 * 
 * @author tdy
 *对于参数传递，如果是简单数据类型，
 *那么它传递的是值拷贝，
 *对于类的实例它传递的是类的引用。
 *需要注意的是，这条规则只适用于参数传递
 */

/**
 *  第一：java方法基本数据类型是传值，对象类型传引用，这是千真万确的。
　　第二：当参数是对象时，无论方法体内进行了何种操作，都不会改变实参对象的引用。
　　第三：当参数是对象时，只有在方法内部改变了对象的内容时，才会改变实参对象内容。
 * @author tdy
 *
 */
public class Method {

	static void m1(String name) {
		name = new String("rrrrrrrrrr");
	}

	static void m2(int v) {
		v = 111;
	}
	
	static void m3(C1 c) {
		c.setName("cccccc");
		c.setAge(23);
	}
	
	static void m4(C1 c1 ) {
		C1 c2 = new C1();
		c2.setName("cccccc");
		c2.setAge(23);
		c1 = c2;
	}

	public static void main(String[] args) {

		String name = "ccccccccccccc";
		m1(name);
		System.out.println(name);

		int vv = 222;
		m2(vv);
		System.out.println(vv);
		
		C1 c = new C1("ddd",99);
		m3(c);
		System.out.println(c);
		
		m4(c);
		System.out.println(c);
	}
}

class C1{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public C1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public C1() {
		super();
	}
	@Override
	public String toString() {
		return "C1 [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
