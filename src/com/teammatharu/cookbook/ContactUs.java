package com.teammatharu.cookbook;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;

public class ContactUs extends Activity {
	Button emailUs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_us);

		emailUs = (Button) findViewById(R.id.emailus);

		final ImageView iVJagdeep = (ImageView) findViewById(R.id.iVJagdeep);
		Firebase fVJagdeep = new Firebase(
				"https://cookbook-teammatharu.firebaseio.com/jmatharu");

		fVJagdeep.addValueEventListener(new ValueEventListener() {

			@Override
			public void onDataChange(DataSnapshot arg0) {
				// TODO Auto-generated method stub
				String tempImage = (String) arg0.getValue();
				// Assigning Image to Image view
				UrlImageViewHelper.setUrlDrawable(iVJagdeep, tempImage);
			}

			@Override
			public void onCancelled(FirebaseError arg0) {
				// TODO Auto-generated method stub

			}
		});

		final ImageView iVHiren = (ImageView) findViewById(R.id.iVHiren);
		Firebase fVHiren = new Firebase(
				"https://cookbook-teammatharu.firebaseio.com/hiren");

		fVHiren.addValueEventListener(new ValueEventListener() {

			@Override
			public void onDataChange(DataSnapshot arg0) {
				// TODO Auto-generated method stub
				String tempImage = (String) arg0.getValue();
				// Assigning Image to Image view
				UrlImageViewHelper.setUrlDrawable(iVHiren, tempImage);
			}

			@Override
			public void onCancelled(FirebaseError arg0) {
				// TODO Auto-generated method stub

			}
		});

		final ImageView iVUrvashi = (ImageView) findViewById(R.id.iVUrvashi);
		Firebase fVUrvashi = new Firebase(
				"https://cookbook-teammatharu.firebaseio.com/urvashi");

		fVUrvashi.addValueEventListener(new ValueEventListener() {

			@Override
			public void onDataChange(DataSnapshot arg0) {
				// TODO Auto-generated method stub
				String tempImage = (String) arg0.getValue();
				// Assigning Image to Image view
				UrlImageViewHelper.setUrlDrawable(iVUrvashi, tempImage);
			}

			@Override
			public void onCancelled(FirebaseError arg0) {
				// TODO Auto-generated method stub

			}
		});

		final ImageView iVParin = (ImageView) findViewById(R.id.iVParin);
		Firebase fiVParin = new Firebase(
				"https://cookbook-teammatharu.firebaseio.com/parin");

		fiVParin.addValueEventListener(new ValueEventListener() {

			@Override
			public void onDataChange(DataSnapshot arg0) {
				// TODO Auto-generated method stub
				String tempImage = (String) arg0.getValue();
				// Assigning Image to Image view
				UrlImageViewHelper.setUrlDrawable(iVParin, tempImage);
			}

			@Override
			public void onCancelled(FirebaseError arg0) {
				// TODO Auto-generated method stub

			}
		});

		final ImageView iVKartik = (ImageView) findViewById(R.id.iVKartik);
		Firebase fiVKartik = new Firebase(
				"https://cookbook-teammatharu.firebaseio.com/kartik");

		fiVKartik.addValueEventListener(new ValueEventListener() {

			@Override
			public void onDataChange(DataSnapshot arg0) {
				// TODO Auto-generated method stub
				String tempImage = (String) arg0.getValue();
				// Assigning Image to Image view
				UrlImageViewHelper.setUrlDrawable(iVKartik, tempImage);
			}

			@Override
			public void onCancelled(FirebaseError arg0) {
				// TODO Auto-generated method stub

			}
		});

		final ImageView iVAbhishek = (ImageView) findViewById(R.id.iVAbhishek);
		Firebase fiVAbhishek = new Firebase(
				"https://cookbook-teammatharu.firebaseio.com/abhishek");

		fiVAbhishek.addValueEventListener(new ValueEventListener() {

			@Override
			public void onDataChange(DataSnapshot arg0) {
				// TODO Auto-generated method stub
				String tempImage = (String) arg0.getValue();
				// Assigning Image to Image view
				UrlImageViewHelper.setUrlDrawable(iVAbhishek, tempImage);
			}

			@Override
			public void onCancelled(FirebaseError arg0) {
				// TODO Auto-generated method stub

			}
		});

		emailUs.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not
																	// ACTION_SEND
				intent.setType("text/plain");
				intent.putExtra(Intent.EXTRA_SUBJECT, "");
				intent.putExtra(Intent.EXTRA_TEXT, "Message:");
				intent.setData(Uri
						.parse("mailto:patelh18@gmail.com;urvashi.ucoe@gmail.com;jagdeepmatharu88@gmail.com;kartiktipparthi@gmail.com;parin2392@gmail.com;abhi.mekwan@gmail.com;")); // or
																																														// just
																																														// "mailto:"
																																														// for
																																														// blank
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				try {
					startActivity(Intent.createChooser(intent, "Send mail..."));
				} catch (android.content.ActivityNotFoundException ex) {
					Toast.makeText(ContactUs.this,
							"There are no email clients installed.",
							Toast.LENGTH_SHORT).show();
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.content, menu);
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
