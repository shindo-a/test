package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteRead_test {

	public void readWrite(String name) throws FileNotFoundException ,Exception{
		String filename = "C:\\Users\\am\\Documents\\WriteRead\\" + name + ".txt";
		FileReader fr = new FileReader(filename);

		FileWriter fw = new FileWriter(filename, true);
		PrintWriter pr = new PrintWriter(fw);

		System.out.println("追加の予定を入力 完了の場合はスペース");

		String nyr = new java.util.Scanner(System.in).nextLine();

		//fw.write(nyr);
		//fw.close();
		pr.println(nyr);
		pr.close();
	}

}
