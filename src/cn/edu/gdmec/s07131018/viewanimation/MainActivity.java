package cn.edu.gdmec.s07131018.viewanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void rotate(View view){
		Animation animation = AnimationUtils.loadAnimation(this,R.anim.myrotate);
		tv.startAnimation(animation);
	}
	public void alpha(View view){
		Animation animation = AnimationUtils.loadAnimation(this,R.anim.myalpha);
		tv.startAnimation(animation);
	}
	public void scale(View view){
		Animation animation = AnimationUtils.loadAnimation(this,R.anim.myscale);
		tv.startAnimation(animation);
	}
	public void translate(View view){
		Animation animation = AnimationUtils.loadAnimation(this,R.anim.mytranslate);
		tv.startAnimation(animation);
	}
	public void set(View view){
		Animation animation = AnimationUtils.loadAnimation(this,R.anim.myset);
		tv.startAnimation(animation);
	}
	
}
