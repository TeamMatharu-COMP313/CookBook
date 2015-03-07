package com.teammatharu.cookbook;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;

public class MainLandingPage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_landing_page);

		// Fire Base
		Firebase.setAndroidContext(this);

		// Fetching Image from Cloud
		final ImageView imgLogo = (ImageView) findViewById(R.id.imageView1);
		Firebase fImageMainLandingPage = new Firebase(
				"https://cookbook-teammatharu.firebaseio.com/0/ImageMainLandingPage");

		fImageMainLandingPage.addValueEventListener(new ValueEventListener() {

			@Override
			public void onDataChange(DataSnapshot arg0) {
				// TODO Auto-generated method stub
				String tempImage = (String) arg0.getValue();
				// Assigning Image to Image view
				UrlImageViewHelper.setUrlDrawable(imgLogo, tempImage);
			}

			@Override
			public void onCancelled(FirebaseError arg0) {
				// TODO Auto-generated method stub

			}
		});

		Button bMeal = (Button) findViewById(R.id.btnMeals);
		bMeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityCourse = new Intent(MainLandingPage.this,
						Sub_Meal_Page.class);
				// 2. put key/value data
				activityCourse.putExtra("bt1", "Breakfast and Brunch");
				activityCourse.putExtra("bt2", "Lunch Recipes");
				activityCourse.putExtra("bt3", "Dinner Recipes");
				activityCourse.putExtra("bt4", "none");
				activityCourse.putExtra("bt5", "none");
				activityCourse.putExtra("bt6", "none");
				activityCourse.putExtra("bt7", "none");
				activityCourse.putExtra("bt8", "none");
				activityCourse.putExtra("cookbook_MainLanding", "Meals");
				// 3. or you can add data to a bundle
				Bundle extras = new Bundle();
				// 4. add bundle to intent
				activityCourse.putExtras(extras);
				MainLandingPage.this.startActivity(activityCourse);
				finish();
			}
		});

		// Button Code
		final Button bCourse = (Button) findViewById(R.id.btnCourses);
		bCourse.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent activityCourse = new Intent(MainLandingPage.this,
						Sub_Meal_Page.class);
				// 2. put key/value data
				activityCourse.putExtra("bt1", "Appetizers and Snacks");
				activityCourse.putExtra("bt2", "Bread Recipes");
				activityCourse.putExtra("bt3", "Desserts");
				activityCourse.putExtra("bt4", "Drinks");
				activityCourse.putExtra("bt5", "Main Dishes");
				activityCourse.putExtra("bt6", "Salad Recipes");
				activityCourse.putExtra("bt7", "Side Dishes");
				activityCourse.putExtra("bt8", "Soups, Stews and Chili");
				activityCourse.putExtra("cookbook_MainLanding", "Courses");
				// 3. or you can add data to a bundle
				Bundle extras = new Bundle();
				// 4. add bundle to intent
				activityCourse.putExtras(extras);
				MainLandingPage.this.startActivity(activityCourse);
				finish();
			}
		});

		Button bMain_Ingredients = (Button) findViewById(R.id.btnMain_Ingredients);
		bMain_Ingredients.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityCourse = new Intent(MainLandingPage.this,
						Sub_Meal_Page.class);
				// 2. put key/value data
				activityCourse.putExtra("bt1", "Fruits and Vegetables");
				activityCourse.putExtra("bt2", "Meat and Poultry");
				activityCourse.putExtra("bt3", "Pasta and Noodles");
				activityCourse.putExtra("bt4", "Seafood Recipes");
				activityCourse.putExtra("bt5", "none");
				activityCourse.putExtra("bt6", "none");
				activityCourse.putExtra("bt7", "none");
				activityCourse.putExtra("bt8", "none");
				activityCourse.putExtra("cookbook_MainLanding",
						"Main Ingredients");
				// 3. or you can add data to a bundle
				Bundle extras = new Bundle();
				// 4. add bundle to intent
				activityCourse.putExtras(extras);
				MainLandingPage.this.startActivity(activityCourse);
				finish();
			}
		});

		Button bOcc_Cooking = (Button) findViewById(R.id.btnOcc_Cooking);
		bOcc_Cooking.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityCourse = new Intent(MainLandingPage.this,
						Sub_Meal_Page.class);

				activityCourse.putExtra("bt1", "BBQ & Grilling");
				activityCourse.putExtra("bt2", "Everyday Cooking");
				activityCourse.putExtra("bt3", "Healthy Recipes");
				activityCourse.putExtra("bt4", "Holidays and Events");
				activityCourse.putExtra("bt5", "Ingredients");
				activityCourse.putExtra("bt6", "U.S. Recipes");
				activityCourse.putExtra("bt7", "Wolrd Cuisine");
				activityCourse.putExtra("bt8", "none");
				activityCourse.putExtra("cookbook_MainLanding",
						"Occasions and Cooking Style");

				Bundle extras = new Bundle();

				activityCourse.putExtras(extras);
				MainLandingPage.this.startActivity(activityCourse);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.content, menu);
		return true;
	}

	@Override
	public void onBackPressed() {
		new AlertDialog.Builder(this)
				.setIcon(android.R.drawable.ic_dialog_alert)
				.setTitle("Exit")
				.setMessage("Are you sure you wanna quit?")
				.setPositiveButton("Yes",
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog,
									int which) {

								Intent intent = new Intent(Intent.ACTION_MAIN);
								intent.addCategory(Intent.CATEGORY_HOME);
								intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
								startActivity(intent);
								finish();
								// System.exit(0);
								// android.os.Process.killProcess(Process.)
							}
						}).setNegativeButton("No", null).show();
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
		if (id == R.id.action_contactus) {
			Intent i = new Intent(MainLandingPage.this, ContactUs.class);
			startActivity(i);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
