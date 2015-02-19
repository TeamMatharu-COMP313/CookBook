/**
 * 
 */
package com.teammatharu.recipefragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * @author Hiren
 *
 */
public class FragmentPageAdapter extends FragmentPagerAdapter {

	/**
	 * @param fm
	 */
	public FragmentPageAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see android.support.v4.app.FragmentPagerAdapter#getItem(int)
	 */
	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		 switch (arg0) {  
		 case 0:
			 return new RecipeImage();
		 case 1:
			 return new RecipeIngredients();
		 case 2:
			 return new RecipeDirections();
		 case 3:
			 return new RecipeVideo();
			 
         default:  
              break;  
         }  
         return null;
	}

	/* (non-Javadoc)
	 * @see android.support.v4.view.PagerAdapter#getCount()
	 */
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 4;
	}

}
