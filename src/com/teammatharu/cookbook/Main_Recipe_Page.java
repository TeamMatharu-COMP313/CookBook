package com.teammatharu.cookbook;

import java.util.ArrayList;
import java.util.List;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;
import com.teammatharu.recipefragments.MainRecipeFragment;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class Main_Recipe_Page extends Activity {

	ArrayAdapter<String> dataAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main__recipe__page);
		// Spinner element
		// yest
		Spinner spinner = (Spinner) findViewById(R.id.spinner1);

		// Fire Base
				Firebase.setAndroidContext(this);

			
		
		// 1. get passed intent
		Intent intent = getIntent();
		// 2. get message value from intent
		String message0 = "Please Select From This List";
		String message1 = intent.getStringExtra("list1_submenu");
		String message2 = intent.getStringExtra("list2_submenu");
		String message3 = intent.getStringExtra("list3_submenu");
		String message4 = intent.getStringExtra("list4_submenu");
		String message5 = intent.getStringExtra("list5_submenu");
		String message6 = intent.getStringExtra("list6_submenu");
		String message7 = intent.getStringExtra("list7_submenu");
		String message8 = intent.getStringExtra("list8_submenu");
		String message9 = intent.getStringExtra("list9_submenu");
		String message10 = intent.getStringExtra("list10_submenu");
		String message11 = intent.getStringExtra("list11_submenu");
		String message12 = intent.getStringExtra("list12_submenu");
		String message13 = intent.getStringExtra("list13_submenu");
		String message14 = intent.getStringExtra("list14_submenu");
		String message15 = intent.getStringExtra("list15_submenu");
		String message16 = intent.getStringExtra("list16_submenu");
		String message17 = intent.getStringExtra("list17_submenu");
		String message18 = intent.getStringExtra("list18_submenu");
		String message19 = intent.getStringExtra("list19_submenu");

		// Spinner Drop down elements
		List<String> categories = new ArrayList<String>();
		categories.add(message0);
		categories.add(message1);
		categories.add(message2);
		categories.add(message3);
		categories.add(message4);
		categories.add(message5);
		categories.add(message6);
		categories.add(message7);
		categories.add(message8);
		categories.add(message9);
		categories.add(message10);
		categories.add(message11);
		categories.add(message12);
		categories.add(message13);
		categories.add(message14);
		categories.add(message15);
		categories.add(message16);
		categories.add(message17);
		categories.add(message18);
		categories.add(message19);

		// Creating adapter for spinner
		dataAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, categories);

		if (message1.equals("none")) {
			dataAdapter.remove(message1);
		} else {
		}
		if (message2.equals("none")) {
			dataAdapter.remove(message2);
		} else {

		}
		if (message3.equals("none")) {
			dataAdapter.remove(message3);
		} else {

		}
		if (message4.equals("none")) {
			dataAdapter.remove(message4);
		} else {

		}
		if (message5.equals("none")) {
			dataAdapter.remove(message5);
		} else {

		}
		if (message6.equals("none")) {
			dataAdapter.remove(message6);
		} else {

		}
		if (message7.equals("none")) {
			dataAdapter.remove(message7);
		} else {

		}
		if (message8.equals("none")) {
			dataAdapter.remove(message8);
		} else {

		}
		if (message9.equals("none")) {
			dataAdapter.remove(message9);
		} else {

		}
		if (message10.equals("none")) {
			dataAdapter.remove(message10);
		} else {

		}
		if (message11.equals("none")) {
			dataAdapter.remove(message11);
		} else {

		}
		if (message12.equals("none")) {
			dataAdapter.remove(message12);
		} else {

		}
		if (message13.equals("none")) {
			dataAdapter.remove(message13);
		} else {

		}
		if (message14.equals("none")) {
			dataAdapter.remove(message14);
		} else {

		}
		if (message15.equals("none")) {
			dataAdapter.remove(message15);
		} else {

		}
		if (message16.equals("none")) {
			dataAdapter.remove(message16);
		} else {

		}
		if (message17.equals("none")) {
			dataAdapter.remove(message17);
		} else {

		}
		if (message18.equals("none")) {
			dataAdapter.remove(message18);
		} else {

		}
		if (message19.equals("none")) {
			dataAdapter.remove(message19);
		} else {

		}

		// attaching data adapter to spinner
		spinner.setAdapter(dataAdapter);

		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			// int count=0;
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				// On selecting a spinner item
				// count++;
				// Log.d("on Select",count+"");
				String item = parent.getItemAtPosition(position).toString();
				if (item != "Please Select From This List") {
					Intent i = new Intent(Main_Recipe_Page.this,MainDetailRecipePage.class);
					i.putExtra("item", item);
					startActivity(i);
					finish();
				}

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}

		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main__recipe__page, menu);
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
		Intent activityIntent = new Intent(Main_Recipe_Page.this,
				MainLandingPage.class);
		Main_Recipe_Page.this.startActivity(activityIntent);
		finish();
	}

}
