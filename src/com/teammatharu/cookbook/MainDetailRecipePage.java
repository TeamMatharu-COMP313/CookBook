package com.teammatharu.cookbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;

public class MainDetailRecipePage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_detail_recipe_page);

		// Fire Base
		Firebase.setAndroidContext(this);

		// 1. get passed intent
		Intent intent = getIntent();
		String item = intent.getStringExtra("item");

		// declaring
		final ImageView imgDetailRecipe = (ImageView) findViewById(R.id.imageViewDetailRecipe);
		final TextView tvImgDetail = (TextView) findViewById(R.id.tvImageDetail);
		final TextView tvIngredientsList1 = (TextView) findViewById(R.id.tvIngredientsList1);
		final TextView tvIngredientsList2 = (TextView) findViewById(R.id.tvIngredientsList2);
		final TextView tvIngredientsList3 = (TextView) findViewById(R.id.tvIngredientsList3);
		final TextView tvIngredientsList4 = (TextView) findViewById(R.id.tvIngredientsList4);
		final TextView tvIngredientsList5 = (TextView) findViewById(R.id.tvIngredientsList5);
		final TextView tvIngredientsList6 = (TextView) findViewById(R.id.tvIngredientsList6);
		final TextView tvDirectionList1 = (TextView) findViewById(R.id.tvDirectionList1);
		final TextView tvDirectionList2 = (TextView) findViewById(R.id.tvDirectionList2);
		final TextView tvDirectionList3 = (TextView) findViewById(R.id.tvDirectionList3);
		final TextView tvDirectionList4 = (TextView) findViewById(R.id.tvDirectionList4);
		final TextView tvDirectionList5 = (TextView) findViewById(R.id.tvDirectionList5);
		final TextView tvDirectionList6 = (TextView) findViewById(R.id.tvDirectionList6);

		if (item.equals("Boniet")) {
			// Action Bar Text
			setTitle("Boniet");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/1/courses_appetizer_antipasto_boniet_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/1/courses_appetizer_antipasto_boniet_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/1/courses_appetizer_antipasto_boniet_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/1/courses_appetizer_antipasto_boniet_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/1/courses_appetizer_antipasto_boniet_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/1/courses_appetizer_antipasto_boniet_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/1/courses_appetizer_antipasto_boniet_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/1/courses_appetizer_antipasto_boniet_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/1/courses_appetizer_antipasto_boniet_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/1/courses_appetizer_antipasto_boniet_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/1/courses_appetizer_antipasto_boniet_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/1/courses_appetizer_antipasto_boniet_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/1/courses_appetizer_antipasto_boniet_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/1/courses_appetizer_antipasto_boniet_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

		} else if (item.equals("Antipasto Platter")) {
			// Action Bar Text
			setTitle("Antipasto Platter");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/2/courses_appetizer_antipasto_Antipasto_Platter_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/2/courses_appetizer_antipasto_Antipasto_Platter_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/2/courses_appetizer_antipasto_Antipasto_Platter_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/2/courses_appetizer_antipasto_Antipasto_Platter_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/2/courses_appetizer_antipasto_Antipasto_Platter_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/2/courses_appetizer_antipasto_Antipasto_Platter_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/2/courses_appetizer_antipasto_Antipasto_Platter_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/2/courses_appetizer_antipasto_Antipasto_Platter_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/2/courses_appetizer_antipasto_Antipasto_Platter_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/2/courses_appetizer_antipasto_Antipasto_Platter_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/2/courses_appetizer_antipasto_Antipasto_Platter_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/2/courses_appetizer_antipasto_Antipasto_Platter_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/2/courses_appetizer_antipasto_Antipasto_Platter_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/2/courses_appetizer_antipasto_Antipasto_Platter_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Eggplant Antipasto")) {
			// Action Bar Text
			setTitle("Eggplant Antipasto");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/3/courses_appetizer_antipasto_Eggplant_Antipasto_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/3/courses_appetizer_antipasto_Eggplant_Antipasto_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/3/courses_appetizer_antipasto_Eggplant_Antipasto_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/3/courses_appetizer_antipasto_Eggplant_Antipasto_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/3/courses_appetizer_antipasto_Eggplant_Antipasto_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/3/courses_appetizer_antipasto_Eggplant_Antipasto_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/3/courses_appetizer_antipasto_Eggplant_Antipasto_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/3/courses_appetizer_antipasto_Eggplant_Antipasto_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/3/courses_appetizer_antipasto_Eggplant_Antipasto_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/3/courses_appetizer_antipasto_Eggplant_Antipasto_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/3/courses_appetizer_antipasto_Eggplant_Antipasto_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/3/courses_appetizer_antipasto_Eggplant_Antipasto_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/3/courses_appetizer_antipasto_Eggplant_Antipasto_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/3/courses_appetizer_antipasto_Eggplant_Antipasto_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Antipasto Squares")) {
			// Action Bar Text
			setTitle("Antipasto Squares");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/4/courses_appetizer_antipasto_Antipasto_Squares_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/4/courses_appetizer_antipasto_Antipasto_Squares_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/4/courses_appetizer_antipasto_Antipasto_Squares_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/4/courses_appetizer_antipasto_Antipasto_Squares_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/4/courses_appetizer_antipasto_Antipasto_Squares_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/4/courses_appetizer_antipasto_Antipasto_Squares_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/4/courses_appetizer_antipasto_Antipasto_Squares_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/4/courses_appetizer_antipasto_Antipasto_Squares_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/4/courses_appetizer_antipasto_Antipasto_Squares_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/4/courses_appetizer_antipasto_Antipasto_Squares_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/4/courses_appetizer_antipasto_Antipasto_Squares_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/4/courses_appetizer_antipasto_Antipasto_Squares_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/4/courses_appetizer_antipasto_Antipasto_Squares_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/4/courses_appetizer_antipasto_Antipasto_Squares_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Prosciutto Wrapped Melon Balls")) {
			// Action Bar Text
			setTitle("Prosciutto Wrapped Melon Balls");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/5/courses_appetizer_antipasto_Prosciutto_Wrapped_Melon_Balls_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/5/courses_appetizer_antipasto_Prosciutto_Wrapped_Melon_Balls_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/5/courses_appetizer_antipasto_Prosciutto_Wrapped_Melon_Balls_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/5/courses_appetizer_antipasto_Prosciutto_Wrapped_Melon_Balls_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/5/courses_appetizer_antipasto_Prosciutto_Wrapped_Melon_Balls_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/5/courses_appetizer_antipasto_Prosciutto_Wrapped_Melon_Balls_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/5/courses_appetizer_antipasto_Prosciutto_Wrapped_Melon_Balls_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/5/courses_appetizer_antipasto_Prosciutto_Wrapped_Melon_Balls_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/5/courses_appetizer_antipasto_Prosciutto_Wrapped_Melon_Balls_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/5/courses_appetizer_antipasto_Prosciutto_Wrapped_Melon_Balls_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/5/courses_appetizer_antipasto_Prosciutto_Wrapped_Melon_Balls_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/5/courses_appetizer_antipasto_Prosciutto_Wrapped_Melon_Balls_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/5/courses_appetizer_antipasto_Prosciutto_Wrapped_Melon_Balls_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/5/courses_appetizer_antipasto_Prosciutto_Wrapped_Melon_Balls_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Cherry Pepper Poppers")) {
			// Action Bar Text
			setTitle("Cherry Pepper Poppers");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/6/courses_appetizer_antipasto_Cherry_Pepper_Poppers_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/6/courses_appetizer_antipasto_Cherry_Pepper_Poppers_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/6/courses_appetizer_antipasto_Cherry_Pepper_Poppers_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/6/courses_appetizer_antipasto_Cherry_Pepper_Poppers_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/6/courses_appetizer_antipasto_Cherry_Pepper_Poppers_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/6/courses_appetizer_antipasto_Cherry_Pepper_Poppers_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/6/courses_appetizer_antipasto_Cherry_Pepper_Poppers_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/6/courses_appetizer_antipasto_Cherry_Pepper_Poppers_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/6/courses_appetizer_antipasto_Cherry_Pepper_Poppers_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/6/courses_appetizer_antipasto_Cherry_Pepper_Poppers_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/6/courses_appetizer_antipasto_Cherry_Pepper_Poppers_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/6/courses_appetizer_antipasto_Cherry_Pepper_Poppers_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/6/courses_appetizer_antipasto_Cherry_Pepper_Poppers_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/6/courses_appetizer_antipasto_Cherry_Pepper_Poppers_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Olive Balls")) {
			// Action Bar Text
			setTitle("Olive Balls");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/7/courses_appetizer_antipasto_Olive_Balls_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/7/courses_appetizer_antipasto_Olive_Balls_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/7/courses_appetizer_antipasto_Olive_Balls_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/7/courses_appetizer_antipasto_Olive_Balls_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/7/courses_appetizer_antipasto_Olive_Balls_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/7/courses_appetizer_antipasto_Olive_Balls_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/7/courses_appetizer_antipasto_Olive_Balls_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/7/courses_appetizer_antipasto_Olive_Balls_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/7/courses_appetizer_antipasto_Olive_Balls_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/7/courses_appetizer_antipasto_Olive_Balls_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/7/courses_appetizer_antipasto_Olive_Balls_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/7/courses_appetizer_antipasto_Olive_Balls_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/7/courses_appetizer_antipasto_Olive_Balls_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/7/courses_appetizer_antipasto_Olive_Balls_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Cucumber and Ham Antipasto")) {
			// Action Bar Text
			setTitle("Cucumber and Ham Antipasto");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/8/courses_appetizer_antipasto_Cucumber_and_Ham_Antipasto_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/8/courses_appetizer_antipasto_Cucumber_and_Ham_Antipasto_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/8/courses_appetizer_antipasto_Cucumber_and_Ham_Antipasto_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/8/courses_appetizer_antipasto_Cucumber_and_Ham_Antipasto_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/8/courses_appetizer_antipasto_Cucumber_and_Ham_Antipasto_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/8/courses_appetizer_antipasto_Cucumber_and_Ham_Antipasto_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/8/courses_appetizer_antipasto_Cucumber_and_Ham_Antipasto_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/8/courses_appetizer_antipasto_Cucumber_and_Ham_Antipasto_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/8/courses_appetizer_antipasto_Cucumber_and_Ham_Antipasto_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/8/courses_appetizer_antipasto_Cucumber_and_Ham_Antipasto_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/8/courses_appetizer_antipasto_Cucumber_and_Ham_Antipasto_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/8/courses_appetizer_antipasto_Cucumber_and_Ham_Antipasto_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/8/courses_appetizer_antipasto_Cucumber_and_Ham_Antipasto_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/8/courses_appetizer_antipasto_Cucumber_and_Ham_Antipasto_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Fresh Sardines Naples Style")) {
			// Action Bar Text
			setTitle("Fresh Sardines Naples Style");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/9/courses_appetizer_antipasto_Fresh_Sardines_Naples_Style_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/9/courses_appetizer_antipasto_Fresh_Sardines_Naples_Style_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/9/courses_appetizer_antipasto_Fresh_Sardines_Naples_Style_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/9/courses_appetizer_antipasto_Fresh_Sardines_Naples_Style_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/9/courses_appetizer_antipasto_Fresh_Sardines_Naples_Style_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/9/courses_appetizer_antipasto_Fresh_Sardines_Naples_Style_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/9/courses_appetizer_antipasto_Fresh_Sardines_Naples_Style_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/9/courses_appetizer_antipasto_Fresh_Sardines_Naples_Style_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/9/courses_appetizer_antipasto_Fresh_Sardines_Naples_Style_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/9/courses_appetizer_antipasto_Fresh_Sardines_Naples_Style_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/9/courses_appetizer_antipasto_Fresh_Sardines_Naples_Style_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/9/courses_appetizer_antipasto_Fresh_Sardines_Naples_Style_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/9/courses_appetizer_antipasto_Fresh_Sardines_Naples_Style_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/9/courses_appetizer_antipasto_Fresh_Sardines_Naples_Style_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Antipasto Salad Platter")) {
			// Action Bar Text
			setTitle("Antipasto Salad Platter");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/10/courses_appetizer_antipasto_Antipasto_Salad_Platter_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/10/courses_appetizer_antipasto_Antipasto_Salad_Platter_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/10/courses_appetizer_antipasto_Antipasto_Salad_Platter_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/10/courses_appetizer_antipasto_Antipasto_Salad_Platter_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/10/courses_appetizer_antipasto_Antipasto_Salad_Platter_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/10/courses_appetizer_antipasto_Antipasto_Salad_Platter_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/10/courses_appetizer_antipasto_Antipasto_Salad_Platter_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/10/courses_appetizer_antipasto_Antipasto_Salad_Platter_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/10/courses_appetizer_antipasto_Antipasto_Salad_Platter_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/10/courses_appetizer_antipasto_Antipasto_Salad_Platter_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/10/courses_appetizer_antipasto_Antipasto_Salad_Platter_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/10/courses_appetizer_antipasto_Antipasto_Salad_Platter_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/10/courses_appetizer_antipasto_Antipasto_Salad_Platter_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/10/courses_appetizer_antipasto_Antipasto_Salad_Platter_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Italian Tuna Spread")) {
			// Action Bar Text
			setTitle("Italian Tuna Spread");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/11/courses_appetizer_antipasto_Italian_Tuna_Spread_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/11/courses_appetizer_antipasto_Italian_Tuna_Spread_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/11/courses_appetizer_antipasto_Italian_Tuna_Spread_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/11/courses_appetizer_antipasto_Italian_Tuna_Spread_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/11/courses_appetizer_antipasto_Italian_Tuna_Spread_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/11/courses_appetizer_antipasto_Italian_Tuna_Spread_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/11/courses_appetizer_antipasto_Italian_Tuna_Spread_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/11/courses_appetizer_antipasto_Italian_Tuna_Spread_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/11/courses_appetizer_antipasto_Italian_Tuna_Spread_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/11/courses_appetizer_antipasto_Italian_Tuna_Spread_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/11/courses_appetizer_antipasto_Italian_Tuna_Spread_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/11/courses_appetizer_antipasto_Italian_Tuna_Spread_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/11/courses_appetizer_antipasto_Italian_Tuna_Spread_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/11/courses_appetizer_antipasto_Italian_Tuna_Spread_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Baked Eggplant Antipasto")) {
			// Action Bar Text
			setTitle("Baked Eggplant Antipasto");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/12/courses_appetizer_antipasto_Baked_Eggplant_Antipasto_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/12/courses_appetizer_antipasto_Baked_Eggplant_Antipasto_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/12/courses_appetizer_antipasto_Baked_Eggplant_Antipasto_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/12/courses_appetizer_antipasto_Baked_Eggplant_Antipasto_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/12/courses_appetizer_antipasto_Baked_Eggplant_Antipasto_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/12/courses_appetizer_antipasto_Baked_Eggplant_Antipasto_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/12/courses_appetizer_antipasto_Baked_Eggplant_Antipasto_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/12/courses_appetizer_antipasto_Baked_Eggplant_Antipasto_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/12/courses_appetizer_antipasto_Baked_Eggplant_Antipasto_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/12/courses_appetizer_antipasto_Baked_Eggplant_Antipasto_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/12/courses_appetizer_antipasto_Baked_Eggplant_Antipasto_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/12/courses_appetizer_antipasto_Baked_Eggplant_Antipasto_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/12/courses_appetizer_antipasto_Baked_Eggplant_Antipasto_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/12/courses_appetizer_antipasto_Baked_Eggplant_Antipasto_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Baklava")) {
			// Action Bar Text
			setTitle("Baklava");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/19/courses_appetizer_pastry_Baklava_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/19/courses_appetizer_pastry_Baklava_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/19/courses_appetizer_pastry_Baklava_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/19/courses_appetizer_pastry_Baklava_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/19/courses_appetizer_pastry_Baklava_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/19/courses_appetizer_pastry_Baklava_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/19/courses_appetizer_pastry_Baklava_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/19/courses_appetizer_pastry_Baklava_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/19/courses_appetizer_pastry_Baklava_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/19/courses_appetizer_pastry_Baklava_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/19/courses_appetizer_pastry_Baklava_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/19/courses_appetizer_pastry_Baklava_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/19/courses_appetizer_pastry_Baklava_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/19/courses_appetizer_pastry_Baklava_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Cream Puffs")) {
			// Action Bar Text
			setTitle("Cream Puffs");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/20/courses_appetizer_pastry_Cream_Puffs_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/20/courses_appetizer_pastry_Cream_Puffs_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/20/courses_appetizer_pastry_Cream_Puffs_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/20/courses_appetizer_pastry_Cream_Puffs_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/20/courses_appetizer_pastry_Cream_Puffs_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/20/courses_appetizer_pastry_Cream_Puffs_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/20/courses_appetizer_pastry_Cream_Puffs_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/20/courses_appetizer_pastry_Cream_Puffs_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/20/courses_appetizer_pastry_Cream_Puffs_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/20/courses_appetizer_pastry_Cream_Puffs_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/20/courses_appetizer_pastry_Cream_Puffs_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/20/courses_appetizer_pastry_Cream_Puffs_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/20/courses_appetizer_pastry_Cream_Puffs_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/20/courses_appetizer_pastry_Cream_Puffs_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Sweet Dinner Rolls")) {
			// Action Bar Text
			setTitle("Sweet Dinner Rolls");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/21/courses_appetizer_pastry_Sweet_Dinner_Rolls_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/21/courses_appetizer_pastry_Sweet_Dinner_Rolls_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/21/courses_appetizer_pastry_Sweet_Dinner_Rolls_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/21/courses_appetizer_pastry_Sweet_Dinner_Rolls_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/21/courses_appetizer_pastry_Sweet_Dinner_Rolls_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/21/courses_appetizer_pastry_Sweet_Dinner_Rolls_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/21/courses_appetizer_pastry_Sweet_Dinner_Rolls_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/21/courses_appetizer_pastry_Sweet_Dinner_Rolls_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/21/courses_appetizer_pastry_Sweet_Dinner_Rolls_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/21/courses_appetizer_pastry_Sweet_Dinner_Rolls_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/21/courses_appetizer_pastry_Sweet_Dinner_Rolls_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/21/courses_appetizer_pastry_Sweet_Dinner_Rolls_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/21/courses_appetizer_pastry_Sweet_Dinner_Rolls_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/21/courses_appetizer_pastry_Sweet_Dinner_Rolls_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Churros")) {
			// Action Bar Text
			setTitle("Churros");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/22/courses_appetizer_pastry_Churros_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/22/courses_appetizer_pastry_Churros_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/22/courses_appetizer_pastry_Churros_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/22/courses_appetizer_pastry_Churros_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/22/courses_appetizer_pastry_Churros_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/22/courses_appetizer_pastry_Churros_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/22/courses_appetizer_pastry_Churros_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/22/courses_appetizer_pastry_Churros_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/22/courses_appetizer_pastry_Churros_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/22/courses_appetizer_pastry_Churros_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/22/courses_appetizer_pastry_Churros_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/22/courses_appetizer_pastry_Churros_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/22/courses_appetizer_pastry_Churros_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/22/courses_appetizer_pastry_Churros_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Cinnamon Rolls")) {
			// Action Bar Text
			setTitle("Cinnamon Rolls");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/23/courses_appetizer_pastry_Cinnamon_Rolls_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/23/courses_appetizer_pastry_Cinnamon_Rolls_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/23/courses_appetizer_pastry_Cinnamon_Rolls_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/23/courses_appetizer_pastry_Cinnamon_Rolls_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/23/courses_appetizer_pastry_Cinnamon_Rolls_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/23/courses_appetizer_pastry_Cinnamon_Rolls_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/23/courses_appetizer_pastry_Cinnamon_Rolls_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/23/courses_appetizer_pastry_Cinnamon_Rolls_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/23/courses_appetizer_pastry_Cinnamon_Rolls_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/23/courses_appetizer_pastry_Cinnamon_Rolls_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/23/courses_appetizer_pastry_Cinnamon_Rolls_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/23/courses_appetizer_pastry_Cinnamon_Rolls_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/23/courses_appetizer_pastry_Cinnamon_Rolls_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/23/courses_appetizer_pastry_Cinnamon_Rolls_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Danish Kringle")) {
			// Action Bar Text
			setTitle("Danish Kringle");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/24/courses_appetizer_pastry_Danish_Kringle_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/24/courses_appetizer_pastry_Danish_Kringle_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/24/courses_appetizer_pastry_Danish_Kringle_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/24/courses_appetizer_pastry_Danish_Kringle_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/24/courses_appetizer_pastry_Danish_Kringle_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/24/courses_appetizer_pastry_Danish_Kringle_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/24/courses_appetizer_pastry_Danish_Kringle_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/24/courses_appetizer_pastry_Danish_Kringle_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/24/courses_appetizer_pastry_Danish_Kringle_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/24/courses_appetizer_pastry_Danish_Kringle_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/24/courses_appetizer_pastry_Danish_Kringle_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/24/courses_appetizer_pastry_Danish_Kringle_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/24/courses_appetizer_pastry_Danish_Kringle_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/24/courses_appetizer_pastry_Danish_Kringle_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Blueberry Turnovers")) {
			// Action Bar Text
			setTitle("Blueberry Turnovers");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/25/courses_appetizer_pastry_Blueberry_Turnovers_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/25/courses_appetizer_pastry_Blueberry_Turnovers_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/25/courses_appetizer_pastry_Blueberry_Turnovers_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/25/courses_appetizer_pastry_Blueberry_Turnovers_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/25/courses_appetizer_pastry_Blueberry_Turnovers_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/25/courses_appetizer_pastry_Blueberry_Turnovers_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/25/courses_appetizer_pastry_Blueberry_Turnovers_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/25/courses_appetizer_pastry_Blueberry_Turnovers_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/25/courses_appetizer_pastry_Blueberry_Turnovers_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/25/courses_appetizer_pastry_Blueberry_Turnovers_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/25/courses_appetizer_pastry_Blueberry_Turnovers_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/25/courses_appetizer_pastry_Blueberry_Turnovers_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/25/courses_appetizer_pastry_Blueberry_Turnovers_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/25/courses_appetizer_pastry_Blueberry_Turnovers_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Land of Nod Cinnamon Buns")) {
			// Action Bar Text
			setTitle("Land of Nod Cinnamon Buns");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/26/courses_appetizer_pastry_Land_ofNod_Cinnamon_Buns_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/26/courses_appetizer_pastry_Land_ofNod_Cinnamon_Buns_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/26/courses_appetizer_pastry_Land_ofNod_Cinnamon_Buns_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/26/courses_appetizer_pastry_Land_ofNod_Cinnamon_Buns_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/26/courses_appetizer_pastry_Land_ofNod_Cinnamon_Buns_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/26/courses_appetizer_pastry_Land_ofNod_Cinnamon_Buns_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/26/courses_appetizer_pastry_Land_ofNod_Cinnamon_Buns_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/26/courses_appetizer_pastry_Land_ofNod_Cinnamon_Buns_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/26/courses_appetizer_pastry_Land_ofNod_Cinnamon_Buns_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/26/courses_appetizer_pastry_Land_ofNod_Cinnamon_Buns_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/26/courses_appetizer_pastry_Land_ofNod_Cinnamon_Buns_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/26/courses_appetizer_pastry_Land_ofNod_Cinnamon_Buns_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/26/courses_appetizer_pastry_Land_ofNod_Cinnamon_Buns_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/26/courses_appetizer_pastry_Land_ofNod_Cinnamon_Buns_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Easy Apple Strudel")) {
			// Action Bar Text
			setTitle("Easy Apple Strudel");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/27/courses_appetizer_pastry_Easy_Apple_Strudel_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/27/courses_appetizer_pastry_Easy_Apple_Strudel_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/27/courses_appetizer_pastry_Easy_Apple_Strudel_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/27/courses_appetizer_pastry_Easy_Apple_Strudel_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/27/courses_appetizer_pastry_Easy_Apple_Strudel_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/27/courses_appetizer_pastry_Easy_Apple_Strudel_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/27/courses_appetizer_pastry_Easy_Apple_Strudel_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/27/courses_appetizer_pastry_Easy_Apple_Strudel_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/27/courses_appetizer_pastry_Easy_Apple_Strudel_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/27/courses_appetizer_pastry_Easy_Apple_Strudel_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/27/courses_appetizer_pastry_Easy_Apple_Strudel_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/27/courses_appetizer_pastry_Easy_Apple_Strudel_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/27/courses_appetizer_pastry_Easy_Apple_Strudel_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/27/courses_appetizer_pastry_Easy_Apple_Strudel_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Ranch Oyster Crackers")) {
			// Action Bar Text
			setTitle("Ranch Oyster Crackers");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/32/courses_appetizer_Crackers_Ranch_Oyster_Crackers_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/32/courses_appetizer_Crackers_Ranch_Oyster_Crackers_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/32/courses_appetizer_Crackers_Ranch_Oyster_Crackers_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/32/courses_appetizer_Crackers_Ranch_Oyster_Crackers_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/32/courses_appetizer_Crackers_Ranch_Oyster_Crackers_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/32/courses_appetizer_Crackers_Ranch_Oyster_Crackers_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/32/courses_appetizer_Crackers_Ranch_Oyster_Crackers_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/32/courses_appetizer_Crackers_Ranch_Oyster_Crackers_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/32/courses_appetizer_Crackers_Ranch_Oyster_Crackers_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/32/courses_appetizer_Crackers_Ranch_Oyster_Crackers_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/32/courses_appetizer_Crackers_Ranch_Oyster_Crackers_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/32/courses_appetizer_Crackers_Ranch_Oyster_Crackers_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/32/courses_appetizer_Crackers_Ranch_Oyster_Crackers_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/32/courses_appetizer_Crackers_Ranch_Oyster_Crackers_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Wheat Crackers")) {
			// Action Bar Text
			setTitle("Wheat Crackers");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/33/courses_appetizer_Crackers_Wheat_Crackers_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/33/courses_appetizer_Crackers_Wheat_Crackers_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/33/courses_appetizer_Crackers_Wheat_Crackers_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/33/courses_appetizer_Crackers_Wheat_Crackers_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/33/courses_appetizer_Crackers_Wheat_Crackers_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/33/courses_appetizer_Crackers_Wheat_Crackers_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/33/courses_appetizer_Crackers_Wheat_Crackers_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/33/courses_appetizer_Crackers_Wheat_Crackers_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/33/courses_appetizer_Crackers_Wheat_Crackers_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/33/courses_appetizer_Crackers_Wheat_Crackers_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/33/courses_appetizer_Crackers_Wheat_Crackers_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/33/courses_appetizer_Crackers_Wheat_Crackers_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/33/courses_appetizer_Crackers_Wheat_Crackers_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/33/courses_appetizer_Crackers_Wheat_Crackers_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Alabama Fire Crackers")) {
			// Action Bar Text
			setTitle("Alabama Fire Crackers");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/34/courses_appetizer_Crackers_Alabama_Fire_Crackers_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/34/courses_appetizer_Crackers_Alabama_Fire_Crackers_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/34/courses_appetizer_Crackers_Alabama_Fire_Crackers_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/34/courses_appetizer_Crackers_Alabama_Fire_Crackers_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/34/courses_appetizer_Crackers_Alabama_Fire_Crackers_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/34/courses_appetizer_Crackers_Alabama_Fire_Crackers_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/34/courses_appetizer_Crackers_Alabama_Fire_Crackers_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/34/courses_appetizer_Crackers_Alabama_Fire_Crackers_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/34/courses_appetizer_Crackers_Alabama_Fire_Crackers_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/34/courses_appetizer_Crackers_Alabama_Fire_Crackers_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/34/courses_appetizer_Crackers_Alabama_Fire_Crackers_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/34/courses_appetizer_Crackers_Alabama_Fire_Crackers_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/34/courses_appetizer_Crackers_Alabama_Fire_Crackers_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/34/courses_appetizer_Crackers_Alabama_Fire_Crackers_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Ranch Style Oyster Crackers")) {
			// Action Bar Text
			setTitle("Ranch Style Oyster Crackers");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/35/courses_appetizer_Crackers_Ranch_Style_Oyster_Crackers_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/35/courses_appetizer_Crackers_Ranch_Style_Oyster_Crackers_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/35/courses_appetizer_Crackers_Ranch_Style_Oyster_Crackers_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/35/courses_appetizer_Crackers_Ranch_Style_Oyster_Crackers_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/35/courses_appetizer_Crackers_Ranch_Style_Oyster_Crackers_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/35/courses_appetizer_Crackers_Ranch_Style_Oyster_Crackers_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/35/courses_appetizer_Crackers_Ranch_Style_Oyster_Crackers_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/35/courses_appetizer_Crackers_Ranch_Style_Oyster_Crackers_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/35/courses_appetizer_Crackers_Ranch_Style_Oyster_Crackers_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/35/courses_appetizer_Crackers_Ranch_Style_Oyster_Crackers_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/35/courses_appetizer_Crackers_Ranch_Style_Oyster_Crackers_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/35/courses_appetizer_Crackers_Ranch_Style_Oyster_Crackers_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/35/courses_appetizer_Crackers_Ranch_Style_Oyster_Crackers_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/35/courses_appetizer_Crackers_Ranch_Style_Oyster_Crackers_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Bacon Crackers")) {
			// Action Bar Text
			setTitle("Bacon Crackers");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/36/courses_appetizer_Crackers_Bacon_Crackers_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/36/courses_appetizer_Crackers_Bacon_Crackers_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/36/courses_appetizer_Crackers_Bacon_Crackers_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/36/courses_appetizer_Crackers_Bacon_Crackers_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/36/courses_appetizer_Crackers_Bacon_Crackers_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/36/courses_appetizer_Crackers_Bacon_Crackers_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/36/courses_appetizer_Crackers_Bacon_Crackers_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/36/courses_appetizer_Crackers_Bacon_Crackers_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/36/courses_appetizer_Crackers_Bacon_Crackers_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/36/courses_appetizer_Crackers_Bacon_Crackers_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/36/courses_appetizer_Crackers_Bacon_Crackers_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/36/courses_appetizer_Crackers_Bacon_Crackers_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/36/courses_appetizer_Crackers_Bacon_Crackers_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/36/courses_appetizer_Crackers_Bacon_Crackers_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Crackers a la Yvette")) {
			// Action Bar Text
			setTitle("Crackers a la Yvette");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/37/courses_appetizer_Crackers_Crackers_a_la_Yvette_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/37/courses_appetizer_Crackers_Crackers_a_la_Yvette_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/37/courses_appetizer_Crackers_Crackers_a_la_Yvette_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/37/courses_appetizer_Crackers_Crackers_a_la_Yvette_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/37/courses_appetizer_Crackers_Crackers_a_la_Yvette_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/37/courses_appetizer_Crackers_Crackers_a_la_Yvette_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/37/courses_appetizer_Crackers_Crackers_a_la_Yvette_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/37/courses_appetizer_Crackers_Crackers_a_la_Yvette_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/37/courses_appetizer_Crackers_Crackers_a_la_Yvette_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/37/courses_appetizer_Crackers_Crackers_a_la_Yvette_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/37/courses_appetizer_Crackers_Crackers_a_la_Yvette_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/37/courses_appetizer_Crackers_Crackers_a_la_Yvette_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/37/courses_appetizer_Crackers_Crackers_a_la_Yvette_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/37/courses_appetizer_Crackers_Crackers_a_la_Yvette_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Seasoned Crackers")) {
			// Action Bar Text
			setTitle("Seasoned Crackers");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/38/courses_appetizer_Crackers_Seasoned_Crackers_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/38/courses_appetizer_Crackers_Seasoned_Crackers_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/38/courses_appetizer_Crackers_Seasoned_Crackers_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/38/courses_appetizer_Crackers_Seasoned_Crackers_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/38/courses_appetizer_Crackers_Seasoned_Crackers_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/38/courses_appetizer_Crackers_Seasoned_Crackers_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/38/courses_appetizer_Crackers_Seasoned_Crackers_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/38/courses_appetizer_Crackers_Seasoned_Crackers_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/38/courses_appetizer_Crackers_Seasoned_Crackers_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/38/courses_appetizer_Crackers_Seasoned_Crackers_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/38/courses_appetizer_Crackers_Seasoned_Crackers_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/38/courses_appetizer_Crackers_Seasoned_Crackers_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/38/courses_appetizer_Crackers_Seasoned_Crackers_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/38/courses_appetizer_Crackers_Seasoned_Crackers_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Cheddar Pennies")) {
			// Action Bar Text
			setTitle("Cheddar Pennies");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/39/courses_appetizer_Crackers_Cheddar_Pennies_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/39/courses_appetizer_Crackers_Cheddar_Pennies_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/39/courses_appetizer_Crackers_Cheddar_Pennies_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/39/courses_appetizer_Crackers_Cheddar_Pennies_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/39/courses_appetizer_Crackers_Cheddar_Pennies_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/39/courses_appetizer_Crackers_Cheddar_Pennies_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/39/courses_appetizer_Crackers_Cheddar_Pennies_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/39/courses_appetizer_Crackers_Cheddar_Pennies_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/39/courses_appetizer_Crackers_Cheddar_Pennies_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/39/courses_appetizer_Crackers_Cheddar_Pennies_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/39/courses_appetizer_Crackers_Cheddar_Pennies_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/39/courses_appetizer_Crackers_Cheddar_Pennies_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/39/courses_appetizer_Crackers_Cheddar_Pennies_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/39/courses_appetizer_Crackers_Cheddar_Pennies_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Cheddar Crackers")) {
			// Action Bar Text
			setTitle("Cheddar Crackers");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/40/courses_appetizer_Crackers_Cheddar_Crackers_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/40/courses_appetizer_Crackers_Cheddar_Crackers_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/40/courses_appetizer_Crackers_Cheddar_Crackers_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/40/courses_appetizer_Crackers_Cheddar_Crackers_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/40/courses_appetizer_Crackers_Cheddar_Crackers_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/40/courses_appetizer_Crackers_Cheddar_Crackers_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/40/courses_appetizer_Crackers_Cheddar_Crackers_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/40/courses_appetizer_Crackers_Cheddar_Crackers_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/40/courses_appetizer_Crackers_Cheddar_Crackers_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/40/courses_appetizer_Crackers_Cheddar_Crackers_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/40/courses_appetizer_Crackers_Cheddar_Crackers_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/40/courses_appetizer_Crackers_Cheddar_Crackers_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/40/courses_appetizer_Crackers_Cheddar_Crackers_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/40/courses_appetizer_Crackers_Cheddar_Crackers_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Seasoned Oyester Crackers")) {
			// Action Bar Text
			setTitle("Seasoned Oyester Crackers");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/41/courses_appetizer_Crackers_Seasoned_Oyster_Crackers_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/41/courses_appetizer_Crackers_Seasoned_Oyster_Crackers_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/41/courses_appetizer_Crackers_Seasoned_Oyster_Crackers_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/41/courses_appetizer_Crackers_Seasoned_Oyster_Crackers_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/41/courses_appetizer_Crackers_Seasoned_Oyster_Crackers_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/41/courses_appetizer_Crackers_Seasoned_Oyster_Crackers_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/41/courses_appetizer_Crackers_Seasoned_Oyster_Crackers_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/41/courses_appetizer_Crackers_Seasoned_Oyster_Crackers_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/41/courses_appetizer_Crackers_Seasoned_Oyster_Crackers_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/41/courses_appetizer_Crackers_Seasoned_Oyster_Crackers_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/41/courses_appetizer_Crackers_Seasoned_Oyster_Crackers_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/41/courses_appetizer_Crackers_Seasoned_Oyster_Crackers_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/41/courses_appetizer_Crackers_Seasoned_Oyster_Crackers_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/41/courses_appetizer_Crackers_Seasoned_Oyster_Crackers_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Cheddar Pecan Wafers")) {
			// Action Bar Text
			setTitle("Cheddar Pecan Wafers");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/42/courses_appetizer_Crackers_Cheddar_Pecan_Wafers_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/42/courses_appetizer_Crackers_Cheddar_Pecan_Wafers_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/42/courses_appetizer_Crackers_Cheddar_Pecan_Wafers_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/42/courses_appetizer_Crackers_Cheddar_Pecan_Wafers_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/42/courses_appetizer_Crackers_Cheddar_Pecan_Wafers_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/42/courses_appetizer_Crackers_Cheddar_Pecan_Wafers_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/42/courses_appetizer_Crackers_Cheddar_Pecan_Wafers_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/42/courses_appetizer_Crackers_Cheddar_Pecan_Wafers_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/42/courses_appetizer_Crackers_Cheddar_Pecan_Wafers_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/42/courses_appetizer_Crackers_Cheddar_Pecan_Wafers_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/42/courses_appetizer_Crackers_Cheddar_Pecan_Wafers_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/42/courses_appetizer_Crackers_Cheddar_Pecan_Wafers_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/42/courses_appetizer_Crackers_Cheddar_Pecan_Wafers_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/42/courses_appetizer_Crackers_Cheddar_Pecan_Wafers_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Cheese Crackers")) {
			// Action Bar Text
			setTitle("Cheese Crackers");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/43/courses_appetizer_Crackers_Cheese_Crackers_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/43/courses_appetizer_Crackers_Cheese_Crackers_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/43/courses_appetizer_Crackers_Cheese_Crackers_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/43/courses_appetizer_Crackers_Cheese_Crackers_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/43/courses_appetizer_Crackers_Cheese_Crackers_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/43/courses_appetizer_Crackers_Cheese_Crackers_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/43/courses_appetizer_Crackers_Cheese_Crackers_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/43/courses_appetizer_Crackers_Cheese_Crackers_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/43/courses_appetizer_Crackers_Cheese_Crackers_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/43/courses_appetizer_Crackers_Cheese_Crackers_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/43/courses_appetizer_Crackers_Cheese_Crackers_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/43/courses_appetizer_Crackers_Cheese_Crackers_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/43/courses_appetizer_Crackers_Cheese_Crackers_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/43/courses_appetizer_Crackers_Cheese_Crackers_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Firecracker Crackers")) {
			// Action Bar Text
			setTitle("Firecracker Crackers");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/44/courses_appetizer_Crackers_Firecracker_Crackers_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/44/courses_appetizer_Crackers_Firecracker_Crackers_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/44/courses_appetizer_Crackers_Firecracker_Crackers_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/44/courses_appetizer_Crackers_Firecracker_Crackers_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/44/courses_appetizer_Crackers_Firecracker_Crackers_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/44/courses_appetizer_Crackers_Firecracker_Crackers_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/44/courses_appetizer_Crackers_Firecracker_Crackers_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/44/courses_appetizer_Crackers_Firecracker_Crackers_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/44/courses_appetizer_Crackers_Firecracker_Crackers_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/44/courses_appetizer_Crackers_Firecracker_Crackers_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/44/courses_appetizer_Crackers_Firecracker_Crackers_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/44/courses_appetizer_Crackers_Firecracker_Crackers_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/44/courses_appetizer_Crackers_Firecracker_Crackers_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/44/courses_appetizer_Crackers_Firecracker_Crackers_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Herb Oyster Crackers")) {
			// Action Bar Text
			setTitle("Herb Oyster Crackers");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/45/courses_appetizer_Crackers_Herb_Oyster_Crackers_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/45/courses_appetizer_Crackers_Herb_Oyster_Crackers_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/45/courses_appetizer_Crackers_Herb_Oyster_Crackers_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/45/courses_appetizer_Crackers_Herb_Oyster_Crackers_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/45/courses_appetizer_Crackers_Herb_Oyster_Crackers_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/45/courses_appetizer_Crackers_Herb_Oyster_Crackers_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/45/courses_appetizer_Crackers_Herb_Oyster_Crackers_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/45/courses_appetizer_Crackers_Herb_Oyster_Crackers_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/45/courses_appetizer_Crackers_Herb_Oyster_Crackers_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/45/courses_appetizer_Crackers_Herb_Oyster_Crackers_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/45/courses_appetizer_Crackers_Herb_Oyster_Crackers_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/45/courses_appetizer_Crackers_Herb_Oyster_Crackers_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/45/courses_appetizer_Crackers_Herb_Oyster_Crackers_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/45/courses_appetizer_Crackers_Herb_Oyster_Crackers_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Mojito")) {
			// Action Bar Text
			setTitle("Mojito");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/46/courses_drink_cocktails_Mojito_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/46/courses_drink_cocktails_Mojito_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/46/courses_drink_cocktails_Mojito_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/46/courses_drink_cocktails_Mojito_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/46/courses_drink_cocktails_Mojito_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/46/courses_drink_cocktails_Mojito_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/46/courses_drink_cocktails_Mojito_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/46/courses_drink_cocktails_Mojito_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/46/courses_drink_cocktails_Mojito_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/46/courses_drink_cocktails_Mojito_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/46/courses_drink_cocktails_Mojito_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/46/courses_drink_cocktails_Mojito_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/46/courses_drink_cocktails_Mojito_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/46/courses_drink_cocktails_Mojito_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Tanning Bed Drink")) {
			// Action Bar Text
			setTitle("Tanning Bed Drink");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/47/courses_drink_cocktails_Tanning_Bed_Drink_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/47/courses_drink_cocktails_Tanning_Bed_Drink_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/47/courses_drink_cocktails_Tanning_Bed_Drink_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/47/courses_drink_cocktails_Tanning_Bed_Drink_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/47/courses_drink_cocktails_Tanning_Bed_Drink_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/47/courses_drink_cocktails_Tanning_Bed_Drink_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/47/courses_drink_cocktails_Tanning_Bed_Drink_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/47/courses_drink_cocktails_Tanning_Bed_Drink_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/47/courses_drink_cocktails_Tanning_Bed_Drink_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/47/courses_drink_cocktails_Tanning_Bed_Drink_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/47/courses_drink_cocktails_Tanning_Bed_Drink_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/47/courses_drink_cocktails_Tanning_Bed_Drink_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/47/courses_drink_cocktails_Tanning_Bed_Drink_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/47/courses_drink_cocktails_Tanning_Bed_Drink_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Easy Frozen Margaritas")) {
			// Action Bar Text
			setTitle("Easy Frozen Margaritas");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/48/courses_drink_cocktails_Easy_Frozen_Margaritas_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/48/courses_drink_cocktails_Easy_Frozen_Margaritas_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/48/courses_drink_cocktails_Easy_Frozen_Margaritas_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/48/courses_drink_cocktails_Easy_Frozen_Margaritas_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/48/courses_drink_cocktails_Easy_Frozen_Margaritas_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/48/courses_drink_cocktails_Easy_Frozen_Margaritas_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/48/courses_drink_cocktails_Easy_Frozen_Margaritas_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/48/courses_drink_cocktails_Easy_Frozen_Margaritas_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/48/courses_drink_cocktails_Easy_Frozen_Margaritas_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/48/courses_drink_cocktails_Easy_Frozen_Margaritas_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/48/courses_drink_cocktails_Easy_Frozen_Margaritas_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/48/courses_drink_cocktails_Easy_Frozen_Margaritas_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/48/courses_drink_cocktails_Easy_Frozen_Margaritas_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/48/courses_drink_cocktails_Easy_Frozen_Margaritas_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Cranberry Martini")) {
			// Action Bar Text
			setTitle("Cranberry Martini");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/49/courses_drink_cocktails_Cranberry_Martini_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/49/courses_drink_cocktails_Cranberry_Martini_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/49/courses_drink_cocktails_Cranberry_Martini_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/49/courses_drink_cocktails_Cranberry_Martini_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/49/courses_drink_cocktails_Cranberry_Martini_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/49/courses_drink_cocktails_Cranberry_Martini_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/49/courses_drink_cocktails_Cranberry_Martini_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/49/courses_drink_cocktails_Cranberry_Martini_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/49/courses_drink_cocktails_Cranberry_Martini_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/49/courses_drink_cocktails_Cranberry_Martini_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/49/courses_drink_cocktails_Cranberry_Martini_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/49/courses_drink_cocktails_Cranberry_Martini_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/49/courses_drink_cocktails_Cranberry_Martini_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/49/courses_drink_cocktails_Cranberry_Martini_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Tainted Fruit Shots")) {
			// Action Bar Text
			setTitle("Tainted Fruit Shots");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/50/courses_drink_cocktails_Tainted_Fruit_Shots_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/50/courses_drink_cocktails_Tainted_Fruit_Shots_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/50/courses_drink_cocktails_Tainted_Fruit_Shots_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/50/courses_drink_cocktails_Tainted_Fruit_Shots_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/50/courses_drink_cocktails_Tainted_Fruit_Shots_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/50/courses_drink_cocktails_Tainted_Fruit_Shots_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/50/courses_drink_cocktails_Tainted_Fruit_Shots_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/50/courses_drink_cocktails_Tainted_Fruit_Shots_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/50/courses_drink_cocktails_Tainted_Fruit_Shots_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/50/courses_drink_cocktails_Tainted_Fruit_Shots_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/50/courses_drink_cocktails_Tainted_Fruit_Shots_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/50/courses_drink_cocktails_Tainted_Fruit_Shots_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/50/courses_drink_cocktails_Tainted_Fruit_Shots_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/50/courses_drink_cocktails_Tainted_Fruit_Shots_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Dirty Martini")) {
			// Action Bar Text
			setTitle("Dirty Martini");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/51/courses_drink_cocktails_Dirty_Martini_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/51/courses_drink_cocktails_Dirty_Martini_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/51/courses_drink_cocktails_Dirty_Martini_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/51/courses_drink_cocktails_Dirty_Martini_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/51/courses_drink_cocktails_Dirty_Martini_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/51/courses_drink_cocktails_Dirty_Martini_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/51/courses_drink_cocktails_Dirty_Martini_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/51/courses_drink_cocktails_Dirty_Martini_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/51/courses_drink_cocktails_Dirty_Martini_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/51/courses_drink_cocktails_Dirty_Martini_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/51/courses_drink_cocktails_Dirty_Martini_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/51/courses_drink_cocktails_Dirty_Martini_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/51/courses_drink_cocktails_Dirty_Martini_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/51/courses_drink_cocktails_Dirty_Martini_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Lava Lamps")) {
			// Action Bar Text
			setTitle("Lava Lamps");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/52/courses_drink_cocktails_Lava_Lamps_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/52/courses_drink_cocktails_Lava_Lamps_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/52/courses_drink_cocktails_Lava_Lamps_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/52/courses_drink_cocktails_Lava_Lamps_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/52/courses_drink_cocktails_Lava_Lamps_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/52/courses_drink_cocktails_Lava_Lamps_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/52/courses_drink_cocktails_Lava_Lamps_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/52/courses_drink_cocktails_Lava_Lamps_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/52/courses_drink_cocktails_Lava_Lamps_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/52/courses_drink_cocktails_Lava_Lamps_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/52/courses_drink_cocktails_Lava_Lamps_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/52/courses_drink_cocktails_Lava_Lamps_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/52/courses_drink_cocktails_Lava_Lamps_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/52/courses_drink_cocktails_Lava_Lamps_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Bloody Mary Mix")) {
			// Action Bar Text
			setTitle("Bloody Mary Mix");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/53/courses_drink_cocktails_Bloody_Mary_Mix_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/53/courses_drink_cocktails_Bloody_Mary_Mix_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/53/courses_drink_cocktails_Bloody_Mary_Mix_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/53/courses_drink_cocktails_Bloody_Mary_Mix_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/53/courses_drink_cocktails_Bloody_Mary_Mix_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/53/courses_drink_cocktails_Bloody_Mary_Mix_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/53/courses_drink_cocktails_Bloody_Mary_Mix_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/53/courses_drink_cocktails_Bloody_Mary_Mix_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/53/courses_drink_cocktails_Bloody_Mary_Mix_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/53/courses_drink_cocktails_Bloody_Mary_Mix_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/53/courses_drink_cocktails_Bloody_Mary_Mix_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/53/courses_drink_cocktails_Bloody_Mary_Mix_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/53/courses_drink_cocktails_Bloody_Mary_Mix_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/53/courses_drink_cocktails_Bloody_Mary_Mix_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Whiskey Slush")) {
			// Action Bar Text
			setTitle("Whiskey Slush");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/54/courses_drink_cocktails_Whiskey_Slush_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/54/courses_drink_cocktails_Whiskey_Slush_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/54/courses_drink_cocktails_Whiskey_Slush_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/54/courses_drink_cocktails_Whiskey_Slush_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/54/courses_drink_cocktails_Whiskey_Slush_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/54/courses_drink_cocktails_Whiskey_Slush_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/54/courses_drink_cocktails_Whiskey_Slush_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/54/courses_drink_cocktails_Whiskey_Slush_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/54/courses_drink_cocktails_Whiskey_Slush_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/54/courses_drink_cocktails_Whiskey_Slush_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/54/courses_drink_cocktails_Whiskey_Slush_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/54/courses_drink_cocktails_Whiskey_Slush_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/54/courses_drink_cocktails_Whiskey_Slush_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/54/courses_drink_cocktails_Whiskey_Slush_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Strawberry Mojito")) {
			// Action Bar Text
			setTitle("Strawberry Mojito");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/55/courses_drink_cocktails_Strawberry_Mojito_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/55/courses_drink_cocktails_Strawberry_Mojito_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/55/courses_drink_cocktails_Strawberry_Mojito_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/55/courses_drink_cocktails_Strawberry_Mojito_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/55/courses_drink_cocktails_Strawberry_Mojito_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/55/courses_drink_cocktails_Strawberry_Mojito_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/55/courses_drink_cocktails_Strawberry_Mojito_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/55/courses_drink_cocktails_Strawberry_Mojito_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/55/courses_drink_cocktails_Strawberry_Mojito_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/55/courses_drink_cocktails_Strawberry_Mojito_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/55/courses_drink_cocktails_Strawberry_Mojito_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/55/courses_drink_cocktails_Strawberry_Mojito_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/55/courses_drink_cocktails_Strawberry_Mojito_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/55/courses_drink_cocktails_Strawberry_Mojito_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Berry Shooters")) {
			// Action Bar Text
			setTitle("Berry Shooters");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/56/courses_drink_cocktails_Berry_Shooters_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/56/courses_drink_cocktails_Berry_Shooters_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/56/courses_drink_cocktails_Berry_Shooters_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/56/courses_drink_cocktails_Berry_Shooters_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/56/courses_drink_cocktails_Berry_Shooters_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/56/courses_drink_cocktails_Berry_Shooters_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/56/courses_drink_cocktails_Berry_Shooters_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/56/courses_drink_cocktails_Berry_Shooters_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/56/courses_drink_cocktails_Berry_Shooters_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/56/courses_drink_cocktails_Berry_Shooters_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/56/courses_drink_cocktails_Berry_Shooters_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/56/courses_drink_cocktails_Berry_Shooters_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/56/courses_drink_cocktails_Berry_Shooters_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/56/courses_drink_cocktails_Berry_Shooters_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Frozen Mojito")) {
			// Action Bar Text
			setTitle("Frozen Mojito");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/57/courses_drink_cocktails_Frozen_Mojito_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/57/courses_drink_cocktails_Frozen_Mojito_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/57/courses_drink_cocktails_Frozen_Mojito_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/57/courses_drink_cocktails_Frozen_Mojito_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/57/courses_drink_cocktails_Frozen_Mojito_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/57/courses_drink_cocktails_Frozen_Mojito_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/57/courses_drink_cocktails_Frozen_Mojito_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/57/courses_drink_cocktails_Frozen_Mojito_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/57/courses_drink_cocktails_Frozen_Mojito_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/57/courses_drink_cocktails_Frozen_Mojito_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/57/courses_drink_cocktails_Frozen_Mojito_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/57/courses_drink_cocktails_Frozen_Mojito_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/57/courses_drink_cocktails_Frozen_Mojito_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/57/courses_drink_cocktails_Frozen_Mojito_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("White Russian")) {
			// Action Bar Text
			setTitle("White Russian");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/58/courses_drink_cocktails_White_Russian_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/58/courses_drink_cocktails_White_Russian_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/58/courses_drink_cocktails_White_Russian_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/58/courses_drink_cocktails_White_Russian_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/58/courses_drink_cocktails_White_Russian_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/58/courses_drink_cocktails_White_Russian_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/58/courses_drink_cocktails_White_Russian_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/58/courses_drink_cocktails_White_Russian_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/58/courses_drink_cocktails_White_Russian_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/58/courses_drink_cocktails_White_Russian_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/58/courses_drink_cocktails_White_Russian_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/58/courses_drink_cocktails_White_Russian_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/58/courses_drink_cocktails_White_Russian_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/58/courses_drink_cocktails_White_Russian_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Malibu Bay Breeze")) {
			// Action Bar Text
			setTitle("White Russian");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/59/courses_drink_cocktails_Malibu_Bay_Breeze_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/59/courses_drink_cocktails_Malibu_Bay_Breeze_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/59/courses_drink_cocktails_Malibu_Bay_Breeze_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/59/courses_drink_cocktails_Malibu_Bay_Breeze_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/59/courses_drink_cocktails_Malibu_Bay_Breeze_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/59/courses_drink_cocktails_Malibu_Bay_Breeze_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/59/courses_drink_cocktails_Malibu_Bay_Breeze_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/59/courses_drink_cocktails_Malibu_Bay_Breeze_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/59/courses_drink_cocktails_Malibu_Bay_Breeze_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/59/courses_drink_cocktails_Malibu_Bay_Breeze_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/59/courses_drink_cocktails_Malibu_Bay_Breeze_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/59/courses_drink_cocktails_Malibu_Bay_Breeze_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/59/courses_drink_cocktails_Malibu_Bay_Breeze_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/59/courses_drink_cocktails_Malibu_Bay_Breeze_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Chai Tea Mix")) {
			// Action Bar Text
			setTitle("Chai Tea Mix");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/60/courses_drink_tea_Chai_Tea_Mix_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/60/courses_drink_tea_Chai_Tea_Mix_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/60/courses_drink_tea_Chai_Tea_Mix_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/60/courses_drink_tea_Chai_Tea_Mix_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/60/courses_drink_tea_Chai_Tea_Mix_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/60/courses_drink_tea_Chai_Tea_Mix_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/60/courses_drink_tea_Chai_Tea_Mix_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/60/courses_drink_tea_Chai_Tea_Mix_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/60/courses_drink_tea_Chai_Tea_Mix_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/60/courses_drink_tea_Chai_Tea_Mix_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/60/courses_drink_tea_Chai_Tea_Mix_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/60/courses_drink_tea_Chai_Tea_Mix_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/60/courses_drink_tea_Chai_Tea_Mix_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/60/courses_drink_tea_Chai_Tea_Mix_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Smooth Sweet Tea")) {
			// Action Bar Text
			setTitle("Smooth Sweet Tea");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/61/courses_drink_tea_Smooth_Sweet_Tea_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/61/courses_drink_tea_Smooth_Sweet_Tea_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/61/courses_drink_tea_Smooth_Sweet_Tea_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/61/courses_drink_tea_Smooth_Sweet_Tea_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/61/courses_drink_tea_Smooth_Sweet_Tea_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/61/courses_drink_tea_Smooth_Sweet_Tea_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/61/courses_drink_tea_Smooth_Sweet_Tea_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/61/courses_drink_tea_Smooth_Sweet_Tea_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/61/courses_drink_tea_Smooth_Sweet_Tea_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/61/courses_drink_tea_Smooth_Sweet_Tea_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/61/courses_drink_tea_Smooth_Sweet_Tea_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/61/courses_drink_tea_Smooth_Sweet_Tea_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/61/courses_drink_tea_Smooth_Sweet_Tea_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/61/courses_drink_tea_Smooth_Sweet_Tea_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Boston Iced Tea")) {
			// Action Bar Text
			setTitle("Boston Iced Tea");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/62/courses_drink_tea_Boston_Iced_Tea_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/62/courses_drink_tea_Boston_Iced_Tea_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/62/courses_drink_tea_Boston_Iced_Tea_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/62/courses_drink_tea_Boston_Iced_Tea_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/62/courses_drink_tea_Boston_Iced_Tea_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/62/courses_drink_tea_Boston_Iced_Tea_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/62/courses_drink_tea_Boston_Iced_Tea_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/62/courses_drink_tea_Boston_Iced_Tea_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/62/courses_drink_tea_Boston_Iced_Tea_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/62/courses_drink_tea_Boston_Iced_Tea_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/62/courses_drink_tea_Boston_Iced_Tea_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/62/courses_drink_tea_Boston_Iced_Tea_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/62/courses_drink_tea_Boston_Iced_Tea_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/62/courses_drink_tea_Boston_Iced_Tea_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Coffeebar Chai")) {
			// Action Bar Text
			setTitle("Coffeebar Chai");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/63/courses_drink_tea_Coffeebar_Chai_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/63/courses_drink_tea_Coffeebar_Chai_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/63/courses_drink_tea_Coffeebar_Chai_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/63/courses_drink_tea_Coffeebar_Chai_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/63/courses_drink_tea_Coffeebar_Chai_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/63/courses_drink_tea_Coffeebar_Chai_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/63/courses_drink_tea_Coffeebar_Chai_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/63/courses_drink_tea_Coffeebar_Chai_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/63/courses_drink_tea_Coffeebar_Chai_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/63/courses_drink_tea_Coffeebar_Chai_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/63/courses_drink_tea_Coffeebar_Chai_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/63/courses_drink_tea_Coffeebar_Chai_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/63/courses_drink_tea_Coffeebar_Chai_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/63/courses_drink_tea_Coffeebar_Chai_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Mint Tea Punch")) {
			// Action Bar Text
			setTitle("Mint Tea Punch");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/64/courses_drink_tea_Mint_Tea_Punch_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/64/courses_drink_tea_Mint_Tea_Punch_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/64/courses_drink_tea_Mint_Tea_Punch_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/64/courses_drink_tea_Mint_Tea_Punch_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/64/courses_drink_tea_Mint_Tea_Punch_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/64/courses_drink_tea_Mint_Tea_Punch_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/64/courses_drink_tea_Mint_Tea_Punch_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/64/courses_drink_tea_Mint_Tea_Punch_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/64/courses_drink_tea_Mint_Tea_Punch_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/64/courses_drink_tea_Mint_Tea_Punch_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/64/courses_drink_tea_Mint_Tea_Punch_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/64/courses_drink_tea_Mint_Tea_Punch_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/64/courses_drink_tea_Mint_Tea_Punch_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/64/courses_drink_tea_Mint_Tea_Punch_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Honey Lemon Tea")) {
			// Action Bar Text
			setTitle("Honey Lemon Tea");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/65/courses_drink_tea_Honey_Lemon_Tea_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/65/courses_drink_tea_Honey_Lemon_Tea_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/65/courses_drink_tea_Honey_Lemon_Tea_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/65/courses_drink_tea_Honey_Lemon_Tea_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/65/courses_drink_tea_Honey_Lemon_Tea_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/65/courses_drink_tea_Honey_Lemon_Tea_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/65/courses_drink_tea_Honey_Lemon_Tea_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/65/courses_drink_tea_Honey_Lemon_Tea_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/65/courses_drink_tea_Honey_Lemon_Tea_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/65/courses_drink_tea_Honey_Lemon_Tea_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/65/courses_drink_tea_Honey_Lemon_Tea_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/65/courses_drink_tea_Honey_Lemon_Tea_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/65/courses_drink_tea_Honey_Lemon_Tea_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/65/courses_drink_tea_Honey_Lemon_Tea_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Russian Tea")) {
			// Action Bar Text
			setTitle("Russian Tea");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/66/courses_drink_tea_Russian_Tea_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/66/courses_drink_tea_Russian_Tea_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/66/courses_drink_tea_Russian_Tea_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/66/courses_drink_tea_Russian_Tea_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/66/courses_drink_tea_Russian_Tea_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/66/courses_drink_tea_Russian_Tea_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/66/courses_drink_tea_Russian_Tea_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/66/courses_drink_tea_Russian_Tea_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/66/courses_drink_tea_Russian_Tea_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/66/courses_drink_tea_Russian_Tea_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/66/courses_drink_tea_Russian_Tea_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/66/courses_drink_tea_Russian_Tea_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/66/courses_drink_tea_Russian_Tea_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/66/courses_drink_tea_Russian_Tea_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Sweet Lime Iced Tea")) {
			// Action Bar Text
			setTitle("Sweet Lime Iced Tea");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/67/courses_drink_tea_Sweet_Lime_Iced_Tea_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/67/courses_drink_tea_Sweet_Lime_Iced_Tea_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/67/courses_drink_tea_Sweet_Lime_Iced_Tea_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/67/courses_drink_tea_Sweet_Lime_Iced_Tea_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/67/courses_drink_tea_Sweet_Lime_Iced_Tea_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/67/courses_drink_tea_Sweet_Lime_Iced_Tea_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/67/courses_drink_tea_Sweet_Lime_Iced_Tea_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/67/courses_drink_tea_Sweet_Lime_Iced_Tea_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/67/courses_drink_tea_Sweet_Lime_Iced_Tea_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/67/courses_drink_tea_Sweet_Lime_Iced_Tea_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/67/courses_drink_tea_Sweet_Lime_Iced_Tea_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/67/courses_drink_tea_Sweet_Lime_Iced_Tea_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/67/courses_drink_tea_Sweet_Lime_Iced_Tea_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/67/courses_drink_tea_Sweet_Lime_Iced_Tea_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Hot Cranberry Tea")) {
			// Action Bar Text
			setTitle("Hot Cranberry Tea");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/68/courses_drink_tea_Hot_Cranberry_Tea_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/68/courses_drink_tea_Hot_Cranberry_Tea_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/68/courses_drink_tea_Hot_Cranberry_Tea_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/68/courses_drink_tea_Hot_Cranberry_Tea_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/68/courses_drink_tea_Hot_Cranberry_Tea_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/68/courses_drink_tea_Hot_Cranberry_Tea_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/68/courses_drink_tea_Hot_Cranberry_Tea_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/68/courses_drink_tea_Hot_Cranberry_Tea_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/68/courses_drink_tea_Hot_Cranberry_Tea_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/68/courses_drink_tea_Hot_Cranberry_Tea_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/68/courses_drink_tea_Hot_Cranberry_Tea_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/68/courses_drink_tea_Hot_Cranberry_Tea_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/68/courses_drink_tea_Hot_Cranberry_Tea_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/68/courses_drink_tea_Hot_Cranberry_Tea_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Lemonade-Mint Iced Tea")) {
			// Action Bar Text
			setTitle("Lemonade-Mint Iced Tea");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/69/courses_drink_tea_Lemonade-Mint_Iced_Tea_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/69/courses_drink_tea_Lemonade-Mint_Iced_Tea_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/69/courses_drink_tea_Lemonade-Mint_Iced_Tea_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/69/courses_drink_tea_Lemonade-Mint_Iced_Tea_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/69/courses_drink_tea_Lemonade-Mint_Iced_Tea_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/69/courses_drink_tea_Lemonade-Mint_Iced_Tea_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/69/courses_drink_tea_Lemonade-Mint_Iced_Tea_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/69/courses_drink_tea_Lemonade-Mint_Iced_Tea_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/69/courses_drink_tea_Lemonade-Mint_Iced_Tea_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/69/courses_drink_tea_Lemonade-Mint_Iced_Tea_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/69/courses_drink_tea_Lemonade-Mint_Iced_Tea_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/69/courses_drink_tea_Lemonade-Mint_Iced_Tea_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/69/courses_drink_tea_Lemonade-Mint_Iced_Tea_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/69/courses_drink_tea_Lemonade-Mint_Iced_Tea_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Spiced Tea Mix")) {
			// Action Bar Text
			setTitle("Spiced Tea Mix");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/70/courses_drink_tea_Spiced_Tea_Mix_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/70/courses_drink_tea_Spiced_Tea_Mix_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/70/courses_drink_tea_Spiced_Tea_Mix_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/70/courses_drink_tea_Spiced_Tea_Mix_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/70/courses_drink_tea_Spiced_Tea_Mix_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/70/courses_drink_tea_Spiced_Tea_Mix_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/70/courses_drink_tea_Spiced_Tea_Mix_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/70/courses_drink_tea_Spiced_Tea_Mix_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/70/courses_drink_tea_Spiced_Tea_Mix_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/70/courses_drink_tea_Spiced_Tea_Mix_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/70/courses_drink_tea_Spiced_Tea_Mix_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/70/courses_drink_tea_Spiced_Tea_Mix_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/70/courses_drink_tea_Spiced_Tea_Mix_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/70/courses_drink_tea_Spiced_Tea_Mix_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Peach Tea")) {
			// Action Bar Text
			setTitle("Peach Tea");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/71/courses_drink_tea_Peach_Tea_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/71/courses_drink_tea_Peach_Tea_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/71/courses_drink_tea_Peach_Tea_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/71/courses_drink_tea_Peach_Tea_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/71/courses_drink_tea_Peach_Tea_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/71/courses_drink_tea_Peach_Tea_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/71/courses_drink_tea_Peach_Tea_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/71/courses_drink_tea_Peach_Tea_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/71/courses_drink_tea_Peach_Tea_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/71/courses_drink_tea_Peach_Tea_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/71/courses_drink_tea_Peach_Tea_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/71/courses_drink_tea_Peach_Tea_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/71/courses_drink_tea_Peach_Tea_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/71/courses_drink_tea_Peach_Tea_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Masala Chai")) {
			// Action Bar Text
			setTitle("Masala Chai");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/72/courses_drink_tea_Masala_Chai_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/72/courses_drink_tea_Masala_Chai_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/72/courses_drink_tea_Masala_Chai_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/72/courses_drink_tea_Masala_Chai_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/72/courses_drink_tea_Masala_Chai_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/72/courses_drink_tea_Masala_Chai_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/72/courses_drink_tea_Masala_Chai_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/72/courses_drink_tea_Masala_Chai_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/72/courses_drink_tea_Masala_Chai_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/72/courses_drink_tea_Masala_Chai_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/72/courses_drink_tea_Masala_Chai_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/72/courses_drink_tea_Masala_Chai_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/72/courses_drink_tea_Masala_Chai_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/72/courses_drink_tea_Masala_Chai_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Green Tea Berry Delight")) {
			// Action Bar Text
			setTitle("Green Tea Berry Delight");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/73/courses_drink_tea_Green_Tea_Berry_Delight_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/73/courses_drink_tea_Green_Tea_Berry_Delight_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/73/courses_drink_tea_Green_Tea_Berry_Delight_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/73/courses_drink_tea_Green_Tea_Berry_Delight_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/73/courses_drink_tea_Green_Tea_Berry_Delight_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/73/courses_drink_tea_Green_Tea_Berry_Delight_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/73/courses_drink_tea_Green_Tea_Berry_Delight_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/73/courses_drink_tea_Green_Tea_Berry_Delight_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/73/courses_drink_tea_Green_Tea_Berry_Delight_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/73/courses_drink_tea_Green_Tea_Berry_Delight_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/73/courses_drink_tea_Green_Tea_Berry_Delight_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/73/courses_drink_tea_Green_Tea_Berry_Delight_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/73/courses_drink_tea_Green_Tea_Berry_Delight_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/73/courses_drink_tea_Green_Tea_Berry_Delight_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Chicken Fried Chicken")) {
			// Action Bar Text
			setTitle("Chicken Fried Chicken");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/74/courses_maindish_deepfried_Chicken_Fried_Chicken_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/74/courses_maindish_deepfried_Chicken_Fried_Chicken_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/74/courses_maindish_deepfried_Chicken_Fried_Chicken_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/74/courses_maindish_deepfried_Chicken_Fried_Chicken_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/74/courses_maindish_deepfried_Chicken_Fried_Chicken_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/74/courses_maindish_deepfried_Chicken_Fried_Chicken_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/74/courses_maindish_deepfried_Chicken_Fried_Chicken_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/74/courses_maindish_deepfried_Chicken_Fried_Chicken_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/74/courses_maindish_deepfried_Chicken_Fried_Chicken_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/74/courses_maindish_deepfried_Chicken_Fried_Chicken_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/74/courses_maindish_deepfried_Chicken_Fried_Chicken_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/74/courses_maindish_deepfried_Chicken_Fried_Chicken_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/74/courses_maindish_deepfried_Chicken_Fried_Chicken_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/74/courses_maindish_deepfried_Chicken_Fried_Chicken_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Fish Tacos")) {
			// Action Bar Text
			setTitle("Fish Tacos");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/75/courses_maindish_deepfried_Fish_Tacos_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/75/courses_maindish_deepfried_Fish_Tacos_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/75/courses_maindish_deepfried_Fish_Tacos_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/75/courses_maindish_deepfried_Fish_Tacos_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/75/courses_maindish_deepfried_Fish_Tacos_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/75/courses_maindish_deepfried_Fish_Tacos_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/75/courses_maindish_deepfried_Fish_Tacos_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/75/courses_maindish_deepfried_Fish_Tacos_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/75/courses_maindish_deepfried_Fish_Tacos_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/75/courses_maindish_deepfried_Fish_Tacos_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/75/courses_maindish_deepfried_Fish_Tacos_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/75/courses_maindish_deepfried_Fish_Tacos_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/75/courses_maindish_deepfried_Fish_Tacos_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/75/courses_maindish_deepfried_Fish_Tacos_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("The Best Chicken Fried Steak")) {
			// Action Bar Text
			setTitle("The Best Chicken Fried Steak");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/76/courses_maindish_deepfried_The_Best_Chicken_Fried_Steak_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/76/courses_maindish_deepfried_The_Best_Chicken_Fried_Steak_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/76/courses_maindish_deepfried_The_Best_Chicken_Fried_Steak_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/76/courses_maindish_deepfried_The_Best_Chicken_Fried_Steak_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/76/courses_maindish_deepfried_The_Best_Chicken_Fried_Steak_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/76/courses_maindish_deepfried_The_Best_Chicken_Fried_Steak_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/76/courses_maindish_deepfried_The_Best_Chicken_Fried_Steak_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/76/courses_maindish_deepfried_The_Best_Chicken_Fried_Steak_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/76/courses_maindish_deepfried_The_Best_Chicken_Fried_Steak_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/76/courses_maindish_deepfried_The_Best_Chicken_Fried_Steak_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/76/courses_maindish_deepfried_The_Best_Chicken_Fried_Steak_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/76/courses_maindish_deepfried_The_Best_Chicken_Fried_Steak_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/76/courses_maindish_deepfried_The_Best_Chicken_Fried_Steak_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/76/courses_maindish_deepfried_The_Best_Chicken_Fried_Steak_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Corn Dogs")) {
			// Action Bar Text
			setTitle("Corn Dogs");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/77/courses_maindish_deepfried_Corn_Dogs_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/77/courses_maindish_deepfried_Corn_Dogs_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/77/courses_maindish_deepfried_Corn_Dogs_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/77/courses_maindish_deepfried_Corn_Dogs_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/77/courses_maindish_deepfried_Corn_Dogs_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/77/courses_maindish_deepfried_Corn_Dogs_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/77/courses_maindish_deepfried_Corn_Dogs_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/77/courses_maindish_deepfried_Corn_Dogs_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/77/courses_maindish_deepfried_Corn_Dogs_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/77/courses_maindish_deepfried_Corn_Dogs_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/77/courses_maindish_deepfried_Corn_Dogs_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/77/courses_maindish_deepfried_Corn_Dogs_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/77/courses_maindish_deepfried_Corn_Dogs_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/77/courses_maindish_deepfried_Corn_Dogs_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Beer Batter Fish Made Great")) {
			// Action Bar Text
			setTitle("Beer Batter Fish Made Great");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/78/courses_maindish_deepfried_Beer_Batter_Fish_Made_Great_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/78/courses_maindish_deepfried_Beer_Batter_Fish_Made_Great_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/78/courses_maindish_deepfried_Beer_Batter_Fish_Made_Great_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/78/courses_maindish_deepfried_Beer_Batter_Fish_Made_Great_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/78/courses_maindish_deepfried_Beer_Batter_Fish_Made_Great_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/78/courses_maindish_deepfried_Beer_Batter_Fish_Made_Great_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/78/courses_maindish_deepfried_Beer_Batter_Fish_Made_Great_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/78/courses_maindish_deepfried_Beer_Batter_Fish_Made_Great_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/78/courses_maindish_deepfried_Beer_Batter_Fish_Made_Great_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/78/courses_maindish_deepfried_Beer_Batter_Fish_Made_Great_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/78/courses_maindish_deepfried_Beer_Batter_Fish_Made_Great_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/78/courses_maindish_deepfried_Beer_Batter_Fish_Made_Great_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/78/courses_maindish_deepfried_Beer_Batter_Fish_Made_Great_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/78/courses_maindish_deepfried_Beer_Batter_Fish_Made_Great_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Crispy Fried Chicken")) {
			// Action Bar Text
			setTitle("Crispy Fried Chicken");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/79/courses_maindish_deepfried_Crispy_Fried_Chicken_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/79/courses_maindish_deepfried_Crispy_Fried_Chicken_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/79/courses_maindish_deepfried_Crispy_Fried_Chicken_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/79/courses_maindish_deepfried_Crispy_Fried_Chicken_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/79/courses_maindish_deepfried_Crispy_Fried_Chicken_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/79/courses_maindish_deepfried_Crispy_Fried_Chicken_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/79/courses_maindish_deepfried_Crispy_Fried_Chicken_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/79/courses_maindish_deepfried_Crispy_Fried_Chicken_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/79/courses_maindish_deepfried_Crispy_Fried_Chicken_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/79/courses_maindish_deepfried_Crispy_Fried_Chicken_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/79/courses_maindish_deepfried_Crispy_Fried_Chicken_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/79/courses_maindish_deepfried_Crispy_Fried_Chicken_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/79/courses_maindish_deepfried_Crispy_Fried_Chicken_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/79/courses_maindish_deepfried_Crispy_Fried_Chicken_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Perfect Sesame Chicken")) {
			// Action Bar Text
			setTitle("Perfect Sesame Chicken");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/80/courses_maindish_deepfried_Perfect_Sesame_Chicken_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/80/courses_maindish_deepfried_Perfect_Sesame_Chicken_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/80/courses_maindish_deepfried_Perfect_Sesame_Chicken_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/80/courses_maindish_deepfried_Perfect_Sesame_Chicken_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/80/courses_maindish_deepfried_Perfect_Sesame_Chicken_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/80/courses_maindish_deepfried_Perfect_Sesame_Chicken_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/80/courses_maindish_deepfried_Perfect_Sesame_Chicken_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/80/courses_maindish_deepfried_Perfect_Sesame_Chicken_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/80/courses_maindish_deepfried_Perfect_Sesame_Chicken_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/80/courses_maindish_deepfried_Perfect_Sesame_Chicken_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/80/courses_maindish_deepfried_Perfect_Sesame_Chicken_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/80/courses_maindish_deepfried_Perfect_Sesame_Chicken_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/80/courses_maindish_deepfried_Perfect_Sesame_Chicken_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/80/courses_maindish_deepfried_Perfect_Sesame_Chicken_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Southern Fried Chicken")) {
			// Action Bar Text
			setTitle("Southern Fried Chicken");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/81/courses_maindish_deepfried_Southern_Fried_Chicken_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/81/courses_maindish_deepfried_Southern_Fried_Chicken_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/81/courses_maindish_deepfried_Southern_Fried_Chicken_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/81/courses_maindish_deepfried_Southern_Fried_Chicken_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/81/courses_maindish_deepfried_Southern_Fried_Chicken_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/81/courses_maindish_deepfried_Southern_Fried_Chicken_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/81/courses_maindish_deepfried_Southern_Fried_Chicken_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/81/courses_maindish_deepfried_Southern_Fried_Chicken_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/81/courses_maindish_deepfried_Southern_Fried_Chicken_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/81/courses_maindish_deepfried_Southern_Fried_Chicken_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/81/courses_maindish_deepfried_Southern_Fried_Chicken_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/81/courses_maindish_deepfried_Southern_Fried_Chicken_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/81/courses_maindish_deepfried_Southern_Fried_Chicken_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/81/courses_maindish_deepfried_Southern_Fried_Chicken_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Spicy Crispy Beef")) {
			// Action Bar Text
			setTitle("Spicy Crispy Beef");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/82/courses_maindish_deepfried_Spicy_Crispy_Beef_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/82/courses_maindish_deepfried_Spicy_Crispy_Beef_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/82/courses_maindish_deepfried_Spicy_Crispy_Beef_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/82/courses_maindish_deepfried_Spicy_Crispy_Beef_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/82/courses_maindish_deepfried_Spicy_Crispy_Beef_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/82/courses_maindish_deepfried_Spicy_Crispy_Beef_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/82/courses_maindish_deepfried_Spicy_Crispy_Beef_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/82/courses_maindish_deepfried_Spicy_Crispy_Beef_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/82/courses_maindish_deepfried_Spicy_Crispy_Beef_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/82/courses_maindish_deepfried_Spicy_Crispy_Beef_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/82/courses_maindish_deepfried_Spicy_Crispy_Beef_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/82/courses_maindish_deepfried_Spicy_Crispy_Beef_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/82/courses_maindish_deepfried_Spicy_Crispy_Beef_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/82/courses_maindish_deepfried_Spicy_Crispy_Beef_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Jeanie's Falafel")) {
			// Action Bar Text
			setTitle("Jeanie's Falafel");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/83/courses_maindish_deepfried_Jeanie's_Falafel_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/83/courses_maindish_deepfried_Jeanie's_Falafel_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/83/courses_maindish_deepfried_Jeanie's_Falafel_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/83/courses_maindish_deepfried_Jeanie's_Falafel_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/83/courses_maindish_deepfried_Jeanie's_Falafel_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/83/courses_maindish_deepfried_Jeanie's_Falafel_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/83/courses_maindish_deepfried_Jeanie's_Falafel_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/83/courses_maindish_deepfried_Jeanie's_Falafel_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/83/courses_maindish_deepfried_Jeanie's_Falafel_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/83/courses_maindish_deepfried_Jeanie's_Falafel_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/83/courses_maindish_deepfried_Jeanie's_Falafel_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/83/courses_maindish_deepfried_Jeanie's_Falafel_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/83/courses_maindish_deepfried_Jeanie's_Falafel_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/83/courses_maindish_deepfried_Jeanie's_Falafel_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Fried Butterflied Shrimp")) {
			// Action Bar Text
			setTitle("Fried Butterflied Shrimp");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/84/courses_maindish_deepfried_Fried_Butterflied_Shrimp_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/84/courses_maindish_deepfried_Fried_Butterflied_Shrimp_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/84/courses_maindish_deepfried_Fried_Butterflied_Shrimp_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/84/courses_maindish_deepfried_Fried_Butterflied_Shrimp_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/84/courses_maindish_deepfried_Fried_Butterflied_Shrimp_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/84/courses_maindish_deepfried_Fried_Butterflied_Shrimp_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/84/courses_maindish_deepfried_Fried_Butterflied_Shrimp_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/84/courses_maindish_deepfried_Fried_Butterflied_Shrimp_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/84/courses_maindish_deepfried_Fried_Butterflied_Shrimp_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/84/courses_maindish_deepfried_Fried_Butterflied_Shrimp_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/84/courses_maindish_deepfried_Fried_Butterflied_Shrimp_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/84/courses_maindish_deepfried_Fried_Butterflied_Shrimp_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/84/courses_maindish_deepfried_Fried_Butterflied_Shrimp_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/84/courses_maindish_deepfried_Fried_Butterflied_Shrimp_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Holiday Chicken Salad")) {
			// Action Bar Text
			setTitle("Holiday Chicken Salad");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/85/courses_salad_chickensalad_Holiday_Chicken_Salad_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/85/courses_salad_chickensalad_Holiday_Chicken_Salad_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/85/courses_salad_chickensalad_Holiday_Chicken_Salad_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/85/courses_salad_chickensalad_Holiday_Chicken_Salad_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/85/courses_salad_chickensalad_Holiday_Chicken_Salad_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/85/courses_salad_chickensalad_Holiday_Chicken_Salad_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/85/courses_salad_chickensalad_Holiday_Chicken_Salad_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/85/courses_salad_chickensalad_Holiday_Chicken_Salad_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/85/courses_salad_chickensalad_Holiday_Chicken_Salad_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/85/courses_salad_chickensalad_Holiday_Chicken_Salad_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/85/courses_salad_chickensalad_Holiday_Chicken_Salad_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/85/courses_salad_chickensalad_Holiday_Chicken_Salad_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/85/courses_salad_chickensalad_Holiday_Chicken_Salad_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/85/courses_salad_chickensalad_Holiday_Chicken_Salad_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Sesame Pasta Chicken Salad")) {
			// Action Bar Text
			setTitle("Sesame Pasta Chicken Salad");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/86/courses_salad_chickensalad_Sesame_Pasta_Chicken_Salad_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/86/courses_salad_chickensalad_Sesame_Pasta_Chicken_Salad_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/86/courses_salad_chickensalad_Sesame_Pasta_Chicken_Salad_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/86/courses_salad_chickensalad_Sesame_Pasta_Chicken_Salad_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/86/courses_salad_chickensalad_Sesame_Pasta_Chicken_Salad_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/86/courses_salad_chickensalad_Sesame_Pasta_Chicken_Salad_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/86/courses_salad_chickensalad_Sesame_Pasta_Chicken_Salad_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/86/courses_salad_chickensalad_Sesame_Pasta_Chicken_Salad_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/86/courses_salad_chickensalad_Sesame_Pasta_Chicken_Salad_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/86/courses_salad_chickensalad_Sesame_Pasta_Chicken_Salad_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/86/courses_salad_chickensalad_Sesame_Pasta_Chicken_Salad_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/86/courses_salad_chickensalad_Sesame_Pasta_Chicken_Salad_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/86/courses_salad_chickensalad_Sesame_Pasta_Chicken_Salad_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/86/courses_salad_chickensalad_Sesame_Pasta_Chicken_Salad_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Becky's Chicken Salad")) {
			// Action Bar Text
			setTitle("Becky's Chicken Salad");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/87/courses_salad_chickensalad_Becky's_Chicken_Salad_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/87/courses_salad_chickensalad_Becky's_Chicken_Salad_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/87/courses_salad_chickensalad_Becky's_Chicken_Salad_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/87/courses_salad_chickensalad_Becky's_Chicken_Salad_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/87/courses_salad_chickensalad_Becky's_Chicken_Salad_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/87/courses_salad_chickensalad_Becky's_Chicken_Salad_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/87/courses_salad_chickensalad_Becky's_Chicken_Salad_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/87/courses_salad_chickensalad_Becky's_Chicken_Salad_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/87/courses_salad_chickensalad_Becky's_Chicken_Salad_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/87/courses_salad_chickensalad_Becky's_Chicken_Salad_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/87/courses_salad_chickensalad_Becky's_Chicken_Salad_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/87/courses_salad_chickensalad_Becky's_Chicken_Salad_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/87/courses_salad_chickensalad_Becky's_Chicken_Salad_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/87/courses_salad_chickensalad_Becky's_Chicken_Salad_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Fruity Curry Chicken Salad")) {
			// Action Bar Text
			setTitle("Fruity Curry Chicken Salad");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/88/courses_salad_chickensalad_Fruity_Curry_Chicken_Salad_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/88/courses_salad_chickensalad_Fruity_Curry_Chicken_Salad_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/88/courses_salad_chickensalad_Fruity_Curry_Chicken_Salad_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/88/courses_salad_chickensalad_Fruity_Curry_Chicken_Salad_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/88/courses_salad_chickensalad_Fruity_Curry_Chicken_Salad_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/88/courses_salad_chickensalad_Fruity_Curry_Chicken_Salad_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/88/courses_salad_chickensalad_Fruity_Curry_Chicken_Salad_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/88/courses_salad_chickensalad_Fruity_Curry_Chicken_Salad_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/88/courses_salad_chickensalad_Fruity_Curry_Chicken_Salad_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/88/courses_salad_chickensalad_Fruity_Curry_Chicken_Salad_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/88/courses_salad_chickensalad_Fruity_Curry_Chicken_Salad_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/88/courses_salad_chickensalad_Fruity_Curry_Chicken_Salad_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/88/courses_salad_chickensalad_Fruity_Curry_Chicken_Salad_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/88/courses_salad_chickensalad_Fruity_Curry_Chicken_Salad_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Carol's Chicken Salad")) {
			// Action Bar Text
			setTitle("Carol's Chicken Salad");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/89/courses_salad_chickensalad_Carol's_Chicken_Salad_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/89/courses_salad_chickensalad_Carol's_Chicken_Salad_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/89/courses_salad_chickensalad_Carol's_Chicken_Salad_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/89/courses_salad_chickensalad_Carol's_Chicken_Salad_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/89/courses_salad_chickensalad_Carol's_Chicken_Salad_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/89/courses_salad_chickensalad_Carol's_Chicken_Salad_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/89/courses_salad_chickensalad_Carol's_Chicken_Salad_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/89/courses_salad_chickensalad_Carol's_Chicken_Salad_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/89/courses_salad_chickensalad_Carol's_Chicken_Salad_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/89/courses_salad_chickensalad_Carol's_Chicken_Salad_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/89/courses_salad_chickensalad_Carol's_Chicken_Salad_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/89/courses_salad_chickensalad_Carol's_Chicken_Salad_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/89/courses_salad_chickensalad_Carol's_Chicken_Salad_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/89/courses_salad_chickensalad_Carol's_Chicken_Salad_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Fruited Curry Chicken Salad")) {
			// Action Bar Text
			setTitle("Fruited Curry Chicken Salad");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/90/courses_salad_chickensalad_Fruited%20Curry%20Chicken%20Salad_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/90/courses_salad_chickensalad_Fruited%20Curry%20Chicken%20Salad_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/90/courses_salad_chickensalad_Fruited%20Curry%20Chicken%20Salad_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/90/courses_salad_chickensalad_Fruited%20Curry%20Chicken%20Salad_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/90/courses_salad_chickensalad_Fruited%20Curry%20Chicken%20Salad_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/90/courses_salad_chickensalad_Fruited%20Curry%20Chicken%20Salad_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/90/courses_salad_chickensalad_Fruited%20Curry%20Chicken%20Salad_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/90/courses_salad_chickensalad_Fruited%20Curry%20Chicken%20Salad_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/90/courses_salad_chickensalad_Fruited%20Curry%20Chicken%20Salad_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/90/courses_salad_chickensalad_Fruited%20Curry%20Chicken%20Salad_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/90/courses_salad_chickensalad_Fruited%20Curry%20Chicken%20Salad_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/90/courses_salad_chickensalad_Fruited%20Curry%20Chicken%20Salad_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/90/courses_salad_chickensalad_Fruited%20Curry%20Chicken%20Salad_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/90/courses_salad_chickensalad_Fruited%20Curry%20Chicken%20Salad_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Chicken Fiesta Salad")) {
			// Action Bar Text
			setTitle("Chicken Fiesta Salad");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/91/courses_salad_chickensalad_Chicken_Fiesta_Salad_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/91/courses_salad_chickensalad_Chicken_Fiesta_Salad_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/91/courses_salad_chickensalad_Chicken_Fiesta_Salad_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/91/courses_salad_chickensalad_Chicken_Fiesta_Salad_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/91/courses_salad_chickensalad_Chicken_Fiesta_Salad_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/91/courses_salad_chickensalad_Chicken_Fiesta_Salad_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/91/courses_salad_chickensalad_Chicken_Fiesta_Salad_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/91/courses_salad_chickensalad_Chicken_Fiesta_Salad_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/91/courses_salad_chickensalad_Chicken_Fiesta_Salad_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/91/courses_salad_chickensalad_Chicken_Fiesta_Salad_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/91/courses_salad_chickensalad_Chicken_Fiesta_Salad_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/91/courses_salad_chickensalad_Chicken_Fiesta_Salad_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/91/courses_salad_chickensalad_Chicken_Fiesta_Salad_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/91/courses_salad_chickensalad_Chicken_Fiesta_Salad_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Asian Chicken Salad")) {
			// Action Bar Text
			setTitle("Asian Chicken Salad");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/92/courses_salad_chickensalad_Asian_Chicken_Salad_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/92/courses_salad_chickensalad_Asian_Chicken_Salad_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/92/courses_salad_chickensalad_Asian_Chicken_Salad_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/92/courses_salad_chickensalad_Asian_Chicken_Salad_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/92/courses_salad_chickensalad_Asian_Chicken_Salad_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/92/courses_salad_chickensalad_Asian_Chicken_Salad_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/92/courses_salad_chickensalad_Asian_Chicken_Salad_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/92/courses_salad_chickensalad_Asian_Chicken_Salad_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/92/courses_salad_chickensalad_Asian_Chicken_Salad_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/92/courses_salad_chickensalad_Asian_Chicken_Salad_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/92/courses_salad_chickensalad_Asian_Chicken_Salad_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/92/courses_salad_chickensalad_Asian_Chicken_Salad_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/92/courses_salad_chickensalad_Asian_Chicken_Salad_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/92/courses_salad_chickensalad_Asian_Chicken_Salad_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Basic Chicken Salad")) {
			// Action Bar Text
			setTitle("Basic Chicken Salad");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/93/courses_salad_chickensalad_Basic_Chicken_Salad_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/93/courses_salad_chickensalad_Basic_Chicken_Salad_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/93/courses_salad_chickensalad_Basic_Chicken_Salad_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/93/courses_salad_chickensalad_Basic_Chicken_Salad_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/93/courses_salad_chickensalad_Basic_Chicken_Salad_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/93/courses_salad_chickensalad_Basic_Chicken_Salad_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/93/courses_salad_chickensalad_Basic_Chicken_Salad_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/93/courses_salad_chickensalad_Basic_Chicken_Salad_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/93/courses_salad_chickensalad_Basic_Chicken_Salad_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/93/courses_salad_chickensalad_Basic_Chicken_Salad_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/93/courses_salad_chickensalad_Basic_Chicken_Salad_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/93/courses_salad_chickensalad_Basic_Chicken_Salad_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/93/courses_salad_chickensalad_Basic_Chicken_Salad_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/93/courses_salad_chickensalad_Basic_Chicken_Salad_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Mediterranean Quinoa Salad")) {
			// Action Bar Text
			setTitle("Mediterranean Quinoa Salad");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/94/courses_salad_chickensalad_Mediterranean_Quinoa_Salad_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/94/courses_salad_chickensalad_Mediterranean_Quinoa_Salad_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/94/courses_salad_chickensalad_Mediterranean_Quinoa_Salad_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/94/courses_salad_chickensalad_Mediterranean_Quinoa_Salad_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/94/courses_salad_chickensalad_Mediterranean_Quinoa_Salad_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/94/courses_salad_chickensalad_Mediterranean_Quinoa_Salad_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/94/courses_salad_chickensalad_Mediterranean_Quinoa_Salad_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/94/courses_salad_chickensalad_Mediterranean_Quinoa_Salad_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/94/courses_salad_chickensalad_Mediterranean_Quinoa_Salad_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/94/courses_salad_chickensalad_Mediterranean_Quinoa_Salad_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/94/courses_salad_chickensalad_Mediterranean_Quinoa_Salad_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/94/courses_salad_chickensalad_Mediterranean_Quinoa_Salad_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/94/courses_salad_chickensalad_Mediterranean_Quinoa_Salad_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/94/courses_salad_chickensalad_Mediterranean_Quinoa_Salad_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Chinese Chicken Salad")) {
			// Action Bar Text
			setTitle("Chinese Chicken Salad");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/95/courses_salad_chickensalad_Chinese_Chicken_Salad_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/95/courses_salad_chickensalad_Chinese_Chicken_Salad_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/95/courses_salad_chickensalad_Chinese_Chicken_Salad_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/95/courses_salad_chickensalad_Chinese_Chicken_Salad_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/95/courses_salad_chickensalad_Chinese_Chicken_Salad_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/95/courses_salad_chickensalad_Chinese_Chicken_Salad_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/95/courses_salad_chickensalad_Chinese_Chicken_Salad_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/95/courses_salad_chickensalad_Chinese_Chicken_Salad_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/95/courses_salad_chickensalad_Chinese_Chicken_Salad_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/95/courses_salad_chickensalad_Chinese_Chicken_Salad_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/95/courses_salad_chickensalad_Chinese_Chicken_Salad_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/95/courses_salad_chickensalad_Chinese_Chicken_Salad_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/95/courses_salad_chickensalad_Chinese_Chicken_Salad_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/95/courses_salad_chickensalad_Chinese_Chicken_Salad_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Cobb Salad")) {
			// Action Bar Text
			setTitle("Cobb Salad");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/96/courses_salad_chickensalad_Cobb_Salad_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/96/courses_salad_chickensalad_Cobb_Salad_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/96/courses_salad_chickensalad_Cobb_Salad_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/96/courses_salad_chickensalad_Cobb_Salad_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/96/courses_salad_chickensalad_Cobb_Salad_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/96/courses_salad_chickensalad_Cobb_Salad_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/96/courses_salad_chickensalad_Cobb_Salad_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/96/courses_salad_chickensalad_Cobb_Salad_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/96/courses_salad_chickensalad_Cobb_Salad_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/96/courses_salad_chickensalad_Cobb_Salad_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/96/courses_salad_chickensalad_Cobb_Salad_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/96/courses_salad_chickensalad_Cobb_Salad_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/96/courses_salad_chickensalad_Cobb_Salad_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/96/courses_salad_chickensalad_Cobb_Salad_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Parmesan and Basil Chicken Salad")) {
			// Action Bar Text
			setTitle("Parmesan and Basil Chicken Salad");
			// Image Code
			Firebase fImageDetailRecipe = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/97/courses_salad_chickensalad_Parmesan_and_Basil_Chicken_Salad_image");
			fImageDetailRecipe.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					String tempImage = (String) arg0.getValue();
					// Logo image for this page (will be same for all menus)
					UrlImageViewHelper.setUrlDrawable(imgDetailRecipe,
							tempImage);
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Image Detail
			Firebase fImageDetail = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/97/courses_salad_chickensalad_Parmesan_and_Basil_Chicken_Salad_image_detail");
			fImageDetail.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvImgDetail.setVisibility(View.GONE);
					} else {
						tvImgDetail.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Ingredients 6 Lists
			Firebase fIngredientsList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/97/courses_salad_chickensalad_Parmesan_and_Basil_Chicken_Salad_ingredients_list1");
			fIngredientsList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList1.setVisibility(View.GONE);
					} else {
						tvIngredientsList1.setText((CharSequence) arg0
								.getValue());
					}

				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			Firebase fIngredientsList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/97/courses_salad_chickensalad_Parmesan_and_Basil_Chicken_Salad_ingredients_list2");
			fIngredientsList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList2.setVisibility(View.GONE);
					} else {
						tvIngredientsList2.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/97/courses_salad_chickensalad_Parmesan_and_Basil_Chicken_Salad_ingredients_list3");
			fIngredientsList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList3.setVisibility(View.GONE);
					} else {
						tvIngredientsList3.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/97/courses_salad_chickensalad_Parmesan_and_Basil_Chicken_Salad_ingredients_list4");
			fIngredientsList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList4.setVisibility(View.GONE);
					} else {
						tvIngredientsList4.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/97/courses_salad_chickensalad_Parmesan_and_Basil_Chicken_Salad_ingredients_list5");
			fIngredientsList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList5.setVisibility(View.GONE);
					} else {
						tvIngredientsList5.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			Firebase fIngredientsList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/97/courses_salad_chickensalad_Parmesan_and_Basil_Chicken_Salad_ingredients_list6");
			fIngredientsList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvIngredientsList6.setVisibility(View.GONE);
					} else {
						tvIngredientsList6.setText((CharSequence) arg0
								.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
			// Direction lists
			final Firebase fDirectionList1 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/97/courses_salad_chickensalad_Parmesan_and_Basil_Chicken_Salad_directions_list1");
			fDirectionList1.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList1.setVisibility(View.GONE);
					} else {
						tvDirectionList1.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList2 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/97/courses_salad_chickensalad_Parmesan_and_Basil_Chicken_Salad_directions_list2");
			fDirectionList2.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList2.setVisibility(View.GONE);
					} else {
						tvDirectionList2.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList3 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/97/courses_salad_chickensalad_Parmesan_and_Basil_Chicken_Salad_directions_list3");
			fDirectionList3.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList3.setVisibility(View.GONE);
					} else {
						tvDirectionList3.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList4 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/97/courses_salad_chickensalad_Parmesan_and_Basil_Chicken_Salad_directions_list4");
			fDirectionList4.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList4.setVisibility(View.GONE);
					} else {
						tvDirectionList4.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList5 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/97/courses_salad_chickensalad_Parmesan_and_Basil_Chicken_Salad_directions_list5");
			fDirectionList5.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList5.setVisibility(View.GONE);
					} else {
						tvDirectionList5.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});

			final Firebase fDirectionList6 = new Firebase(
					"https://cookbook-teammatharu.firebaseio.com/97/courses_salad_chickensalad_Parmesan_and_Basil_Chicken_Salad_directions_list6");
			fDirectionList6.addValueEventListener(new ValueEventListener() {

				@Override
				public void onDataChange(DataSnapshot arg0) {
					// TODO Auto-generated method stub
					if (arg0.getValue().equals("")) {
						tvDirectionList6.setVisibility(View.GONE);
					} else {
						tvDirectionList6.setText((CharSequence) arg0.getValue());
					}
				}

				@Override
				public void onCancelled(FirebaseError arg0) {
					// TODO Auto-generated method stub

				}
			});
		} else if (item.equals("Amy's Barbecue Chicken Salad")) {

		} else if (item.equals("Feta Chicken Salad")) {

		} else if (item.equals("Asian Chicken Noodle Salad")) {

		} else if (item.equals("Mandarin Chicken Pasta Salad")) {

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_detail_recipe_page, menu);
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
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(MainDetailRecipePage.this,
				MainLandingPage.class);
		MainDetailRecipePage.this.startActivity(activityIntent);
		finish();
	}
}
