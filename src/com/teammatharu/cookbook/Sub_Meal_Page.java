package com.teammatharu.cookbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;

public class Sub_Meal_Page extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub__meal__page);

		Button bt1 = (Button) findViewById(R.id.btn1);
		Button bt2 = (Button) findViewById(R.id.btn2);
		Button bt3 = (Button) findViewById(R.id.btn3);
		Button bt4 = (Button) findViewById(R.id.btn4);
		Button bt5 = (Button) findViewById(R.id.btn5);
		Button bt6 = (Button) findViewById(R.id.btn6);
		Button bt7 = (Button) findViewById(R.id.btn7);
		Button bt8 = (Button) findViewById(R.id.btn8);
		ImageView imgSubMeal = (ImageView) findViewById(R.id.imageViewSubMeal);

		// Logo image for this page (will be same for all menus)
		UrlImageViewHelper.setUrlDrawable(imgSubMeal,
				"http://twfoodrestaurant.com/v2images/food.jpg");

		// 1. get passed intent
		Intent intent = getIntent();
		// 2. get message value from intent
		String message1 = intent.getStringExtra("bt1");
		String message2 = intent.getStringExtra("bt2");
		String message3 = intent.getStringExtra("bt3");
		String message4 = intent.getStringExtra("bt4");
		String message5 = intent.getStringExtra("bt5");
		String message6 = intent.getStringExtra("bt6");
		String message7 = intent.getStringExtra("bt7");
		String message8 = intent.getStringExtra("bt8");

		// show text on Button
		bt1.setText(message1);
		bt2.setText(message2);
		bt3.setText(message3);
		bt4.setText(message4);
		bt5.setText(message5);
		bt6.setText(message6);
		bt7.setText(message7);
		bt8.setText(message8);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sub__meal__page, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(Sub_Meal_Page.this,
				MainLandingPage.class);
		Sub_Meal_Page.this.startActivity(activityIntent);
		finish();
	}
}
