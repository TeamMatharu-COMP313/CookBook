package com.teammatharu.cookbook;

import java.util.ArrayList;
import java.util.Arrays;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.client.Firebase;

public class SearchPage extends ListActivity {
	private EditText et;
	private ListView lv;
	private final String[] listview_names = { "Mocha Coffee",
			"Easy Iced Coffee", "Pumpkin Spiced Latte",
			"Iced Mocha Fusion Shake", "Gunline Coffee", "Coffee Shake",
			"Peanut Buttercup Hot Chocolate", "Homestyle Hot Cocoa",
			"Cool Fizzies for the Kiddies", "Green Lemonade",
			"Strawberry Soda Syrup", "Fresh, Homemade Apple Juice",
			"Banana Juice", "Orange Fizz", "Lemonade-Mint Iced Tea",
			"Spiced Tea Mix", "Peach Tea", "Masala Chai",
			"Green Tea Berry Delight", "Zucchini Patties",
			"Blue Cheese Burgers", "Bacon Wrapped Hamburgers", "Ranch Burgers",
			"Portobello Mushroom Burgers", "Seasoned Turkey Burgers",
			"Spicy Chipotle Turkey Burgers", "Quinoa Black Bean Burgers",
			"Cream Cheese Jalapeno Hamburgers", "Butter Bean Burgers",
			"Spinach and Feta Turkey Burgers", "Tasty Tuna Burgers", "Boniet",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };

	private ArrayList<String> array_sort;
	int textlength = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_page);

		Firebase.setAndroidContext(this);

		et = (EditText) findViewById(R.id.EditText01);
		lv = (ListView) findViewById(android.R.id.list);

		array_sort = new ArrayList<String>(Arrays.asList(listview_names));
		setListAdapter(new bsAdapter(this));

		et.addTextChangedListener(new TextWatcher() {
			@Override
			public void afterTextChanged(Editable s) {
				// Abstract Method of TextWatcher Interface.
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// Abstract Method of TextWatcher Interface.
			}

			@SuppressLint("DefaultLocale")
			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				textlength = et.getText().length();
				array_sort.clear();
				for (int i = 0; i < listview_names.length; i++) {
					if (textlength <= listview_names[i].length()) {

						/***
						 * If you want to highlight the countries which start
						 * with entered letters then choose this block. And
						 * comment the below If condition Block
						 */
						/*
						 * if(et.getText().toString().equalsIgnoreCase( (String)
						 * listview_names[i].subSequence(0, textlength))) {
						 * array_sort.add(listview_names[i]);
						 * image_sort.add(listview_images[i]); }
						 */

						/***
						 * If you choose the below block then it will act like a
						 * Like operator in the Mysql
						 */

						if (listview_names[i].toLowerCase().contains(
								et.getText().toString().toLowerCase().trim())) {
							array_sort.add(listview_names[i]);
						}
					}
				}
				AppendList(array_sort);
			}
		});

		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				Intent activityIntent = new Intent(SearchPage.this,
						MainDetailRecipePage.class);
				activityIntent.putExtra("item", array_sort.get(position));
				activityIntent.putExtra("backButton", "back");
				startActivity(activityIntent);
				finish();

			}
		});
	}

	public void AppendList(ArrayList<String> str) {
		setListAdapter(new bsAdapter(this));
	}

	public class bsAdapter extends BaseAdapter {
		Activity cntx;

		public bsAdapter(Activity context) {
			// TODO Auto-generated constructor stub
			this.cntx = context;

		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return array_sort.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return array_sort.get(position);
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return array_sort.size();
		}

		@SuppressLint({ "ViewHolder", "InflateParams" })
		@Override
		public View getView(final int position, View convertView,
				ViewGroup parent) {
			View row = null;

			LayoutInflater inflater = cntx.getLayoutInflater();
			row = inflater.inflate(R.layout.search_list_item, null);

			TextView tv = (TextView) row.findViewById(R.id.title);

			tv.setText(array_sort.get(position));

			return row;
		}
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
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(SearchPage.this,
				MainLandingPage.class);
		SearchPage.this.startActivity(activityIntent);
		finish();
	}
}
