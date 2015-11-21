package com.test.method;

public class Example {
	String str = new String("good");
	char[] ch = { 'a', 'b', 'c' };

	public static void main(String args[]) {
		Example ex = new Example();
		ex.change(ex.str, ex.ch);
		System.out.print(ex.str + " and ");
		System.out.print(ex.ch);
	}

	public void change(String str, char ch[]) {
		str = "test ok";
		ch[0] = 'g';
	}

}

class Str {
	public static void main(String[] args) {
		int i = 900;
		System.out.println(i);
		changeInt(i);
		System.out.println(i);
	}

	public static void changeInt(int s) {
		s = 34234;
	}
}

class Str2
{
	public static void main(String[] args) {
		Yinyong y = new Yinyong();
		System.out.println(y.age);
		changeobject(y);
		System.out.println(y.age);
	}

	public static void changeobject(Yinyong obj) {
		obj.age = 34234;
	}
}

class Yinyong {
	int age = 22;
}

class Str3 {
	public static void main(String[] args) {
		String s = "java test";
		System.out.println(s);
		changeString(s);
		System.out.println(s);
	}

	public static void changeString(String str) {
		str = "3gg over right";
	}
}


