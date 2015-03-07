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

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;

public class Sub_Meal_Page extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub__meal__page);

		// Fire Base
		Firebase.setAndroidContext(this);

		// Declaring
		Button bt1 = (Button) findViewById(R.id.btn1);
		Button bt2 = (Button) findViewById(R.id.btn2);
		Button bt3 = (Button) findViewById(R.id.btn3);
		Button bt4 = (Button) findViewById(R.id.btn4);
		Button bt5 = (Button) findViewById(R.id.btn5);
		Button bt6 = (Button) findViewById(R.id.btn6);
		Button bt7 = (Button) findViewById(R.id.btn7);
		Button bt8 = (Button) findViewById(R.id.btn8);
		final ImageView imgSubMeal = (ImageView) findViewById(R.id.imageViewSubMeal);

		Firebase fImageSubMealPage = new Firebase(
				"https://cookbook-teammatharu.firebaseio.com/0/ImageSubMealPage");
		fImageSubMealPage.addValueEventListener(new ValueEventListener() {

			@Override
			public void onDataChange(DataSnapshot arg0) {
				// TODO Auto-generated method stub
				String tempImage = (String) arg0.getValue();
				// Logo image for this page (will be same for all menus)
				UrlImageViewHelper.setUrlDrawable(imgSubMeal, tempImage);

			}

			@Override
			public void onCancelled(FirebaseError arg0) {
				// TODO Auto-generated method stub

			}
		});

		// 1. get passed intent
		Intent intent = getIntent();
		// 2. get message value from intent
		final String message1 = intent.getStringExtra("bt1");
		String message2 = intent.getStringExtra("bt2");
		String message3 = intent.getStringExtra("bt3");
		String message4 = intent.getStringExtra("bt4");
		String message5 = intent.getStringExtra("bt5");
		String message6 = intent.getStringExtra("bt6");
		String message7 = intent.getStringExtra("bt7");
		String message8 = intent.getStringExtra("bt8");
		final String cookbook_mainLanding = intent
				.getStringExtra("cookbook_MainLanding");

		// show text on Button
		bt1.setText(message1);
		bt2.setText(message2);
		bt3.setText(message3);
		bt4.setText(message4);
		bt5.setText(message5);
		bt6.setText(message6);
		bt7.setText(message7);
		bt8.setText(message8);

		if (message1.equals("none")) {
			bt1.setVisibility(View.GONE);
		} else {

		}

		if (message2.equals("none")) {
			bt2.setVisibility(View.GONE);
		} else {

		}

		if (message3.equals("none")) {
			bt3.setVisibility(View.GONE);
		} else {

		}

		if (message4.equals("none")) {
			bt4.setVisibility(View.GONE);
		} else {

		}

		if (message5.equals("none")) {
			bt5.setVisibility(View.GONE);
		} else {

		}

		if (message6.equals("none")) {
			bt6.setVisibility(View.GONE);
		} else {

		}

		if (message7.equals("none")) {
			bt7.setVisibility(View.GONE);
		} else {

		}

		if (message8.equals("none")) {
			bt8.setVisibility(View.GONE);
		} else {

		}

		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if (cookbook_mainLanding.equals("Meals")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data

					activityCourse.putExtra("bt1_submeal", "Breakfast Drinks");
					activityCourse.putExtra("bt2_submeal",
							"Breakfast Egg Recipes");
					activityCourse.putExtra("bt3_submeal",
							"Breakfast Meat and Seafood");
					activityCourse.putExtra("bt4_submeal", "Crepes");
					activityCourse.putExtra("bt5_submeal", "French Toast");
					activityCourse.putExtra("bt6_submeal", "Pancakes");
					activityCourse.putExtra("bt7_submeal", "Waffles");
					activityCourse.putExtra("bt8_submeal", "none");
					activityCourse.putExtra("bt9_submeal", "none");
					activityCourse.putExtra("bt10_submeal", "none");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal", "Meals");
					activityCourse.putExtra("cookbook_MainLanding", "Meals");

					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Courses")) {
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
					activityCourse.putExtra("bt9_submeal",
							"Mushroom Appetizers");
					activityCourse.putExtra("bt10_submeal", "Olive Appetizers");
					activityCourse.putExtra("bt11_submeal", "Pasta Appetizers");
					activityCourse
							.putExtra("bt12_submeal", "Pastry Appetizers");
					activityCourse.putExtra("bt13_submeal",
							"Seafood Appetizers");
					activityCourse.putExtra("bt14_submeal", "Spicy Appetizers");
					activityCourse.putExtra("cookbook_SubMeal", "Courses");
					activityCourse.putExtra("cookbook_MainLanding", "Courses");

					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Main Ingredients")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data

					activityCourse.putExtra("bt1_submeal", "Beans and Peas");
					activityCourse.putExtra("bt2_submeal", "Fruit");
					activityCourse.putExtra("bt3_submeal", "Mushrooms");
					activityCourse.putExtra("bt4_submeal", "Vegetables");
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
					activityCourse.putExtra("cookbook_SubMeal",
							"Main Ingredients");
					activityCourse.putExtra("cookbook_MainLanding",
							"Main Ingredients");

					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding
						.equals("Occasions and Cooking Style")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data

					activityCourse.putExtra("bt1_submeal", "Grilled Beef");
					activityCourse.putExtra("bt2_submeal", "Grilled Chicken");
					activityCourse.putExtra("bt3_submeal", "Grilled Fruits");
					activityCourse.putExtra("bt4_submeal", "Grilled Lamb");
					activityCourse.putExtra("bt5_submeal", "Grilled Pork");
					activityCourse.putExtra("bt6_submeal", "Grilled Salads");
					activityCourse.putExtra("bt7_submeal", "Grilled Seafood");
					activityCourse.putExtra("bt8_submeal", "Grilled Turkey");
					activityCourse
							.putExtra("bt9_submeal", "Grilled vegetables");
					activityCourse.putExtra("bt10_submeal", "none");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal",
							"Occasions and Cooking Style");
					activityCourse.putExtra("cookbook_MainLanding",
							"Occasions and Cooking Style");

					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				}

			}
		});
		bt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_mainLanding.equals("Meals")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "Burgers");
					activityCourse.putExtra("bt2_submeal", "Burritos");
					activityCourse.putExtra("bt3_submeal", "Healthy Lunches");
					activityCourse.putExtra("bt4_submeal",
							"Macaroni and Cheese");
					activityCourse.putExtra("bt5_submeal", "Pizza");
					activityCourse.putExtra("bt6_submeal",
							"Sandwiches and Wraps");
					activityCourse.putExtra("bt7_submeal", "none");
					activityCourse.putExtra("bt8_submeal", "none");
					activityCourse.putExtra("bt9_submeal", "none");
					activityCourse.putExtra("bt10_submeal", "none");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal", "Meals");
					activityCourse.putExtra("cookbook_MainLanding", "Meals");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Courses")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "Pastries");
					activityCourse.putExtra("bt2_submeal",
							"Pizza Dough and Crusts");
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
					activityCourse.putExtra("cookbook_SubMeal", "Courses");
					activityCourse.putExtra("cookbook_MainLanding", "Courses");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Main Ingredients")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "Beef");
					activityCourse.putExtra("bt2_submeal", "Chicken");
					activityCourse.putExtra("bt3_submeal", "Game Meats");
					activityCourse.putExtra("bt4_submeal", "Lamb");
					activityCourse.putExtra("bt5_submeal", "Pork");
					activityCourse.putExtra("bt6_submeal", "Sausage");
					activityCourse.putExtra("bt7_submeal", "Turkey");
					activityCourse.putExtra("bt8_submeal", "none");
					activityCourse.putExtra("bt9_submeal", "none");
					activityCourse.putExtra("bt10_submeal", "none");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal",
							"Main Ingredients");
					activityCourse.putExtra("cookbook_MainLanding",
							"Main Ingredients");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding
						.equals("Occasions and Cooking Style")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "Budget Cooking");
					activityCourse.putExtra("bt2_submeal", "Comfort Food");
					activityCourse.putExtra("bt3_submeal",
							"Convenience Cooking");
					activityCourse.putExtra("bt4_submeal", "Gourmet Recipes");
					activityCourse.putExtra("bt5_submeal", "Kosher Recipes");
					activityCourse.putExtra("bt6_submeal",
							"Pressure Cooker Recipes");
					activityCourse.putExtra("bt7_submeal", "Seasonal Cooking");
					activityCourse.putExtra("bt8_submeal", "none");
					activityCourse.putExtra("bt9_submeal", "none");
					activityCourse.putExtra("bt10_submeal", "none");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal",
							"Occasions and Cooking Style");
					activityCourse.putExtra("cookbook_MainLanding",
							"Occasions and Cooking Style");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				}

			}
		});
		bt3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if (cookbook_mainLanding.equals("Meals")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "All Main Dishes");
					activityCourse.putExtra("bt2_submeal",
							"Healthy Main Dishes");
					activityCourse.putExtra("bt3_submeal", "Dish Salad");
					activityCourse.putExtra("bt4_submeal", "Vegetarian Dishes");
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
					activityCourse.putExtra("cookbook_SubMeal", "Meals");
					activityCourse.putExtra("cookbook_MainLanding", "Meals");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Courses")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "Cake Recipes");
					activityCourse.putExtra("bt2_submeal", "Cookies");
					activityCourse.putExtra("bt3_submeal",
							"Custards and Pudding");
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
					activityCourse.putExtra("cookbook_SubMeal", "Courses");
					activityCourse.putExtra("cookbook_MainLanding", "Courses");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Main Ingredients")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "Bow Tie Pasta");
					activityCourse.putExtra("bt2_submeal", "Eggless Pasta");
					activityCourse.putExtra("bt3_submeal",
							"Fresh Semolina & Egg Pasta");
					activityCourse.putExtra("bt4_submeal", "Gnocchi Pasta");
					activityCourse.putExtra("bt5_submeal", "Noodles");
					activityCourse.putExtra("bt6_submeal", "Plain Pasta");
					activityCourse.putExtra("bt7_submeal", "Shell Pasta");
					activityCourse.putExtra("bt8_submeal", "Whole Wheat Pasta");
					activityCourse.putExtra("bt9_submeal", "none");
					activityCourse.putExtra("bt10_submeal", "none");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal",
							"Main Ingredients");
					activityCourse.putExtra("cookbook_MainLanding",
							"Main Ingredients");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding
						.equals("Occasions and Cooking Style")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse
							.putExtra("bt1_submeal", "Healthy Appetizers");
					activityCourse.putExtra("bt2_submeal", "Healthy Desserts");
					activityCourse.putExtra("bt3_submeal", "Healthy Lunches");
					activityCourse.putExtra("bt4_submeal", "Healthy Salads");
					activityCourse.putExtra("bt5_submeal", "Healthy Soups");
					activityCourse.putExtra("bt6_submeal",
							"Low-Calorie Recipes");
					activityCourse.putExtra("bt7_submeal", "none");
					activityCourse.putExtra("bt8_submeal", "none");
					activityCourse.putExtra("bt9_submeal", "none");
					activityCourse.putExtra("bt10_submeal", "none");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal",
							"Occasions and Cooking Style");
					activityCourse.putExtra("cookbook_MainLanding",
							"Occasions and Cooking Style");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				}

			}
		});
		bt4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if (cookbook_mainLanding.equals("Meals")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "none");
					activityCourse.putExtra("bt2_submeal", "none");
					activityCourse.putExtra("bt3_submeal", "none");
					activityCourse.putExtra("bt4_submeal", "none");
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
					activityCourse.putExtra("cookbook_SubMeal", "Meals");
					activityCourse.putExtra("cookbook_MainLanding", "Meals");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Courses")) {
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
					activityCourse.putExtra("cookbook_SubMeal", "Courses");
					activityCourse.putExtra("cookbook_MainLanding", "Courses");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Main Ingredients")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "Fish Recipes");
					activityCourse.putExtra("bt2_submeal", "Crab Recipes");
					activityCourse.putExtra("bt3_submeal", "Lobster Recipes");
					activityCourse.putExtra("bt4_submeal", "Mussel Recipes");
					activityCourse.putExtra("bt5_submeal",
							"Octopus and Squid Recipes");
					activityCourse.putExtra("bt6_submeal", "Oyster Recipes");
					activityCourse.putExtra("bt7_submeal", "Shrimp Recipes");
					activityCourse.putExtra("bt8_submeal", "Crawfish Recipes");
					activityCourse.putExtra("bt9_submeal", "Scallop Recipes");
					activityCourse.putExtra("bt10_submeal", "none");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal",
							"Main Ingredients");
					activityCourse.putExtra("cookbook_MainLanding",
							"Main Ingredients");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding
						.equals("Occasions and Cooking Style")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "Easter Recipes");
					activityCourse.putExtra("bt2_submeal",
							"Events and Gatherings");
					activityCourse.putExtra("bt3_submeal", "Kwanzaa Recipes");
					activityCourse.putExtra("bt4_submeal", "Purim Recipes");
					activityCourse.putExtra("bt5_submeal", "Ramadan Recipes");
					activityCourse.putExtra("bt6_submeal",
							"Valentine's Day Recipes");
					activityCourse.putExtra("bt7_submeal", "none");
					activityCourse.putExtra("bt8_submeal", "none");
					activityCourse.putExtra("bt9_submeal", "none");
					activityCourse.putExtra("bt10_submeal", "none");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal",
							"Occasions and Cooking Style");
					activityCourse.putExtra("cookbook_MainLanding",
							"Occasions and Cooking Style");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				}

			}
		});
		bt5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if (cookbook_mainLanding.equals("Meals")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "none");
					activityCourse.putExtra("bt2_submeal", "none");
					activityCourse.putExtra("bt3_submeal", "none");
					activityCourse.putExtra("bt4_submeal", "none");
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
					activityCourse.putExtra("cookbook_SubMeal", "Meals");
					activityCourse.putExtra("cookbook_MainLanding", "Meals");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Courses")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "Calzones");
					activityCourse.putExtra("bt2_submeal",
							"Deep Fried Main Dish");
					activityCourse.putExtra("bt3_submeal", "Eggplant Parmesan");
					activityCourse.putExtra("bt4_submeal", "Meatballs");
					activityCourse.putExtra("bt5_submeal", "Meatloaf Recipes");
					activityCourse.putExtra("bt6_submeal", "Pasta");
					activityCourse.putExtra("bt7_submeal", "Ribs");
					activityCourse.putExtra("bt8_submeal", "Roast");
					activityCourse.putExtra("bt9_submeal", "Steaks and Chops");
					activityCourse.putExtra("bt10_submeal", "none");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal", "Courses");
					activityCourse.putExtra("cookbook_MainLanding", "Courses");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Main Ingredients")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "none");
					activityCourse.putExtra("bt2_submeal", "none");
					activityCourse.putExtra("bt3_submeal", "none");
					activityCourse.putExtra("bt4_submeal", "none");
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
					activityCourse.putExtra("cookbook_SubMeal",
							"Main Ingredients");
					activityCourse.putExtra("cookbook_MainLanding",
							"Main Ingredients");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding
						.equals("Occasions and Cooking Style")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse
							.putExtra("bt1_submeal", "Baking Ingredients");
					activityCourse.putExtra("bt2_submeal", "Beef");
					activityCourse.putExtra("bt3_submeal", "Chicken");
					activityCourse.putExtra("bt4_submeal", "Dairy Products");
					activityCourse.putExtra("bt5_submeal", "Fish");
					activityCourse.putExtra("bt6_submeal", "Herbs and Spices");
					activityCourse.putExtra("bt7_submeal", "Lamb");
					activityCourse.putExtra("bt8_submeal", "Pork");
					activityCourse.putExtra("bt9_submeal", "Whole Grains");
					activityCourse.putExtra("bt10_submeal", "Seafood");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal",
							"Occasions and Cooking Style");
					activityCourse.putExtra("cookbook_MainLanding",
							"Occasions and Cooking Style");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				}

			}
		});
		bt6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if (cookbook_mainLanding.equals("Meals")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "none");
					activityCourse.putExtra("bt2_submeal", "none");
					activityCourse.putExtra("bt3_submeal", "none");
					activityCourse.putExtra("bt4_submeal", "none");
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
					activityCourse.putExtra("cookbook_SubMeal", "Meals");
					activityCourse.putExtra("cookbook_MainLanding", "Meals");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Courses")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "Chicken Salad");
					activityCourse.putExtra("bt2_submeal", "Curry Salad");
					activityCourse.putExtra("bt3_submeal", "Egg Salad");
					activityCourse.putExtra("bt4_submeal", "Fruit Salad");
					activityCourse.putExtra("bt5_submeal", "Green Salad");
					activityCourse.putExtra("bt6_submeal", "Pasta Salad");
					activityCourse.putExtra("bt7_submeal", "Seafood Salad");
					activityCourse.putExtra("bt8_submeal", "Taco Salad");
					activityCourse.putExtra("bt9_submeal", "Vegetable Salad");
					activityCourse.putExtra("bt10_submeal", "none");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal", "Courses");
					activityCourse.putExtra("cookbook_MainLanding", "Courses");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Main Ingredients")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "none");
					activityCourse.putExtra("bt2_submeal", "none");
					activityCourse.putExtra("bt3_submeal", "none");
					activityCourse.putExtra("bt4_submeal", "none");
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
					activityCourse.putExtra("cookbook_SubMeal",
							"Main Ingredients");
					activityCourse.putExtra("cookbook_MainLanding",
							"Main Ingredients");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding
						.equals("Occasions and Cooking Style")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "Jewish Recipes");
					activityCourse.putExtra("bt2_submeal", "Soul Food Recipes");
					activityCourse.putExtra("bt3_submeal", "Tex-Mex Recipes");
					activityCourse.putExtra("bt4_submeal", "Southren Recipes");
					activityCourse.putExtra("bt5_submeal",
							"Cajun and Creole Recipes");
					activityCourse.putExtra("bt6_submeal", "none");
					activityCourse.putExtra("bt7_submeal", "none");
					activityCourse.putExtra("bt8_submeal", "none");
					activityCourse.putExtra("bt9_submeal", "none");
					activityCourse.putExtra("bt10_submeal", "none");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal",
							"Occasions and Cooking Style");
					activityCourse.putExtra("cookbook_MainLanding",
							"Occasions and Cooking Style");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				}

			}
		});
		bt7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if (cookbook_mainLanding.equals("Meals")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "none");
					activityCourse.putExtra("bt2_submeal", "none");
					activityCourse.putExtra("bt3_submeal", "none");
					activityCourse.putExtra("bt4_submeal", "none");
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
					activityCourse.putExtra("cookbook_SubMeal", "Meals");
					activityCourse.putExtra("cookbook_MainLanding", "Meals");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Courses")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal",
							"Appleasauce Recipes");
					activityCourse.putExtra("bt2_submeal", "Bean and Pea");
					activityCourse.putExtra("bt3_submeal", "Dumplings");
					activityCourse.putExtra("bt4_submeal", "Fries");
					activityCourse.putExtra("bt5_submeal", "Grain Side Dishes");
					activityCourse.putExtra("bt6_submeal", "Polenta Recipe");
					activityCourse.putExtra("bt7_submeal", "Rice");
					activityCourse.putExtra("bt8_submeal",
							"Sauces and Condiments");
					activityCourse.putExtra("bt9_submeal",
							"Stuffing and Dressings");
					activityCourse.putExtra("bt10_submeal",
							"Vegetable Side Dishes");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal", "Courses");
					activityCourse.putExtra("cookbook_MainLanding", "Courses");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Main Ingredients")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "none");
					activityCourse.putExtra("bt2_submeal", "none");
					activityCourse.putExtra("bt3_submeal", "none");
					activityCourse.putExtra("bt4_submeal", "none");
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
					activityCourse.putExtra("cookbook_SubMeal",
							"Main Ingredients");
					activityCourse.putExtra("cookbook_MainLanding",
							"Main Ingredients");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding
						.equals("Occasions and Cooking Style")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "Asian Recipes");
					activityCourse
							.putExtra("bt2_submeal", "Australian Recipes");
					activityCourse.putExtra("bt3_submeal", "Chinese Recipes");
					activityCourse.putExtra("bt4_submeal", "French Recipes");
					activityCourse.putExtra("bt5_submeal", "Italian Recipes");
					activityCourse.putExtra("bt6_submeal",
							"Latin American Recipes");
					activityCourse.putExtra("bt7_submeal", "Mexican Recipes");
					activityCourse.putExtra("bt8_submeal", "none");
					activityCourse.putExtra("bt9_submeal", "none");
					activityCourse.putExtra("bt10_submeal", "none");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal",
							"Occasions and Cooking Style");
					activityCourse.putExtra("cookbook_MainLanding",
							"Occasions and Cooking Style");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				}

			}
		});
		bt8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if (cookbook_mainLanding.equals("Meals")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "none");
					activityCourse.putExtra("bt2_submeal", "none");
					activityCourse.putExtra("bt3_submeal", "none");
					activityCourse.putExtra("bt4_submeal", "none");
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
					activityCourse.putExtra("cookbook_SubMeal", "Meals");
					activityCourse.putExtra("cookbook_MainLanding", "Meals");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Courses")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "Bisque");
					activityCourse.putExtra("bt2_submeal", "Broth and Stock");
					activityCourse.putExtra("bt3_submeal", "Chili");
					activityCourse.putExtra("bt4_submeal", "Chowder");
					activityCourse.putExtra("bt5_submeal", "Soups");
					activityCourse.putExtra("bt6_submeal", "Stew");
					activityCourse.putExtra("bt7_submeal", "none");
					activityCourse.putExtra("bt8_submeal", "none");
					activityCourse.putExtra("bt9_submeal", "none");
					activityCourse.putExtra("bt10_submeal", "none");
					activityCourse.putExtra("bt11_submeal", "none");
					activityCourse.putExtra("bt12_submeal", "none");
					activityCourse.putExtra("bt13_submeal", "none");
					activityCourse.putExtra("bt14_submeal", "none");
					activityCourse.putExtra("cookbook_SubMeal", "Courses");
					activityCourse.putExtra("cookbook_MainLanding", "Courses");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding.equals("Main Ingredients")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "none");
					activityCourse.putExtra("bt2_submeal", "none");
					activityCourse.putExtra("bt3_submeal", "none");
					activityCourse.putExtra("bt4_submeal", "none");
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
					activityCourse.putExtra("cookbook_SubMeal",
							"Main Ingredients");
					activityCourse.putExtra("cookbook_MainLanding",
							"Main Ingredients");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				} else if (cookbook_mainLanding
						.equals("Occasions and Cooking Style")) {
					Intent activityCourse = new Intent(Sub_Meal_Page.this,
							Sub_Menu_Page.class);
					// 2. put key/value data
					activityCourse.putExtra("bt1_submeal", "none");
					activityCourse.putExtra("bt2_submeal", "none");
					activityCourse.putExtra("bt3_submeal", "none");
					activityCourse.putExtra("bt4_submeal", "none");
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
					activityCourse.putExtra("cookbook_SubMeal",
							"Occasions and Cooking Style");
					activityCourse.putExtra("cookbook_MainLanding",
							"Occasions and Cooking Style");
					// 3. or you can add data to a bundle
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityCourse.putExtras(extras);
					Sub_Meal_Page.this.startActivity(activityCourse);
					finish();
				}

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
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		if (id == R.id.action_contactus) {
			Intent i = new Intent(Sub_Meal_Page.this, ContactUs.class);
			startActivity(i);
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
