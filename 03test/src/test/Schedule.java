package test;

public class Schedule {

	String[] yotei =
		{"javaプログラミング実習" , "ドキュメントと管理ツール", "マクロ", "データベース", "Webプログラミング", "サービスサイドjava","企業実習", "Pythonプログラミング"};
	String a;
	//予定を返す
	////
	public String ans(int m, int d) {
		if(m == 9 && d <= 26) {a = yotei[0];};
		if(m == 9 && d >= 27){a = yotei[1];}
		if(m == 10 && d <= 8) {a = yotei[2];}
		if(m == 10 && d > 8) {a = yotei[3];}
		if(m == 11) {a = yotei[5];} //ダミーで作成

		return a;
	}

}
