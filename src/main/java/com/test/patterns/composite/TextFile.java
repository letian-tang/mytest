package com.test.patterns.composite;

public class TextFile implements AbstractFile {

	private String name;

	public TextFile(String name) {
		this.name = name;
	}

	@Override
	public void antivirus() {
		System.out.println("查杀" + name + "文本文件");
	}
	
	@Override
	public void add(AbstractFile file) {
		return;
		
	}

	@Override
	public void remove(AbstractFile file) {
		return;
		
	}

	@Override
	public AbstractFile getChild(int index) {
		return null;
	}


}
