package test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		//カレンダーの作成
		//予定の表示
		//当日の表示
		//明日の表示
		//予定の登録
		//

		Cal cal = new Cal();//インスタンス
		Schedule sc = new Schedule();
		ReadOnly wr = new ReadOnly();
		MyFrame my = new MyFrame("cal.m + \"月\" + cal.d + \"日\" + cal.yb + \"曜日\"");
		cal.dayMonth();
		cal.youbi();
		String name = "a" + cal.m + cal.d;
		String filename = "C:\\Users\\am\\Documents\\WriteRead\\" + name + ".txt";
		FileWriter fw = new FileWriter(filename, true);
		PrintWriter pr = new PrintWriter(fw);
		FileReader fr = new FileReader(filename);
		int ch = fr.read();



		my.MyFrame("本日は" + cal.m + "月" + cal.d + "日" + cal.yb + "曜日");
		my.setVisible(true);
		my.append("\n今日の授業は、" + sc.ans(cal.m, cal.d));
		my.append("\n\n本日のメモ\n");

		//BufferedReader b_reader = new BufferedReader(new InputStreamReader(new FileInputStream(ch),"Shift-JIS"));

		while(ch != -1) {
			my.appendC((char)ch);
			ch = fr.read();
		}
		fr.close();

		my.append("\n追加のメモを入力\n");
		String nyr = new java.util.Scanner(System.in).nextLine();
		my.append(nyr);
		pr.println(nyr);
		pr.close();

/*
		try {//↓エラーが出るのでトライキャッチ int →String の変換に何か方法は…？
			wr.readWrite(name);
			//my.MyFrame((String)wr.ch);

		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}*/

	}

}
