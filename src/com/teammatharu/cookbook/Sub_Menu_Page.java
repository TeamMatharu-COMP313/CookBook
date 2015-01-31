package com.teammatharu.cookbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;

public class Sub_Menu_Page extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub__menu__page);

		// Declaring
		Button bt1_submeal = (Button) findViewById(R.id.btnmenu1);
		Button bt2_submeal = (Button) findViewById(R.id.btnmenu2);
		Button bt3_submeal = (Button) findViewById(R.id.btnmenu3);
		Button bt4_submeal = (Button) findViewById(R.id.btnmenu4);
		Button bt5_submeal = (Button) findViewById(R.id.btnmenu5);
		Button bt6_submeal = (Button) findViewById(R.id.btnmenu6);
		Button bt7_submeal = (Button) findViewById(R.id.btnmenu7);
		Button bt8_submeal = (Button) findViewById(R.id.btnmenu8);
		Button bt9_submeal = (Button) findViewById(R.id.btnmenu9);
		Button bt10_submeal = (Button) findViewById(R.id.btnmenu10);
		Button bt11_submeal = (Button) findViewById(R.id.btnmenu11);
		Button bt12_submeal = (Button) findViewById(R.id.btnmenu12);
		Button bt13_submeal = (Button) findViewById(R.id.btnmenu13);
		Button bt14_submeal = (Button) findViewById(R.id.btnmenu14);
		ImageView imgSubMenu = (ImageView) findViewById(R.id.imageViewSubMenu);

		// Logo image for this page (will be same for all menus)
		UrlImageViewHelper
				.setUrlDrawable(
						imgSubMenu,
						"http://www.gamesforboys.net/category/wp-content/thumbs/custom/M/Make-a-tasty-meal-on-games-for-boys.jpg");

		// 1. get passed intent
		Intent intent = getIntent();
		// 2. get message value from intent
		String message1 = intent.getStringExtra("bt1_submeal");
		String message2 = intent.getStringExtra("bt2_submeal");
		String message3 = intent.getStringExtra("bt3_submeal");
		String message4 = intent.getStringExtra("bt4_submeal");
		String message5 = intent.getStringExtra("bt5_submeal");
		String message6 = intent.getStringExtra("bt6_submeal");
		String message7 = intent.getStringExtra("bt7_submeal");
		String message8 = intent.getStringExtra("bt8_submeal");
		String message9 = intent.getStringExtra("bt9_submeal");
		String message10 = intent.getStringExtra("bt10_submeal");
		String message11 = intent.getStringExtra("bt11_submeal");
		String message12 = intent.getStringExtra("bt12_submeal");
		String message13 = intent.getStringExtra("bt13_submeal");
		String message14 = intent.getStringExtra("bt14_submeal");

		// show text on Button
		bt1_submeal.setText(message1);
		bt2_submeal.setText(message2);
		bt3_submeal.setText(message3);
		bt4_submeal.setText(message4);
		bt5_submeal.setText(message5);
		bt6_submeal.setText(message6);
		bt7_submeal.setText(message7);
		bt8_submeal.setText(message8);
		bt9_submeal.setText(message9);
		bt10_submeal.setText(message10);
		bt11_submeal.setText(message11);
		bt12_submeal.setText(message12);
		bt13_submeal.setText(message13);

		if (message1.equals("none")) {
			bt1_submeal.setVisibility(View.GONE);
		} else {
			bt1_submeal.setText(message1);
		}
		if (message2.equals("none")) {
			bt2_submeal.setVisibility(View.GONE);
		} else {
			bt2_submeal.setText(message2);
		}
		if (message3.equals("none")) {
			bt3_submeal.setVisibility(View.GONE);
		} else {
			bt3_submeal.setText(message3);
		}
		if (message4.equals("none")) {
			bt4_submeal.setVisibility(View.GONE);
		} else {
			bt4_submeal.setText(message4);
		}
		if (message5.equals("none")) {
			bt5_submeal.setVisibility(View.GONE);
		} else {
			bt5_submeal.setText(message5);
		}
		if (message6.equals("none")) {
			bt6_submeal.setVisibility(View.GONE);
		} else {
			bt6_submeal.setText(message6);
		}
		if (message7.equals("none")) {
			bt7_submeal.setVisibility(View.GONE);
		} else {
			bt7_submeal.setText(message7);
		}
		if (message8.equals("none")) {
			bt8_submeal.setVisibility(View.GONE);
		} else {
			bt8_submeal.setText(message8);
		}
		if (message9.equals("none")) {
			bt9_submeal.setVisibility(View.GONE);
		} else {
			bt9_submeal.setText(message9);
		}
		if (message10.equals("none")) {
			bt10_submeal.setVisibility(View.GONE);
		} else {
			bt10_submeal.setText(message10);
		}
		if (message11.equals("none")) {
			bt11_submeal.setVisibility(View.GONE);
		} else {
			bt11_submeal.setText(message11);
		}
		if (message12.equals("none")) {
			bt12_submeal.setVisibility(View.GONE);
		} else {
			bt12_submeal.setText(message12);
		}
		if (message13.equals("none")) {
			bt13_submeal.setVisibility(View.GONE);
		} else {
			bt13_submeal.setText(message13);
		}
		if (message14.equals("none")) {
			bt14_submeal.setVisibility(View.GONE);
		} else {
			bt14_submeal.setText(message14);
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sub__menu__page, menu);
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
		Intent activityIntent = new Intent(Sub_Menu_Page.this,
				MainLandingPage.class);
		Sub_Menu_Page.this.startActivity(activityIntent);
		finish();
	}
}
