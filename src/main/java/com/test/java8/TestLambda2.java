package com.test.java8;

/**
 * 函数式接口(Functional Interface)
 * 是Java 8对一类特殊类型的接口的称呼。 
 * 这类接口只定义了唯一的抽象方法的接口（除了隐含的Object对象的公共方法）， 
 * 因此最开始也就做SAM类型的接口（Single Abstract Method）。
 * 接口最终有确定的类实现， 而类的最终父类是Object。 因此函数式接口可以定义Object的public方法。
 * 

为什么会单单从接口中定义出此类接口呢？ 原因是在
Java Lambda的实现中， 开发组不想再为Lambda表达式单独定义一种特殊的Structural函数类型，称之为箭头类型（arrow type），
 依然想采用Java既有的类型系统(class, interface, method等)， 原因是增加一个结构化的函数类型会增加函数类型的复杂性，
破坏既有的Java类型，并对成千上万的Java类库造成严重的影响。 权衡利弊， 因此最终还是利用SAM 接口作为 Lambda表达式的目标类型。
 *
 */
public class TestLambda2 {
	
	public static void main(String[] args) {
		
		Action action = new Action() {
			
			@Override
			public void execute(String content) {
				System.out.println(content);
				
			}
			

		};
		action.execute("jdk1.8之前");
		action.toString();
		
		
		Action action2 = (String s)->{
			System.out.println(s);
		};
		action2.execute("jdk1.8之后的lambda语法");
		
		
		Action action3 = (str)->{
			System.out.println(str);
		};
		action3.execute("jdk1.8之后的lambda语法,省略参数类型");
		
		Action action4 = str->{
			System.out.println(str);
		};
		action4.execute("jdk1.8之后的lambda语法,省略参数类型和挂号");
		
		Action2 action5 = (str,str2)->{
			System.out.println(str);
		};
		action5.execute("jdk1.8之后的lambda语法,省略参数类型和挂号","");
		
		
		
	}
	
	@FunctionalInterface
	interface Action{
		
		void execute(String content); 
		
		String toString();
		
		default void ss(){
			
		}
		
		static void m2(){
			
		}
		
	}
	
	@FunctionalInterface
	interface Action2{
		
		void execute(String content,String content2); 
		
	}

}
