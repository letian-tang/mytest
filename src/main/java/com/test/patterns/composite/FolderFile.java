package com.test.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器组件
 * 
 * @author tdy
 *
 */
public class FolderFile implements AbstractFile {

	private List<AbstractFile> files = new ArrayList<>();

	private String name;

	public FolderFile(String name) {
		this.name = name;
	}
	
	public void add(AbstractFile file){
		files.add(file);
	}
	
	public void remove(AbstractFile file){
		files.remove(file);
	}
	
	public AbstractFile getChild(int index){
		return files.get(index);
	}

	@Override
	public void antivirus() {
		System.out.println("查杀" + name);
		for (AbstractFile abstractFile : files) {
			abstractFile.antivirus();
		}
	}


}
