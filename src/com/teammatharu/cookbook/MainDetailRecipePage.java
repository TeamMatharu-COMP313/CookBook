package com.teammatharu.cookbook;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
