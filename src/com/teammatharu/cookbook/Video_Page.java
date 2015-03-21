package com.teammatharu.cookbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class Video_Page extends YouTubeBaseActivity implements
		YouTubePlayer.OnInitializedListener {
	static private final String DEVELOPER_KEY = "AIzaSyBhOSgSIvhcd6czDACzHNKvNCWy-vlYlGA";
	static private String VIDEO = null;
	static private String ItemBack = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video__page);

		// 1. get passed intent
		Intent intent = getIntent();
		// 2. get message value from intent
		VIDEO = intent.getStringExtra("video");
		ItemBack = intent.getStringExtra("itemBack");
		YouTubePlayerView youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view1);
		youTubeView.initialize(DEVELOPER_KEY, this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.video__page, menu);
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.google.android.youtube.player.YouTubePlayer.OnInitializedListener
	 * #onInitializationFailure
	 * (com.google.android.youtube.player.YouTubePlayer.Provider,
	 * com.google.android.youtube.player.YouTubeInitializationResult)
	 */
	@Override
	public void onInitializationFailure(Provider arg0,
			YouTubeInitializationResult arg1) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "Oh no! " + arg1.toString(), Toast.LENGTH_LONG)
				.show();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.google.android.youtube.player.YouTubePlayer.OnInitializedListener
	 * #onInitializationSuccess
	 * (com.google.android.youtube.player.YouTubePlayer.Provider,
	 * com.google.android.youtube.player.YouTubePlayer, boolean)
	 */
	@Override
	public void onInitializationSuccess(Provider arg0, YouTubePlayer arg1,
			boolean arg2) {
		// TODO Auto-generated method stub
		arg1.loadVideo(VIDEO);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub

		String baseurl = "https://cookbookmatharunew.firebaseio.com/";

		Firebase ref = new Firebase(baseurl + ItemBack);

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
				String tempImage = "";
				if (arg0.getKey().toString() == "Image") {
					tempImage = arg0.getValue().toString();

				}
				if (tempImage.equals("")) {

				} else {
					Intent activityIntent = new Intent(Video_Page.this,
							MainDetailRecipePage.class);
					Bundle extras = new Bundle();
					// 4. add bundle to intent
					activityIntent.putExtras(extras);
					activityIntent.putExtra("imageURL", tempImage);
					activityIntent.putExtra("item", ItemBack);
					Video_Page.this.startActivity(activityIntent);
					finish();
				}

			}

			@Override
			public void onCancelled(FirebaseError arg0) {
				// TODO Auto-generated method stub

			}
		});

	}
}
