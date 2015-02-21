package com.teammatharu.recipefragments;

import com.teammatharu.cookbook.R;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * 
 */
public class RecipeImage extends android.support.v4.app.Fragment {

	private String recipeName;
	
	
	public RecipeImage(String recipe) {
		// Required empty public constructor
		recipeName=recipe;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View v=inflater.inflate(R.layout.fragment_recipe_image, container,
				false);
		
		
		Log.d("RecipeImage", "Recipe Image Fragment Got created");
		
		TextView t1=(TextView) v.findViewById(R.id.textView1);
		t1.setText(recipeName);
		
		Log.d("TEXTVIEW1", recipeName);
		
		
		return v;
		
	}

}
