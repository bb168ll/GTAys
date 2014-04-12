package tarena.day0602;

import java.util.Arrays;
import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv=(TextView)findViewById(R.id.textView2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void doClick(View view) {
		int[] red=new int[33];
		int[] redResult=new int[6];
		for (int i = 0; i < red.length; i++) {
			red[i]=i+1;
		}
		for (int i = 0; i <6;i++) {
			zhongJian:
			while(true){
			int a=red[new Random().nextInt(33)];
			//找重复的 从0到i
			for (int j = 0; j <i; j++) {
				if (a==redResult[j]) {
					continue  zhongJian;
				}
			 }
			redResult[i]=a;
			break;
			}
		}
		int  blueResult=1+new Random().nextInt(16);
		tv.append("红球:"+Arrays.toString(redResult));
		tv.append("篮球:"+blueResult+"\n");
		
		
	}

}
