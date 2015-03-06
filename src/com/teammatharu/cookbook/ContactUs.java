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
import android.widget.Toast;

public class ContactUs extends Activity {
	Button emailUs;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact_us);
		
		emailUs=(Button) findViewById(R.id.emailus);
		
		
		emailUs.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
				intent.setType("text/plain");
				intent.putExtra(Intent.EXTRA_SUBJECT, "");
				intent.putExtra(Intent.EXTRA_TEXT, "Message:");
				intent.setData(Uri.parse("mailto:patelh18@gmail.com;urvashi.ucoe@gmail.com;jagdeepmatharu88@gmail.com;kartiktipparthi@gmail.com;parin2392@gmail.com;abhi.mekwan@gmail.com;")); // or just "mailto:" for blank
				intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				try {
				    startActivity(Intent.createChooser(intent, "Send mail..."));
				} catch (android.content.ActivityNotFoundException ex) {
				    Toast.makeText(ContactUs.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
				}
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.content, menu);
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
