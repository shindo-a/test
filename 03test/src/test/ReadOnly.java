package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ReadOnly {

int ch;

	public int readWrite(String name) throws FileNotFoundException ,Exception{//ファイルの読み
		String filename = "C:\\Users\\am\\Documents\\WriteRead\\" + name + ".txt";
		FileWriter fw = new FileWriter(filename, true);
		FileReader fr = new FileReader(filename);
		PrintWriter pr = new PrintWriter(fw);

		//System.out.println("\n本日の予定\n");//予定の表示

		ch = fr.read();
		//char c1 = (char) fr.read();
		while(ch != -1) {
			ch = fr.read();

		}
		return ((char)ch);
		//fr.close();

	}

}
