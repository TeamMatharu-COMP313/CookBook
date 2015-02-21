package com.teammatharu.recipefragments;

import com.teammatharu.cookbook.MainLandingPage;
import com.teammatharu.cookbook.R;
import com.teammatharu.cookbook.Sub_Menu_Page;
import com.teammatharu.cookbook.R.id;
import com.teammatharu.cookbook.R.layout;
import com.teammatharu.cookbook.R.menu;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainRecipeFragment extends FragmentActivity implements TabListener {
	
	ActionBar actionbar;  
    ViewPager viewpager;  
    FragmentPageAdapter ft;
    String recipeName;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_recipe_fragment);
		
		Intent i=getIntent();
		
		recipeName=i.getStringExtra("item");
		
		Log.d("RECIPE NAME", recipeName);
		
		
		//setting up tab layout
		
				viewpager = (ViewPager) findViewById(R.id.pager);  
		        ft = new FragmentPageAdapter(getSupportFragmentManager(),recipeName);
		        
		        actionbar = getActionBar(); 
		       
		        viewpager.setAdapter(ft);  
		        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);  
		        actionbar.addTab(actionbar.newTab().setText("Image").setTabListener(this));  
		        actionbar.addTab(actionbar.newTab().setText("Ingredients").setTabListener(this));  
		        actionbar.addTab(actionbar.newTab().setText("Directions").setTabListener(this));
				actionbar.addTab(actionbar.newTab().setText("Videos").setTabListener(this));
		        
		        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {  
		            @Override  
		            public void onPageSelected(int arg0) {  
		            actionbar.setSelectedNavigationItem(arg0);  
		            }  
		            @Override  
		            public void onPageScrolled(int arg0, float arg1, int arg2) {  
		                 // TODO Auto-generated method stub  
		            }  
		            @Override  
		            public void onPageScrollStateChanged(int arg0) {  
		                 // TODO Auto-generated method stub  
		            }  
		       }); 
		        
		        /*
		        actionbar.setListNavigationCallbacks(dataAdapter, new OnNavigationListener() {
					
					@Override
					public boolean onNavigationItemSelected(int itemPosition, long itemId) {
						// TODO Auto-generated method stub
						return false;
					}
				});
				*/
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_recipe, menu);
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
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		viewpager.setCurrentItem(tab.getPosition());  
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(MainRecipeFragment.this,
				MainLandingPage.class);
		MainRecipeFragment.this.startActivity(activityIntent);
		finish();
	}
}
