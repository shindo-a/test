package test;

import java.awt.Frame;
import java.awt.TextArea;

public class MyFrame extends Frame {

	TextArea t;

	public  MyFrame(String text) {
		setSize(200, 200);
		addWindowListener(new MyWindowAdapter());
		t = new TextArea(text, 20, 20);//行数、列数
		add(t);
	}
	public  void MyFrame(String text) {
		setSize(200, 200);
		addWindowListener(new MyWindowAdapter());
		t = new TextArea(text, 20, 20);//行数、列数
		add(t);
	}

	public MyFrame() {

	}
	public void append(String text) {
		t.append(text);

	}
	public void appendC(char c) {
		String str =String.valueOf(c);
		t.append(str);
	}

}
