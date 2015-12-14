package com.test.patterns.visitor;

import com.test.patterns.visitor.str.Employees;
import com.test.patterns.visitor.str.Manager;

/**
 * 打印基本信息访问者
 * 
 * @author
 * 
 */
public class PrintBaseInfoVisitor implements IVisitor {

	/**
	 * 访问管理者对象
	 */
	public void visit(Manager manager) {
		System.out.print("- 管理者：");
		manager.printUserBaseInfo();
	}

	/**
	 * 访问普通员工对象
	 */
	public void visit(Employees employees) {
		System.out.print("- 一般员工：");
		employees.printUserBaseInfo();
	}

}
