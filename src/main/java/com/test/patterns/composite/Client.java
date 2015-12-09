package com.test.patterns.composite;

public class Client {
	public static void main(String[] args) {
        AbstractFile f1,f2,f3,f4,f5;
        f1 = new TextFile("我的文本.txt");
        f2 = new VideoFile("枯树逢春.mp4");
        f3 = new ImageFile("春天.jpg");
        f4 = new FolderFile("文件夹2");
        
        f5 = new FolderFile("文件夹1");
        
        f4.add(f1);
        f4.add(f2);
        f4.add(f3);
        f5.add(f4);
        
        f5.antivirus();
	}
}
