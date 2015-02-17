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

public class Sub_Menu_Page extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub__menu__page);

		// Declaring
		final Button bt1_submeal = (Button) findViewById(R.id.btnmenu1);
		final Button bt2_submeal = (Button) findViewById(R.id.btnmenu2);
		final Button bt3_submeal = (Button) findViewById(R.id.btnmenu3);
		final Button bt4_submeal = (Button) findViewById(R.id.btnmenu4);
		final Button bt5_submeal = (Button) findViewById(R.id.btnmenu5);
		final Button bt6_submeal = (Button) findViewById(R.id.btnmenu6);
		final Button bt7_submeal = (Button) findViewById(R.id.btnmenu7);
		final Button bt8_submeal = (Button) findViewById(R.id.btnmenu8);
		final Button bt9_submeal = (Button) findViewById(R.id.btnmenu9);
		final Button bt10_submeal = (Button) findViewById(R.id.btnmenu10);
		final Button bt11_submeal = (Button) findViewById(R.id.btnmenu11);
		final Button bt12_submeal = (Button) findViewById(R.id.btnmenu12);
		final Button bt13_submeal = (Button) findViewById(R.id.btnmenu13);
		final Button bt14_submeal = (Button) findViewById(R.id.btnmenu14);
		final ImageView imgSubMenu = (ImageView) findViewById(R.id.imageViewSubMenu);

		// Logo image for this page (will be same for all menus)
		Firebase fImageSubMenuPage = new Firebase(
				"https://cookbook-teammatharu.firebaseio.com/ImageSubMenuPage");
		fImageSubMenuPage.addValueEventListener(new ValueEventListener() {

			@Override
			public void onDataChange(DataSnapshot arg0) {
				// TODO Auto-generated method stub
				String tempImage = (String) arg0.getValue();
				// Logo image for this page (will be same for all menus)
				UrlImageViewHelper.setUrlDrawable(imgSubMenu, tempImage);
			}

			@Override
			public void onCancelled(FirebaseError arg0) {
				// TODO Auto-generated method stub

			}
		});

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
		final String cookbook_subMeal = intent
				.getStringExtra("cookbook_SubMeal");

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

		bt1_submeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_subMeal.equals("Meals")) {
					if (bt1_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal.equals("Courses")) {
					if (bt1_submeal.getText().toString()
							.equals("Antipasto Recipes")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data
						activityCourse.putExtra("list1_submenu", "Boniet");
						activityCourse.putExtra("list2_submenu",
								"Antipasto Platter");
						activityCourse.putExtra("list3_submenu",
								"Eggplant Antipasto");
						activityCourse.putExtra("list4_submenu",
								"Antipasto Squares");
						activityCourse.putExtra("list5_submenu",
								"Prosciutto Wrapped Melon Balls");
						activityCourse.putExtra("list6_submenu",
								"Cherry Pepper Poppers");
						activityCourse.putExtra("list7_submenu", "Olive Balls");
						activityCourse.putExtra("list8_submenu",
								"Cucumber and Ham Antipasto");
						activityCourse.putExtra("list9_submenu",
								"Fresh Sardines Naples Style");
						activityCourse.putExtra("list10_submenu",
								"Antipasto Salad Platter");
						activityCourse.putExtra("list11_submenu",
								"Italian Tuna Spread");
						activityCourse.putExtra("list12_submenu",
								"Baked Eggplant Antipasto");
						activityCourse.putExtra("list13_submenu", "none");
						activityCourse.putExtra("list14_submenu", "none");
						activityCourse.putExtra("list15_submenu", "none");
						activityCourse.putExtra("list16_submenu", "none");
						activityCourse.putExtra("list17_submenu", "none");
						activityCourse.putExtra("list18_submenu", "none");
						activityCourse.putExtra("list19_submenu", "none");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					}

				} else if (cookbook_subMeal.equals("Main Ingredients")) {
					if (bt1_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal
						.equals("Occasions and Cooking Style")) {
					if (bt1_submeal.getText().toString().equals("")) {

					}
				}

			}
		});

		bt2_submeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_subMeal.equals("Meals")) {
					if (bt2_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal.equals("Courses")) {
					if (bt2_submeal.getText().toString()
							.equals("Bread and Pastry Appetizer")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data
						activityCourse.putExtra("list1_submenu",
								"Double Tomato Bruschetta");
						activityCourse.putExtra("list2_submenu",
								"Chicken and Broccoli Braid");
						activityCourse.putExtra("list3_submenu",
								"Toasted Garlic Bread");
						activityCourse.putExtra("list4_submenu",
								"Creamy Dill Cucumber Toasties");
						activityCourse.putExtra("list5_submenu",
								"Balsamic Bruschetta");
						activityCourse.putExtra("list6_submenu",
								"Roasted Garlic Bread");
						activityCourse.putExtra("list7_submenu",
								"Garlic Bread Fantastique");
						activityCourse.putExtra("list8_submenu",
								"Artichoke Bruschetta");
						activityCourse.putExtra("list9_submenu",
								"Broccoli Chicken Roli");
						activityCourse.putExtra("list10_submenu",
								"Feta Cheese Foldovers");
						activityCourse.putExtra("list11_submenu",
								"Brie Cheese Appetizer");
						activityCourse.putExtra("list12_submenu",
								"Parmesan Garlic Bread");
						activityCourse.putExtra("list13_submenu",
								"Bread Machine Garlic Bread");
						activityCourse.putExtra("list14_submenu",
								"King Crab Appetizers");
						activityCourse.putExtra("list15_submenu",
								"Beef Samosas");
						activityCourse.putExtra("list16_submenu",
								"Jalapeno Popper Wontons");
						activityCourse.putExtra("list17_submenu",
								"Jalapeno Popper Cups");
						activityCourse.putExtra("list18_submenu",
								"Bacon Cheese Puffs");
						activityCourse.putExtra("list19_submenu",
								"Zucchini Cheese Garlic Appetizer");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					}
				} else if (cookbook_subMeal.equals("Main Ingredients")) {
					if (bt2_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal
						.equals("Occasions and Cooking Style")) {
					if (bt2_submeal.getText().toString().equals("")) {

					}
				}
			}
		});

		bt3_submeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_subMeal.equals("Meals")) {
					if (bt3_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal.equals("Courses")) {
					if (bt3_submeal.getText().toString()
							.equals("Cheese Appetizers")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data
						activityCourse.putExtra("list1_submenu",
								"Jalapeno Popper Spread");
						activityCourse.putExtra("list2_submenu",
								"Double Tomato Bruschetta");
						activityCourse.putExtra("list3_submenu",
								"Seven Layer Taco Dip");
						activityCourse.putExtra("list4_submenu",
								"Southwestern Egg Rolls");
						activityCourse.putExtra("list5_submenu",
								"Grilled Bacon Jalapeno Wraps");
						activityCourse.putExtra("list6_submenu",
								"Chocolate Chip Cheese Ball");
						activityCourse.putExtra("list7_submenu",
								"Bacon Cheddar Deviled Eggs");
						activityCourse.putExtra("list8_submenu",
								"Florentine Artichoke Dip");
						activityCourse.putExtra("list9_submenu",
								"Spinach Brownies");
						activityCourse.putExtra("list10_submenu",
								"Bacon and Tomato Cups");
						activityCourse.putExtra("list11_submenu",
								"Best Ever Jalapeno Poppers");
						activityCourse.putExtra("list12_submenu",
								"Amy's Cilantro Cream Sauce");
						activityCourse.putExtra("list13_submenu",
								"Party Pinwheels");
						activityCourse.putExtra("list14_submenu",
								"Chicken and Broccoli Braid");
						activityCourse.putExtra("list15_submenu",
								"Cream Cheese Penguins");
						activityCourse.putExtra("list16_submenu", "none");
						activityCourse.putExtra("list17_submenu", "none");
						activityCourse.putExtra("list18_submenu", "none");
						activityCourse.putExtra("list19_submenu", "none");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					}
				} else if (cookbook_subMeal.equals("Main Ingredients")) {
					if (bt3_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal
						.equals("Occasions and Cooking Style")) {
					if (bt3_submeal.getText().toString().equals("")) {

					}
				}
			}
		});

		bt4_submeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_subMeal.equals("Meals")) {
					if (bt4_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal.equals("Courses")) {
					if (bt4_submeal.getText().toString().equals("Crackers")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Ranch Oyster Crackers");
						activityCourse.putExtra("list2_submenu",
								"Wheat Crackers");
						activityCourse.putExtra("list3_submenu",
								"Alabama Fire Crackers");
						activityCourse.putExtra("list4_submenu",
								"Ranch Style Oyster Crackers");
						activityCourse.putExtra("list5_submenu",
								"Bacon Crackers");
						activityCourse.putExtra("list6_submenu",
								"Crackers a la Yvette");
						activityCourse.putExtra("list7_submenu",
								"Seasoned Crackers");
						activityCourse.putExtra("list8_submenu",
								"Cheddar Pennies");
						activityCourse.putExtra("list9_submenu",
								"Cheddar Crackers");
						activityCourse.putExtra("list10_submenu",
								"Seasoned Oyster Crackers");
						activityCourse.putExtra("list11_submenu",
								"Cheddar Pecan Wafers");
						activityCourse.putExtra("list12_submenu",
								"Cheese Crackers");
						activityCourse.putExtra("list13_submenu",
								"Firecracker Crackers");
						activityCourse.putExtra("list14_submenu",
								"Herb Oyster Crackers");
						activityCourse.putExtra("list15_submenu", "none");
						activityCourse.putExtra("list16_submenu", "none");
						activityCourse.putExtra("list17_submenu", "none");
						activityCourse.putExtra("list18_submenu", "none");
						activityCourse.putExtra("list19_submenu", "none");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					}
				} else if (cookbook_subMeal.equals("Main Ingredients")) {
					if (bt4_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal
						.equals("Occasions and Cooking Style")) {
					if (bt4_submeal.getText().toString().equals("")) {

					}
				}
			}
		});

		bt5_submeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_subMeal.equals("Meals")) {
					if (bt5_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal.equals("Courses")) {
					if (bt5_submeal.getText().toString().equals("Deviled Eggs")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Bacon Cheddar Deviled Eggs");
						activityCourse.putExtra("list2_submenu",
								"Di's Delicious Deluxe Deviled Eggs");
						activityCourse.putExtra("list3_submenu",
								"Special Deviled Eggs");
						activityCourse.putExtra("list4_submenu",
								"Cajun Deviled Eggs");
						activityCourse.putExtra("list5_submenu",
								"Bacon-Balsamic Deviled Eggs");
						activityCourse.putExtra("list6_submenu",
								"Halloween Eye of Newt");
						activityCourse.putExtra("list7_submenu",
								"Creamy Deviled Eggs");
						activityCourse.putExtra("list8_submenu",
								"Simple Deviled Eggs");
						activityCourse.putExtra("list9_submenu",
								"Perfect Deviled Eggs");
						activityCourse.putExtra("list10_submenu",
								"Spicy Deviled Eggs");
						activityCourse.putExtra("list11_submenu",
								"Guacamole Deviled Eggs");
						activityCourse.putExtra("list12_submenu",
								"Potato Salad Deviled Eggs");
						activityCourse.putExtra("list13_submenu",
								"Shrimp and Dill Deviled Eggs");
						activityCourse.putExtra("list14_submenu", "none");
						activityCourse.putExtra("list15_submenu", "none");
						activityCourse.putExtra("list16_submenu", "none");
						activityCourse.putExtra("list17_submenu", "none");
						activityCourse.putExtra("list18_submenu", "none");
						activityCourse.putExtra("list19_submenu", "none");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					}
				} else if (cookbook_subMeal.equals("Main Ingredients")) {
					if (bt5_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal
						.equals("Occasions and Cooking Style")) {
					if (bt5_submeal.getText().toString().equals("")) {

					}
				}
			}
		});

		bt6_submeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_subMeal.equals("Meals")) {
					if (bt6_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal.equals("Courses")) {
					if (bt6_submeal.getText().toString()
							.equals("Dill Pickle and Sweet Pickles")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Microwave Bread and Butter Pickles");
						activityCourse.putExtra("list2_submenu",
								"Spicy Refrigerator Dill Pickles");
						activityCourse.putExtra("list3_submenu",
								"Refrigerator Pickles");
						activityCourse.putExtra("list4_submenu",
								"Deb's Bread and Butter Pickles");
						activityCourse.putExtra("list5_submenu",
								"Mustard Pickles");
						activityCourse.putExtra("list6_submenu",
								"Bill's Spicy Refrigerator Pickles");
						activityCourse.putExtra("list7_submenu", "none");
						activityCourse.putExtra("list8_submenu", "none");
						activityCourse.putExtra("list9_submenu", "none");
						activityCourse.putExtra("list10_submenu", "none");
						activityCourse.putExtra("list11_submenu", "none");
						activityCourse.putExtra("list12_submenu", "none");
						activityCourse.putExtra("list13_submenu", "none");
						activityCourse.putExtra("list14_submenu", "none");
						activityCourse.putExtra("list15_submenu", "none");
						activityCourse.putExtra("list16_submenu", "none");
						activityCourse.putExtra("list17_submenu", "none");
						activityCourse.putExtra("list18_submenu", "none");
						activityCourse.putExtra("list19_submenu", "none");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					}
				} else if (cookbook_subMeal.equals("Main Ingredients")) {
					if (bt6_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal
						.equals("Occasions and Cooking Style")) {
					if (bt6_submeal.getText().toString().equals("")) {

					}
				}
			}
		});

		bt7_submeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_subMeal.equals("Meals")) {
					if (bt7_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal.equals("Courses")) {
					if (bt7_submeal.getText().toString()
							.equals("Dips and Spreads")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu", "Guacamole");
						activityCourse.putExtra("list2_submenu",
								"Buffalo Chicken Dip");
						activityCourse.putExtra("list3_submenu",
								"Jalapeno Popper Spread");
						activityCourse.putExtra("list4_submenu",
								"Spicy Bean Salsa");
						activityCourse.putExtra("list5_submenu",
								"Best Spinach Dip Ever");
						activityCourse.putExtra("list6_submenu",
								"Florentine Artichoke Dip");
						activityCourse.putExtra("list7_submenu",
								"Pumpkin Fluff Dip");
						activityCourse.putExtra("list8_submenu", "Real Hummus");
						activityCourse.putExtra("list9_submenu",
								"Amy's Cilantro Cream Sauce");
						activityCourse.putExtra("list10_submenu", "BLT Dip");
						activityCourse.putExtra("list11_submenu",
								"Avocado Feta Salsa");
						activityCourse.putExtra("list12_submenu",
								"Easy Guacamole");
						activityCourse.putExtra("list13_submenu",
								"Chicken Wing Di");
						activityCourse.putExtra("list14_submenu",
								"Best Guacamole");
						activityCourse.putExtra("list15_submenu", "none");
						activityCourse.putExtra("list16_submenu", "none");
						activityCourse.putExtra("list17_submenu", "none");
						activityCourse.putExtra("list18_submenu", "none");
						activityCourse.putExtra("list19_submenu", "none");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					}
				} else if (cookbook_subMeal.equals("Main Ingredients")) {
					if (bt7_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal
						.equals("Occasions and Cooking Style")) {
					if (bt7_submeal.getText().toString().equals("")) {

					}
				}
			}
		});

		bt8_submeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_subMeal.equals("Meals")) {
					if (bt8_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal.equals("Courses")) {
					if (bt8_submeal.getText().toString()
							.equals("Fruit Appetizers")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Frosted Grapes");
						activityCourse.putExtra("list2_submenu",
								"Apple Goat Cheese Bruschetta");
						activityCourse.putExtra("list3_submenu", "Apple Toast");
						activityCourse.putExtra("list4_submenu",
								"Sausage Applesauce Appetizer");
						activityCourse.putExtra("list5_submenu",
								"Strawberry Goat Cheese Bruschetta");
						activityCourse.putExtra("list6_submenu",
								"Bacon Wrapped Pineapple");
						activityCourse.putExtra("list7_submenu",
								"Strawberry Pineapple Chicken Bites");
						activityCourse.putExtra("list8_submenu",
								"Figs Oozing with Goat Cheese");
						activityCourse.putExtra("list9_submenu",
								"Ginger Orange Glazed Chicken Wings");
						activityCourse
								.putExtra("list10_submenu", "Apple Chips");
						activityCourse.putExtra("list11_submenu",
								"Strawberry Bruschetta");
						activityCourse.putExtra("list12_submenu",
								"Cranberry Meatballs");
						activityCourse.putExtra("list13_submenu", "none");
						activityCourse.putExtra("list14_submenu", "none");
						activityCourse.putExtra("list15_submenu", "none");
						activityCourse.putExtra("list16_submenu", "none");
						activityCourse.putExtra("list17_submenu", "none");
						activityCourse.putExtra("list18_submenu", "none");
						activityCourse.putExtra("list19_submenu", "none");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					}
				} else if (cookbook_subMeal.equals("Main Ingredients")) {
					if (bt8_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal
						.equals("Occasions and Cooking Style")) {
					if (bt8_submeal.getText().toString().equals("")) {

					}
				}
			}
		});

		bt9_submeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_subMeal.equals("Meals")) {
					if (bt9_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal.equals("Courses")) {
					if (bt9_submeal.getText().toString()
							.equals("Mushroom Appetizers")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Gary's Stuffed Mushrooms");
						activityCourse.putExtra("list2_submenu",
								"Savory Crab Stuffed Mushrooms");
						activityCourse.putExtra("list3_submenu",
								"Grilled Portobello Mushrooms");
						activityCourse.putExtra("list4_submenu",
								"Dinah's Stuffed Mushrooms");
						activityCourse.putExtra("list5_submenu",
								"Crab Stuffed Mushrooms");
						activityCourse
								.putExtra("list6_submenu", "Shrimpcargot");
						activityCourse.putExtra("list7_submenu",
								"Artichoke Stuffed Mushrooms");
						activityCourse.putExtra("list8_submenu",
								"Jalapeno Popper Mushrooms");
						activityCourse.putExtra("list9_submenu",
								"Balsamic Mushrooms");
						activityCourse.putExtra("list10_submenu",
								"Renaissance Stuffed Mushrooms");
						activityCourse.putExtra("list11_submenu",
								"Blue Bacon Stuffed Mushrooms");
						activityCourse.putExtra("list12_submenu", "none");
						activityCourse.putExtra("list13_submenu", "none");
						activityCourse.putExtra("list14_submenu", "none");
						activityCourse.putExtra("list15_submenu", "none");
						activityCourse.putExtra("list16_submenu", "none");
						activityCourse.putExtra("list17_submenu", "none");
						activityCourse.putExtra("list18_submenu", "none");
						activityCourse.putExtra("list19_submenu", "none");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					}
				} else if (cookbook_subMeal.equals("Main Ingredients")) {
					if (bt9_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal
						.equals("Occasions and Cooking Style")) {
					if (bt9_submeal.getText().toString().equals("")) {

					}
				}
			}
		});

		bt10_submeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_subMeal.equals("Meals")) {
					if (bt10_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal.equals("Courses")) {
					if (bt10_submeal.getText().toString()
							.equals("Olive Appetizers")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Baked Cheese Olives");
						activityCourse.putExtra("list2_submenu",
								"Fig and Olive Tapenade");
						activityCourse.putExtra("list3_submenu",
								"Olive Cheese Melts");
						activityCourse.putExtra("list4_submenu",
								"Olive Pecan Spread");
						activityCourse.putExtra("list5_submenu",
								"Cheddar and Olive Balls");
						activityCourse.putExtra("list6_submenu",
								"Greek Feta And Olive Spread");
						activityCourse.putExtra("list7_submenu",
								"Garlic Parmesan Olives");
						activityCourse.putExtra("list8_submenu",
								"Cucumber and Olive Appetizers");
						activityCourse.putExtra("list9_submenu",
								"Stuffed Olives");
						activityCourse.putExtra("list10_submenu",
								"Olive and Blue Cheese Ball");
						activityCourse.putExtra("list11_submenu", "none");
						activityCourse.putExtra("list12_submenu", "none");
						activityCourse.putExtra("list13_submenu", "none");
						activityCourse.putExtra("list14_submenu", "none");
						activityCourse.putExtra("list15_submenu", "none");
						activityCourse.putExtra("list16_submenu", "none");
						activityCourse.putExtra("list17_submenu", "none");
						activityCourse.putExtra("list18_submenu", "none");
						activityCourse.putExtra("list19_submenu", "none");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					}
				} else if (cookbook_subMeal.equals("Main Ingredients")) {
					if (bt10_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal
						.equals("Occasions and Cooking Style")) {
					if (bt10_submeal.getText().toString().equals("")) {

					}
				}
			}
		});

		bt11_submeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_subMeal.equals("Meals")) {
					if (bt11_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal.equals("Courses")) {
					if (bt11_submeal.getText().toString()
							.equals("Pasta Appetizers")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Amazing Crab Shells");
						activityCourse.putExtra("list2_submenu",
								"Antipasto Pasta Salad");
						activityCourse.putExtra("list3_submenu",
								"Black Bean and Couscous Salad");
						activityCourse.putExtra("list4_submenu",
								"Amish Macaroni Salad");
						activityCourse.putExtra("list5_submenu",
								"Broccoli and Tortellini Salad");
						activityCourse.putExtra("list6_submenu",
								"Garden Pasta Salad");
						activityCourse.putExtra("list7_submenu",
								"BLT Pasta Salad");
						activityCourse.putExtra("list8_submenu",
								"Southwestern Pasta Salad");
						activityCourse.putExtra("list9_submenu",
								"Awesome Pasta Salad");
						activityCourse.putExtra("list10_submenu",
								"Tortellini Bites");
						activityCourse.putExtra("list11_submenu",
								"Cinnamon Snack Mix");
						activityCourse.putExtra("list12_submenu", "none");
						activityCourse.putExtra("list13_submenu", "none");
						activityCourse.putExtra("list14_submenu", "none");
						activityCourse.putExtra("list15_submenu", "none");
						activityCourse.putExtra("list16_submenu", "none");
						activityCourse.putExtra("list17_submenu", "none");
						activityCourse.putExtra("list18_submenu", "none");
						activityCourse.putExtra("list19_submenu", "none");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					}
				} else if (cookbook_subMeal.equals("Main Ingredients")) {
					if (bt11_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal
						.equals("Occasions and Cooking Style")) {
					if (bt11_submeal.getText().toString().equals("")) {

					}
				}
			}
		});

		bt12_submeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_subMeal.equals("Meals")) {
					if (bt12_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal.equals("Courses")) {
					if (bt12_submeal.getText().toString()
							.equals("Pastry Appetizers")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu", "Baklava");
						activityCourse.putExtra("list2_submenu", "Cream Puffs");
						activityCourse.putExtra("list3_submenu",
								"Sweet Dinner Rolls");
						activityCourse.putExtra("list4_submenu", "Churros");
						activityCourse.putExtra("list5_submenu",
								"Cinnamon Rolls");
						activityCourse.putExtra("list6_submenu",
								"Danish Kringle");
						activityCourse.putExtra("list7_submenu",
								"Blueberry Turnovers");
						activityCourse.putExtra("list8_submenu",
								"Land of Nod Cinnamon Buns");
						activityCourse.putExtra("list9_submenu",
								"Easy Apple Strudel");
						activityCourse.putExtra("list10_submenu", "none");
						activityCourse.putExtra("list11_submenu", "none");
						activityCourse.putExtra("list12_submenu", "none");
						activityCourse.putExtra("list13_submenu", "none");
						activityCourse.putExtra("list14_submenu", "none");
						activityCourse.putExtra("list15_submenu", "none");
						activityCourse.putExtra("list16_submenu", "none");
						activityCourse.putExtra("list17_submenu", "none");
						activityCourse.putExtra("list18_submenu", "none");
						activityCourse.putExtra("list19_submenu", "none");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					}
				} else if (cookbook_subMeal.equals("Main Ingredients")) {
					if (bt12_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal
						.equals("Occasions and Cooking Style")) {
					if (bt12_submeal.getText().toString().equals("")) {

					}
				}
			}
		});

		bt13_submeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_subMeal.equals("Meals")) {
					if (bt13_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal.equals("Courses")) {
					if (bt13_submeal.getText().toString()
							.equals("Seafood Appetizers")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Barbie's Tuna Salad");
						activityCourse.putExtra("list2_submenu",
								"Tuna Fish Salad");
						activityCourse.putExtra("list3_submenu",
								"Seafood Pasta Salad");
						activityCourse.putExtra("list4_submenu",
								"Shrimply Delicious Shrimp Salad");
						activityCourse.putExtra("list5_submenu",
								"Cold Tuna Macaroni Salad");
						activityCourse.putExtra("list6_submenu",
								"Zesty Tuna Salad");
						activityCourse.putExtra("list7_submenu",
								"California Roll Salad");
						activityCourse
								.putExtra("list8_submenu", "Crab Ceviche");
						activityCourse.putExtra("list9_submenu", "Crab Salad");
						activityCourse.putExtra("list10_submenu",
								"Thai Noodle Salad");
						activityCourse.putExtra("list11_submenu",
								"Shrimp Couscous Salad");
						activityCourse.putExtra("list12_submenu",
								"Tuna Salad With Fresh Dill");
						activityCourse.putExtra("list13_submenu",
								"Avocado and Tuna Tapas");
						activityCourse.putExtra("list14_submenu",
								"Grilled Shrimp Scampi");
						activityCourse.putExtra("list15_submenu",
								"Savory Crab Stuffed");
						activityCourse.putExtra("list16_submenu",
								"Mexican Shrimp Cocktail");
						activityCourse.putExtra("list17_submenu",
								"Bacon Wrapped Barbeque Shrimp");
						activityCourse.putExtra("list18_submenu",
								"Shrimpcargot");
						activityCourse.putExtra("list19_submenu",
								"King Crab Appetizers");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					}
				} else if (cookbook_subMeal.equals("Main Ingredients")) {
					if (bt13_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal
						.equals("Occasions and Cooking Style")) {
					if (bt13_submeal.getText().toString().equals("")) {

					}
				}
			}
		});

		bt14_submeal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (cookbook_subMeal.equals("Meals")) {
					if (bt14_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal.equals("Courses")) {
					if (bt14_submeal.getText().toString()
							.equals("Spicy Appetizers")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu", "Jalapeno Popper Spread");
						activityCourse.putExtra("list2_submenu", "Buffalo Chicken Dip");
						activityCourse.putExtra("list3_submenu", "Spicy Bean Salsa");
						activityCourse.putExtra("list4_submenu", "Baked Buffalo Wings");
						activityCourse.putExtra("list5_submenu", "Avocado, Tomato and Mango Salsa");
						activityCourse.putExtra("list6_submenu", "Southwestern Egg Rolls");
						activityCourse.putExtra("list7_submenu", "Chicken Flautas");
						activityCourse.putExtra("list8_submenu", "Mahogany Chicken Wings");
						activityCourse.putExtra("list9_submenu", "Sausage Stuffed Jalapenos");
						activityCourse.putExtra("list10_submenu", "none");
						activityCourse.putExtra("list11_submenu", "none");
						activityCourse.putExtra("list12_submenu", "none");
						activityCourse.putExtra("list13_submenu", "none");
						activityCourse.putExtra("list14_submenu", "none");
						activityCourse.putExtra("list15_submenu", "none");
						activityCourse.putExtra("list16_submenu", "none");
						activityCourse.putExtra("list17_submenu", "none");
						activityCourse.putExtra("list18_submenu", "none");
						activityCourse.putExtra("list19_submenu", "none");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					}
				} else if (cookbook_subMeal.equals("Main Ingredients")) {
					if (bt14_submeal.getText().toString().equals("")) {

					}
				} else if (cookbook_subMeal
						.equals("Occasions and Cooking Style")) {
					if (bt14_submeal.getText().toString().equals("")) {

					}
				}
			}
		});
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
