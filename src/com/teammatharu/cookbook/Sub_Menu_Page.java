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
					} else if (bt1_submeal.getText().toString()
							.equals("Pastries")) {
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
						activityCourse.putExtra("list10_submenu", "Cannoli");
						activityCourse.putExtra("list11_submenu",
								"Chocolate Babka");
						activityCourse.putExtra("list12_submenu",
								"Sophie's Kolacky");
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
					} else if (bt1_submeal.getText().toString()
							.equals("Cake Recipes")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Double Layer Pumpkin Cheesecake");
						activityCourse.putExtra("list2_submenu", "Cake Balls");
						activityCourse.putExtra("list3_submenu",
								"Extreme Chocolate Cake");
						activityCourse.putExtra("list4_submenu",
								"Black Magic Cake");
						activityCourse.putExtra("list5_submenu",
								"Sam's Famous Carrot Cake");
						activityCourse.putExtra("list6_submenu",
								"Tiramisu Layer Cake");
						activityCourse.putExtra("list7_submenu",
								"Satiny Chocolate Glaze");
						activityCourse.putExtra("list8_submenu",
								"Special Buttercream Frosting");
						activityCourse.putExtra("list9_submenu",
								"Red Velvet Cupcakes");
						activityCourse.putExtra("list10_submenu",
								"Granny Kat's Pumpkin Roll");
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
					} else if (bt1_submeal.getText().toString().equals("Beer")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Beer Margaritas");
						activityCourse.putExtra("list2_submenu",
								"Yummy Margaritas");
						activityCourse.putExtra("list3_submenu",
								"JoeDogg's Spicy Red Beer");
						activityCourse.putExtra("list4_submenu",
								"Granny Smackers");
						activityCourse.putExtra("list5_submenu",
								"Black and Tan");
						activityCourse.putExtra("list6_submenu", "Michelada");
						activityCourse.putExtra("list7_submenu", "Shandy");
						activityCourse.putExtra("list8_submenu",
								"Delicious Spicy Micheladas");
						activityCourse.putExtra("list9_submenu",
								"Nova Scotia Beer Warmer");
						activityCourse.putExtra("list10_submenu",
								"The Red-Headed Step Child");
						activityCourse.putExtra("list11_submenu",
								"Pompous Mexican");
						activityCourse.putExtra("list12_submenu",
								"Strawberry Beer Margaritas");
						activityCourse.putExtra("list13_submenu",
								"Fall Apple Pumpkin Shandy");
						activityCourse.putExtra("list14_submenu",
								"Half and Half Cocktail");
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
					} else if (bt2_submeal.getText().toString()
							.equals("Pizza Dough and Crusts")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Jay's Signature Pizza Crust");
						activityCourse.putExtra("list2_submenu",
								"Amazing Whole Wheat Pizza Crust");
						activityCourse.putExtra("list3_submenu",
								"Bread Machine Pizza Dough");
						activityCourse.putExtra("list4_submenu",
								"Whole Wheat and Honey Pizza Dough");
						activityCourse.putExtra("list5_submenu",
								"New York Italian Pizza Dough");
						activityCourse.putExtra("list6_submenu",
								"Garlic Lover's Pizza Crust");
						activityCourse.putExtra("list7_submenu",
								"Cauliflower Pizza Crust");
						activityCourse.putExtra("list8_submenu",
								"Easy Homemade Pizza Dough");
						activityCourse.putExtra("list9_submenu",
								"Rice Crust for Pizza");
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
					} else if (bt2_submeal.getText().toString()
							.equals("Cookies")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Easy Sugar Cookies");
						activityCourse.putExtra("list2_submenu",
								"Big Soft Ginger Cookies");
						activityCourse.putExtra("list3_submenu",
								"The Best Rolled Sugar Cookies");
						activityCourse.putExtra("list4_submenu",
								"Best Brownies");
						activityCourse.putExtra("list5_submenu",
								"Peanut Butter Cup Cookies");
						activityCourse.putExtra("list6_submenu",
								"Iced Pumpkin Cookies");
						activityCourse.putExtra("list7_submenu",
								"Soft Oatmeal Cookies");
						activityCourse.putExtra("list8_submenu",
								"Zucchini Brownies");
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
					} else if (bt2_submeal.getText().toString()
							.equals("Cider Drinks")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data
						activityCourse.putExtra("list1_submenu",
								"Hot Spiced Cider");
						activityCourse.putExtra("list2_submenu",
								"Hot Apple Cider");
						activityCourse.putExtra("list3_submenu",
								"Hot Spiced Cranberry Cider");
						activityCourse.putExtra("list4_submenu",
								"Easy Apple Cider");
						activityCourse.putExtra("list5_submenu",
								"Apple Pie in a Jar Drink");
						activityCourse.putExtra("list6_submenu",
								"Homemade Apple Cider");
						activityCourse.putExtra("list7_submenu",
								"Hot Buttered Apple Cider");
						activityCourse.putExtra("list8_submenu",
								"Old Virginia Wassail Cider");
						activityCourse
								.putExtra("list9_submenu", "Mulled Cider");
						activityCourse.putExtra("list10_submenu",
								"Spiked Fall Cider");
						activityCourse.putExtra("list11_submenu",
								"Cranberry Wassail");
						activityCourse.putExtra("list12_submenu",
								"Mulled Cranberry Cider");
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
					} else if (bt3_submeal.getText().toString()
							.equals("Bagels")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Boiled Bagels");
						activityCourse.putExtra("list2_submenu",
								"Bread Machine Bagels");
						activityCourse.putExtra("list3_submenu",
								"Homemade Bagels");
						activityCourse.putExtra("list4_submenu",
								"Pumpernickel Bagels");
						activityCourse.putExtra("list5_submenu",
								"San Francisco Style Bagels");
						activityCourse.putExtra("list6_submenu", "none");
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
					} else if (bt3_submeal.getText().toString()
							.equals("Custards and Pudding")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Creamy Rice Pudding");
						activityCourse.putExtra("list2_submenu",
								"Chocolate Cornstarch Pudding");
						activityCourse.putExtra("list3_submenu",
								"Hasty Chocolate Pudding");
						activityCourse.putExtra("list4_submenu",
								"Uncooked Banana Pudding");
						activityCourse
								.putExtra("list5_submenu", "Spanish Flan");
						activityCourse.putExtra("list6_submenu",
								"Homemade Vanilla Pudding");
						activityCourse.putExtra("list7_submenu",
								"The Best Banana Pudding");
						activityCourse
								.putExtra("list8_submenu", "Creme Brulee");
						activityCourse.putExtra("list9_submenu", "Panna Cotta");
						activityCourse.putExtra("list10_submenu", "Baked Flan");
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
					} else if (bt3_submeal.getText().toString()
							.equals("Cocktails")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu", "Mojito");
						activityCourse.putExtra("list2_submenu",
								"Tanning Bed Drink");
						activityCourse.putExtra("list3_submenu",
								"Easy Frozen Margaritas");
						activityCourse.putExtra("list4_submenu",
								"Cranberry Martini");
						activityCourse.putExtra("list5_submenu",
								"Tainted Fruit Shots");
						activityCourse.putExtra("list6_submenu",
								"Dirty Martini");
						activityCourse.putExtra("list7_submenu", "Lava Lamps");
						activityCourse.putExtra("list8_submenu",
								"Bloody Mary Mix");
						activityCourse.putExtra("list9_submenu",
								"Whiskey Slush");
						activityCourse.putExtra("list10_submenu",
								"Strawberry Mojito");
						activityCourse.putExtra("list11_submenu",
								"Berry Shooters");
						activityCourse.putExtra("list12_submenu",
								"Frozen Mojito");
						activityCourse.putExtra("list13_submenu",
								"White Russian");
						activityCourse.putExtra("list14_submenu",
								"Malibu Bay Breeze");
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
					} else if (bt4_submeal.getText().toString()
							.equals("Yeast Bread")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Amish White Bread");
						activityCourse.putExtra("list2_submenu",
								"Russian Black Bread");
						activityCourse.putExtra("list3_submenu",
								"Simple Whole Wheat Bread");
						activityCourse.putExtra("list4_submenu",
								"Homemade Wonderful Bread");
						activityCourse.putExtra("list5_submenu",
								"Pepperoni Bread");
						activityCourse.putExtra("list6_submenu",
								"Italian Bread");
						activityCourse.putExtra("list7_submenu",
								"French Baguettes");
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
					} else if (bt4_submeal.getText().toString()
							.equals("Frozen Desserts")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Cinnamon Ice Cream");
						activityCourse.putExtra("list2_submenu",
								"Five Minute Ice Cream");
						activityCourse.putExtra("list3_submenu",
								"Cindy's Pumpkin Pie");
						activityCourse.putExtra("list4_submenu",
								"Very Chocolate Ice Cream");
						activityCourse.putExtra("list5_submenu",
								"Freezer Caramel Drizzle Pie");
						activityCourse.putExtra("list6_submenu",
								"Coconut Ice Cream");
						activityCourse.putExtra("list7_submenu",
								"Easy Ice Cream Cake");
						activityCourse.putExtra("list8_submenu",
								"Decadent Peanut Butter Pie");
						activityCourse.putExtra("list9_submenu",
								"Chocolate Velvet Ice Cream");
						activityCourse.putExtra("list10_submenu",
								"Peach Ice Cream");
						activityCourse.putExtra("list11_submenu",
								"Rocky Road Ice Cream");
						activityCourse.putExtra("list12_submenu",
								"Buster Bar Ice Cream Dessert");
						activityCourse.putExtra("list13_submenu",
								"Fried Ice Cream");
						activityCourse.putExtra("list14_submenu",
								"Strawberry Whipped Sensation");
						activityCourse.putExtra("list15_submenu",
								"Butter Pecan Ice Cream");
						activityCourse.putExtra("list16_submenu",
								"Balsamic Strawberries");
						activityCourse.putExtra("list17_submenu", "none");
						activityCourse.putExtra("list18_submenu", "none");
						activityCourse.putExtra("list19_submenu", "none");

						// 3. or you can add data to a bundle
						Bundle extras = new Bundle();
						// 4. add bundle to intent
						activityCourse.putExtras(extras);
						Sub_Menu_Page.this.startActivity(activityCourse);
						finish();
					} else if (bt4_submeal.getText().toString()
							.equals("Coffee")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data
						activityCourse
								.putExtra("list1_submenu", "Mocha Coffee");
						activityCourse.putExtra("list2_submenu",
								"Easy Iced Coffee");
						activityCourse.putExtra("list3_submenu",
								"Pumpkin Spiced Latte");
						activityCourse.putExtra("list4_submenu",
								"Iced Mocha Fusion Shake");
						activityCourse.putExtra("list5_submenu",
								"Gunline Coffee");
						activityCourse
								.putExtra("list6_submenu", "Coffee Shake");
						activityCourse.putExtra("list7_submenu",
								"Vietnamese Iced Coffee");
						activityCourse.putExtra("list8_submenu",
								"Cappuccino on Ice");
						activityCourse.putExtra("list9_submenu",
								"Hot Mocha Drink Mix");
						activityCourse.putExtra("list10_submenu",
								"Cocoa Coffee Milkshake");
						activityCourse.putExtra("list11_submenu",
								"Frozen Caramel Latte");
						activityCourse.putExtra("list12_submenu",
								"Coffee Whirl");
						activityCourse.putExtra("list13_submenu",
								"Eggnog Latte");
						activityCourse.putExtra("list14_submenu",
								"Irish Coffee");
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
					} else if (bt5_submeal.getText().toString()
							.equals("Fruits Desserts")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu", "Apple Crisp");
						activityCourse.putExtra("list2_submenu",
								"The Best Lemon Bars");
						activityCourse.putExtra("list3_submenu",
								"Easy Batter Fruit Cobbler");
						activityCourse.putExtra("list4_submenu",
								"Grandma Ople's Apple Pie");
						activityCourse.putExtra("list5_submenu",
								"Judy's Strawberry Pretzel Salad");
						activityCourse.putExtra("list6_submenu",
								"Easy Lemon Cookies");
						activityCourse.putExtra("list7_submenu",
								"Cranberry Pistachio Biscotti");
						activityCourse.putExtra("list8_submenu",
								"The Best Lemon Bars");
						activityCourse.putExtra("list9_submenu",
								"Blueberry Pie");
						activityCourse.putExtra("list10_submenu",
								"Bake Sale Lemon Bars");
						activityCourse.putExtra("list11_submenu",
								"Blueberry Buckle");
						activityCourse.putExtra("list12_submenu",
								"Apple Squares");
						activityCourse.putExtra("list13_submenu",
								"German Apple Cake");
						activityCourse.putExtra("list14_submenu",
								"Healthy Banana Cookies");
						activityCourse.putExtra("list15_submenu",
								"Rhubarb Strawberry Crunch");
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
					} else if (bt5_submeal.getText().toString()
							.equals("Hot Chocolates")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Creamy Hot Cocoa");
						activityCourse.putExtra("list2_submenu",
								"Snow Flake Cocoa");
						activityCourse.putExtra("list3_submenu",
								"Easy Mexican Hot Chocolate");
						activityCourse.putExtra("list4_submenu",
								"Candy Cane Cocoa");
						activityCourse.putExtra("list5_submenu",
								"Delicious Vegan Hot Chocolate");
						activityCourse.putExtra("list6_submenu",
								"Mocha Coffee Mix");
						activityCourse.putExtra("list7_submenu",
								"Peanut Buttercup Hot Chocolate");
						activityCourse.putExtra("list8_submenu",
								"Homestyle Hot Cocoa");
						activityCourse.putExtra("list9_submenu",
								"Spiced Hot Chocolate");
						activityCourse.putExtra("list10_submenu",
								"Mayan Hot Chocolate");
						activityCourse.putExtra("list11_submenu",
								"Mocha au Lait Mix");
						activityCourse.putExtra("list12_submenu",
								"Cocoa Sleigh Ride");
						activityCourse.putExtra("list13_submenu",
								"Whipped Hot Chocolate");
						activityCourse.putExtra("list14_submenu",
								"Kocoa Klastch Blend");
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
					} else if (bt6_submeal.getText().toString()
							.equals("Pie Recipes")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse.putExtra("list1_submenu",
								"Perfect Pumpkin Pie");
						activityCourse.putExtra("list2_submenu",
								"No Bake Peanut Butter Pie");
						activityCourse.putExtra("list3_submenu",
								"Grandma's Lemon Meringue Pie");
						activityCourse.putExtra("list4_submenu",
								"Basic Flaky Pie Crust");
						activityCourse.putExtra("list5_submenu",
								"Chocolate Eclair Dessert");
						activityCourse.putExtra("list6_submenu",
								"Blueberry Pie");
						activityCourse.putExtra("list7_submenu",
								"Butter Flaky Pie Crust");
						activityCourse.putExtra("list8_submenu",
								"Apple Crumble Pie");
						activityCourse.putExtra("list9_submenu",
								"Crustless Cranberry Pie");
						activityCourse.putExtra("list10_submenu",
								"Fresh Rhubarb Pie");
						activityCourse.putExtra("list11_submenu",
								"French Pastry Pie Crust");
						activityCourse.putExtra("list12_submenu",
								"Caramel Pecan Pie");
						activityCourse.putExtra("list13_submenu", "Peach Pie");
						activityCourse.putExtra("list14_submenu",
								"Creamy Blueberry Pie");
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
					} else if (bt6_submeal.getText().toString()
							.equals("Juices")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data
						activityCourse.putExtra("list1_submenu",
								"Healthy Green Juice");
						activityCourse.putExtra("list2_submenu",
								"Watermelon Agua Fresca");
						activityCourse.putExtra("list3_submenu",
								"Breakfast Zinger Juice");
						activityCourse.putExtra("list4_submenu",
								"Tropical Carrot-Apple Juice");
						activityCourse.putExtra("list5_submenu",
								"Cucumber Cooler");
						activityCourse.putExtra("list6_submenu",
								"Agua de Jamaica");
						activityCourse.putExtra("list7_submenu",
								"Carrot and Orange Juice");
						activityCourse.putExtra("list8_submenu",
								"Brown Sugar and Honey Limeadev");
						activityCourse.putExtra("list9_submenu",
								"Cool Fizzies for the Kiddies");
						activityCourse.putExtra("list10_submenu",
								"Green Lemonade");
						activityCourse.putExtra("list11_submenu",
								"Strawberry Soda Syrup");
						activityCourse.putExtra("list12_submenu",
								"Fresh, Homemade Apple Juice");
						activityCourse.putExtra("list13_submenu",
								"Banana Juice");
						activityCourse
								.putExtra("list14_submenu", "Orange Fizz");
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
					} else if (bt7_submeal.getText().toString()
							.equals("Mocktails")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data
						activityCourse.putExtra("list1_submenu",
								"Mock Champagne");
						activityCourse.putExtra("list2_submenu",
								"Virgin Pina Colada");
						activityCourse.putExtra("list3_submenu",
								"Cran-Dandy Cooler");
						activityCourse.putExtra("list4_submenu",
								"Cucumber Punch");
						activityCourse.putExtra("list5_submenu",
								"Italian Cream Soda");
						activityCourse.putExtra("list6_submenu",
								"Shirley Temple");
						activityCourse.putExtra("list7_submenu", "Cherry Fizz");
						activityCourse.putExtra("list8_submenu",
								"Alcohol-Free Mint Julep");
						activityCourse.putExtra("list9_submenu",
								"Tornado Twist");
						activityCourse.putExtra("list10_submenu",
								"Monica's Baptist Sangria");
						activityCourse
								.putExtra("list11_submenu", "Apple Julep");
						activityCourse.putExtra("list12_submenu",
								"RaSpBeRrY FiZzLeR");
						activityCourse.putExtra("list13_submenu",
								"Michigan Fizz");
						activityCourse.putExtra("list14_submenu", "Lime Cola");
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
					} else if (bt8_submeal.getText().toString()
							.equals("Smoothies")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data
						activityCourse.putExtra("list1_submenu",
								"Berry Delicious");
						activityCourse.putExtra("list2_submenu",
								"Kiwi Strawberry Smoothie");
						activityCourse.putExtra("list3_submenu",
								"Chocolate Banana Smoothie");
						activityCourse.putExtra("list4_submenu",
								"Breakfast Banana Green Smoothie");
						activityCourse.putExtra("list5_submenu",
								"Purple Monstrosity Fruit Smoothie");
						activityCourse.putExtra("list6_submenu",
								"Peanut Butter and Banana Smoothie");
						activityCourse.putExtra("list7_submenu",
								"Gloomy Day Smoothie");
						activityCourse.putExtra("list8_submenu",
								"Kale and Banana Smoothie");
						activityCourse.putExtra("list9_submenu",
								"Avocado Smoothie");
						activityCourse.putExtra("list10_submenu",
								"Triple Threat Fruit Smoothie");
						activityCourse.putExtra("list11_submenu",
								"Groovie Smoothie");
						activityCourse.putExtra("list12_submenu",
								"Heavenly Blueberry Smoothie");
						activityCourse.putExtra("list13_submenu",
								"Orange Smoothie");
						activityCourse.putExtra("list14_submenu",
								"Green Slime Smoothie");
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
					} else if (bt9_submeal.getText().toString().equals("Tea")) {
						Intent activityCourse = new Intent(Sub_Menu_Page.this,
								Main_Recipe_Page.class);
						// 2. put key/value data

						activityCourse
								.putExtra("list1_submenu", "Chai Tea Mix");
						activityCourse.putExtra("list2_submenu",
								"Smooth Sweet Tea");
						activityCourse.putExtra("list3_submenu",
								"Boston Iced Tea");
						activityCourse.putExtra("list4_submenu",
								"Coffeebar Chai");
						activityCourse.putExtra("list5_submenu",
								"Mint Tea Punch");
						activityCourse.putExtra("list6_submenu",
								"Honey Lemon Tea");
						activityCourse.putExtra("list7_submenu", "Russian Tea");
						activityCourse.putExtra("list8_submenu",
								"Sweet Lime Iced Tea");
						activityCourse.putExtra("list9_submenu",
								"Hot Cranberry Tea");
						activityCourse.putExtra("list10_submenu",
								"Lemonade-Mint Iced Tea");
						activityCourse.putExtra("list11_submenu",
								"Spiced Tea Mix");
						activityCourse.putExtra("list12_submenu", "Peach Tea");
						activityCourse
								.putExtra("list13_submenu", "Masala Chai");
						activityCourse.putExtra("list14_submenu",
								"Green Tea Berry Delight");
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

						activityCourse.putExtra("list1_submenu",
								"Jalapeno Popper Spread");
						activityCourse.putExtra("list2_submenu",
								"Buffalo Chicken Dip");
						activityCourse.putExtra("list3_submenu",
								"Spicy Bean Salsa");
						activityCourse.putExtra("list4_submenu",
								"Baked Buffalo Wings");
						activityCourse.putExtra("list5_submenu",
								"Avocado, Tomato and Mango Salsa");
						activityCourse.putExtra("list6_submenu",
								"Southwestern Egg Rolls");
						activityCourse.putExtra("list7_submenu",
								"Chicken Flautas");
						activityCourse.putExtra("list8_submenu",
								"Mahogany Chicken Wings");
						activityCourse.putExtra("list9_submenu",
								"Sausage Stuffed Jalapenos");
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
