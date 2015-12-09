package com.test.patterns.composite;

public class ImageFile implements AbstractFile{
	
	private String name;
	
	public ImageFile(String name){
		this.name = name;
	}

	@Override
	public void antivirus() {
		System.out.println("查杀"+name+"图片文件");
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
