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

public class MainLandingPage extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_landing_page);

		// Fetching Image from Cloud
		ImageView imgLogo = (ImageView) findViewById(R.id.imageView1);
		UrlImageViewHelper
				.setUrlDrawable(imgLogo,
						"http://s23.postimg.org/gzn9lk2h7/cookbooklogoimagemainpage.png");

		// Button Code
		Button bCourse = (Button) findViewById(R.id.btnCourses);
		bCourse.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityCourse = new Intent(MainLandingPage.this,
						Sub_Meal_Page.class);
				// 2. put key/value data
				activityCourse.putExtra("arg", "asasasasasa");
				// 3. or you can add data to a bundle
		        Bundle extras = new Bundle();
		        // 4. add bundle to intent
		        activityCourse.putExtras(extras);
				MainLandingPage.this.startActivity(activityCourse);
				finish();
			}
		});
		
		Button bMeal = (Button) findViewById(R.id.btnMeals);
		bMeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent activityCourse = new Intent(MainLandingPage.this,
						Sub_Meal_Page.class);
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
				MainLandingPage.this.startActivity(activityCourse);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_landing_page, menu);
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
}
