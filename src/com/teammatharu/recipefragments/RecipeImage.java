package com.teammatharu.recipefragments;

import com.teammatharu.cookbook.R;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * 
 */
public class RecipeImage extends android.support.v4.app.Fragment {

	public RecipeImage() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		Log.d("RecipeImage", "Recipe Image Fragment Got created");
		return inflater.inflate(R.layout.fragment_recipe_image, container,
				false);
		
	}

}
