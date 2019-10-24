package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteOnly {

	public void readWrite(String name) throws FileNotFoundException ,Exception{//ファイルの読み
		String filename = "C:\\Users\\am\\Documents\\WriteRead\\" + name + ".txt";
		FileWriter fw = new FileWriter(filename, true);
		FileReader fr = new FileReader(filename);
		PrintWriter pr = new PrintWriter(fw);


		System.out.println("追加の予定を入力");
		//int a = 0;
		//if(a != KeyEvent.VK_SPACE) {//スペースが押されたら

		String nyr = new java.util.Scanner(System.in).nextLine();

		pr.println(nyr);
		pr.close();
	}

}
