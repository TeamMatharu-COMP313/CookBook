package com.teammatharu.recipefragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teammatharu.cookbook.R;

/**
 * A simple {@link Fragment} subclass.
 * 
 */
public class RecipeIngredients extends android.support.v4.app.Fragment {

	public RecipeIngredients() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_recipe_ingredients,
				container, false);
	}

}
