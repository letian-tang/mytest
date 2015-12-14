package com.test.patterns.visitor;

import com.test.patterns.visitor.str.Employees;
import com.test.patterns.visitor.str.Manager;

/**
 * 访问者接口
 * 
 * @author
 * 
 */
public interface IVisitor {
	// 访问管理者
	public void visit(Manager manager);

	// 访问普通员工
	public void visit(Employees employees);
}
