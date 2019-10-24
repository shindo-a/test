package test;

import java.util.Calendar;

public class Cal {


	int d;
	int m;
	int y;
	String yb;
	Calendar cal = Calendar.getInstance();

	Cal(){//コンストラクタ
		//Calendar cal = Calendar.getInstance();
	}

	public void dayMonth() {
		m = cal.get(Calendar.MONTH) + 1;//何故か1不足する
		d = cal.get(Calendar.DATE);
		y = cal.get(Calendar.DAY_OF_WEEK);

	}
	public void youbi() {
		switch(y) {
			case 1:
				yb = "日";
				break;
			case 2:
				yb = "月";
				break;
			case 3:
				yb = "火";
				break;
			case 4:
				yb = "水";
				break;
			case 5:
				yb = "木";
				break;
			case 6:
				yb = "金";
				break;
			case 7:
				yb = "土";
				break;
		}
	}

}
