package com.test.patterns.composite;

/**
 * 抽象组件
 * 
 * @author tdy
 *
 */
public interface AbstractFile {

	void antivirus();

	void add(AbstractFile file);

	void remove(AbstractFile file);

	AbstractFile getChild(int index);
}
