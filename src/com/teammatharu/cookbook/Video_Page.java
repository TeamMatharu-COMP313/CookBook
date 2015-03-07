package com.teammatharu.cookbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class Video_Page extends YouTubeBaseActivity implements
		YouTubePlayer.OnInitializedListener {
	static private final String DEVELOPER_KEY = "AIzaSyBhOSgSIvhcd6czDACzHNKvNCWy-vlYlGA";
	static private String VIDEO = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video__page);

		// 1. get passed intent
		Intent intent = getIntent();
		// 2. get message value from intent
		VIDEO = intent.getStringExtra("video");
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
		Intent activityIntent = new Intent(Video_Page.this,
				MainDetailRecipePage.class);
		Video_Page.this.startActivity(activityIntent);
		finish();
	}
}
