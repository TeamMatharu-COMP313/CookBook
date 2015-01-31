package com.teammatharu.cookbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;

public class Sub_Meal_Page extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub__meal__page);

		// Declaring
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

		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityCourse = new Intent(Sub_Meal_Page.this,
						Sub_Menu_Page.class);
				// 2. put key/value data
				activityCourse.putExtra("bt1_submeal", "Antipasto Recipes");
				activityCourse.putExtra("bt2_submeal",
						"Bread and Pastry Appetizer");
				activityCourse.putExtra("bt3_submeal", "Cheese Appetizers");
				activityCourse.putExtra("bt4_submeal", "Crackers");
				activityCourse.putExtra("bt5_submeal", "Deviled Eggs");
				activityCourse.putExtra("bt6_submeal",
						"Dill Pickle and Sweet Pickles");
				activityCourse.putExtra("bt7_submeal", "Dips and Spreads");
				activityCourse.putExtra("bt8_submeal", "Fruit Appetizers");
				activityCourse.putExtra("bt9_submeal", "Mushroom Appetizers");
				activityCourse.putExtra("bt10_submeal", "Olive Appetizers");
				activityCourse.putExtra("bt11_submeal", "Pasta Appetizers");
				activityCourse.putExtra("bt12_submeal", "Pastry Appetizers");
				activityCourse.putExtra("bt13_submeal", "Seafood Appetizers");
				activityCourse.putExtra("bt14_submeal", "Spicy Appetizers");
				// 3. or you can add data to a bundle
				Bundle extras = new Bundle();
				// 4. add bundle to intent
				activityCourse.putExtras(extras);
				Sub_Meal_Page.this.startActivity(activityCourse);
				finish();
			}
		});
		bt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityCourse = new Intent(Sub_Meal_Page.this,
						Sub_Menu_Page.class);
				// 2. put key/value data
				activityCourse.putExtra("bt1_submeal", "Pastries");
				activityCourse.putExtra("bt2_submeal", "Pizza Dough and Crusts");
				activityCourse.putExtra("bt3_submeal", "Bagels");
				activityCourse.putExtra("bt4_submeal", "Yeast Bread");
				activityCourse.putExtra("bt5_submeal", "none");
				activityCourse.putExtra("bt6_submeal", "none");
				activityCourse.putExtra("bt7_submeal", "none");
				activityCourse.putExtra("bt8_submeal", "none");
				activityCourse.putExtra("bt9_submeal", "none");
				activityCourse.putExtra("bt10_submeal", "none");
				activityCourse.putExtra("bt11_submeal", "none");
				activityCourse.putExtra("bt12_submeal", "none");
				activityCourse.putExtra("bt13_submeal", "none");
				activityCourse.putExtra("bt14_submeal", "none");
				// 3. or you can add data to a bundle
				Bundle extras = new Bundle();
				// 4. add bundle to intent
				activityCourse.putExtras(extras);
				Sub_Meal_Page.this.startActivity(activityCourse);
				finish();
			}
		});
		bt3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityCourse = new Intent(Sub_Meal_Page.this,
						Sub_Menu_Page.class);
				// 2. put key/value data
				activityCourse.putExtra("bt1_submeal", "Cake Recipes");
				activityCourse.putExtra("bt2_submeal", "Cookies");
				activityCourse.putExtra("bt3_submeal", "Custards and Pudding");
				activityCourse.putExtra("bt4_submeal", "Frozen Desserts");
				activityCourse.putExtra("bt5_submeal", "Fruits Desserts");
				activityCourse.putExtra("bt6_submeal", "Pie Recipes");
				activityCourse.putExtra("bt7_submeal", "none");
				activityCourse.putExtra("bt8_submeal", "none");
				activityCourse.putExtra("bt9_submeal", "none");
				activityCourse.putExtra("bt10_submeal", "none");
				activityCourse.putExtra("bt11_submeal", "none");
				activityCourse.putExtra("bt12_submeal", "none");
				activityCourse.putExtra("bt13_submeal", "none");
				activityCourse.putExtra("bt14_submeal", "none");
				// 3. or you can add data to a bundle
				Bundle extras = new Bundle();
				// 4. add bundle to intent
				activityCourse.putExtras(extras);
				Sub_Meal_Page.this.startActivity(activityCourse);
				finish();
			}
		});
		bt4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityCourse = new Intent(Sub_Meal_Page.this,
						Sub_Menu_Page.class);
				// 2. put key/value data
				activityCourse.putExtra("bt1_submeal", "Beer");
				activityCourse.putExtra("bt2_submeal", "Cider Drinks");
				activityCourse.putExtra("bt3_submeal", "Cocktails");
				activityCourse.putExtra("bt4_submeal", "Coffee");
				activityCourse.putExtra("bt5_submeal", "Hot Chocolates");
				activityCourse.putExtra("bt6_submeal", "Juices");
				activityCourse.putExtra("bt7_submeal", "Mocktails");
				activityCourse.putExtra("bt8_submeal", "Smoothies");
				activityCourse.putExtra("bt9_submeal", "Tea");
				activityCourse.putExtra("bt10_submeal", "none");
				activityCourse.putExtra("bt11_submeal", "none");
				activityCourse.putExtra("bt12_submeal", "none");
				activityCourse.putExtra("bt13_submeal", "none");
				activityCourse.putExtra("bt14_submeal", "none");
				// 3. or you can add data to a bundle
				Bundle extras = new Bundle();
				// 4. add bundle to intent
				activityCourse.putExtras(extras);
				Sub_Meal_Page.this.startActivity(activityCourse);
				finish();
			}
		});
		bt5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityCourse = new Intent(Sub_Meal_Page.this,
						Sub_Menu_Page.class);
				// 2. put key/value data
				activityCourse.putExtra("bt1_submeal", "");
				activityCourse.putExtra("bt2_submeal", "");
				activityCourse.putExtra("bt3_submeal", "");
				activityCourse.putExtra("bt4_submeal", "");
				activityCourse.putExtra("bt5_submeal", "");
				activityCourse.putExtra("bt6_submeal", "");
				activityCourse.putExtra("bt7_submeal", "");
				activityCourse.putExtra("bt8_submeal", "");
				activityCourse.putExtra("bt9_submeal", "");
				activityCourse.putExtra("bt10_submeal", "");
				activityCourse.putExtra("bt11_submeal", "");
				activityCourse.putExtra("bt12_submeal", "");
				activityCourse.putExtra("bt13_submeal", "");
				activityCourse.putExtra("bt14_submeal", "");
				// 3. or you can add data to a bundle
				Bundle extras = new Bundle();
				// 4. add bundle to intent
				activityCourse.putExtras(extras);
				Sub_Meal_Page.this.startActivity(activityCourse);
				finish();
			}
		});
		bt6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityCourse = new Intent(Sub_Meal_Page.this,
						Sub_Menu_Page.class);
				// 2. put key/value data
				activityCourse.putExtra("bt1_submeal", "");
				activityCourse.putExtra("bt2_submeal", "");
				activityCourse.putExtra("bt3_submeal", "");
				activityCourse.putExtra("bt4_submeal", "");
				activityCourse.putExtra("bt5_submeal", "");
				activityCourse.putExtra("bt6_submeal", "");
				activityCourse.putExtra("bt7_submeal", "");
				activityCourse.putExtra("bt8_submeal", "");
				activityCourse.putExtra("bt9_submeal", "");
				activityCourse.putExtra("bt10_submeal", "");
				activityCourse.putExtra("bt11_submeal", "");
				activityCourse.putExtra("bt12_submeal", "");
				activityCourse.putExtra("bt13_submeal", "");
				activityCourse.putExtra("bt14_submeal", "");
				// 3. or you can add data to a bundle
				Bundle extras = new Bundle();
				// 4. add bundle to intent
				activityCourse.putExtras(extras);
				Sub_Meal_Page.this.startActivity(activityCourse);
				finish();
			}
		});
		bt7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityCourse = new Intent(Sub_Meal_Page.this,
						Sub_Menu_Page.class);
				// 2. put key/value data
				activityCourse.putExtra("bt1_submeal", "");
				activityCourse.putExtra("bt2_submeal", "");
				activityCourse.putExtra("bt3_submeal", "");
				activityCourse.putExtra("bt4_submeal", "");
				activityCourse.putExtra("bt5_submeal", "");
				activityCourse.putExtra("bt6_submeal", "");
				activityCourse.putExtra("bt7_submeal", "");
				activityCourse.putExtra("bt8_submeal", "");
				activityCourse.putExtra("bt9_submeal", "");
				activityCourse.putExtra("bt10_submeal", "");
				activityCourse.putExtra("bt11_submeal", "");
				activityCourse.putExtra("bt12_submeal", "");
				activityCourse.putExtra("bt13_submeal", "");
				activityCourse.putExtra("bt14_submeal", "");
				// 3. or you can add data to a bundle
				Bundle extras = new Bundle();
				// 4. add bundle to intent
				activityCourse.putExtras(extras);
				Sub_Meal_Page.this.startActivity(activityCourse);
				finish();
			}
		});
		bt8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityCourse = new Intent(Sub_Meal_Page.this,
						Sub_Menu_Page.class);
				// 2. put key/value data
				activityCourse.putExtra("bt1_submeal", "");
				activityCourse.putExtra("bt2_submeal", "");
				activityCourse.putExtra("bt3_submeal", "");
				activityCourse.putExtra("bt4_submeal", "");
				activityCourse.putExtra("bt5_submeal", "");
				activityCourse.putExtra("bt6_submeal", "");
				activityCourse.putExtra("bt7_submeal", "");
				activityCourse.putExtra("bt8_submeal", "");
				activityCourse.putExtra("bt9_submeal", "");
				activityCourse.putExtra("bt10_submeal", "");
				activityCourse.putExtra("bt11_submeal", "");
				activityCourse.putExtra("bt12_submeal", "");
				activityCourse.putExtra("bt13_submeal", "");
				activityCourse.putExtra("bt14_submeal", "");
				// 3. or you can add data to a bundle
				Bundle extras = new Bundle();
				// 4. add bundle to intent
				activityCourse.putExtras(extras);
				Sub_Meal_Page.this.startActivity(activityCourse);
				finish();
			}
		});

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
