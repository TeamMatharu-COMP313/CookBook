package com.teammatharu.cookbook;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;

public class MainDetailRecipePage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_detail_recipe_page);

		String baseurl = "https://cookbookmatharunew.firebaseio.com/";

		// Fire Base
		Firebase.setAndroidContext(this);

		// 1. get passed intent
		Intent intent = getIntent();
		String recipeName = intent.getStringExtra("item");

		// Action Bar Text
		setTitle(recipeName);

		Firebase ref = new Firebase(baseurl + recipeName);

		// declaring
		final ImageView imgDetailRecipe = (ImageView) findViewById(R.id.imageViewDetailRecipe);
		final TextView tvImgDetail = (TextView) findViewById(R.id.tvImageDetail);
		final TextView tvIngredientsList = (TextView) findViewById(R.id.tvIngredientsList1);
		final TextView tvDirectionList = (TextView) findViewById(R.id.tvDirectionList1);
		final Button bVideo = (Button) findViewById(R.id.btnVideo);

		ref.addChildEventListener(new ChildEventListener() {

			@Override
			public void onChildRemoved(DataSnapshot arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onChildMoved(DataSnapshot arg0, String arg1) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onChildChanged(DataSnapshot arg0, String arg1) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onChildAdded(DataSnapshot arg0, String arg1) {
				// TODO Auto-generated method stub
				// Setting Image
				if (arg0.getKey().toString() == "Image") {
					String tempImage = arg0.getValue().toString();
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}
				// setting image detail
				if (arg0.getKey().toString() == "Description") {
					tvImgDetail.setText(arg0.getValue().toString());
				}
				// Setting Direction
				if (arg0.getKey().toString() == "Direction") {
					@SuppressWarnings("unchecked")
					ArrayList<String> dirArray = (ArrayList<String>) arg0
							.getValue();
					for (int i = 0; i < dirArray.size(); i++) {
						tvDirectionList.append(dirArray.get(i).toString()
								+ "\n");
					}
				}
				// Setting Ingredients
				if (arg0.getKey().toString() == "Ingridents") {
					@SuppressWarnings("unchecked")
					ArrayList<String> dirArray = (ArrayList<String>) arg0
							.getValue();
					for (int i = 0; i < dirArray.size(); i++) {
						tvIngredientsList.append(dirArray.get(i).toString()
								+ "\n");
					}
				}
				// setting video
				if (arg0.getKey().toString() == "Video") {
					final String video = arg0.getValue().toString();
					bVideo.setOnClickListener(new OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							Intent activityIntent = new Intent(
									MainDetailRecipePage.this, Video_Page.class);
							activityIntent.putExtra("video", video);
							Bundle extras = new Bundle();
							// 4. add bundle to intent
							activityIntent.putExtras(extras);
							MainDetailRecipePage.this
									.startActivity(activityIntent);
							finish();
						}
					});
				}

			}

			@Override
			public void onCancelled(FirebaseError arg0) {
				// TODO Auto-generated method stub

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
			Intent i = new Intent(MainDetailRecipePage.this, ContactUs.class);
			startActivity(i);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(MainDetailRecipePage.this,
				MainLandingPage.class);
		MainDetailRecipePage.this.startActivity(activityIntent);
		finish();
	}
}
