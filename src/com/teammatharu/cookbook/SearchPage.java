package com.teammatharu.cookbook;

import java.util.ArrayList;
import java.util.Arrays;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

public class SearchPage extends ListActivity {
	private EditText et;
	private ListView lv;
	private final String[] listview_names = { "A Farewell to Basil Fettuccine",
			"Acorn Squash", "Addictive Sweet Potato Burritos",
			"Afghan Beef Raviolis (Mantwo)", "African Curry",
			"African Peanut Soup", "Agua de Jamaica", "Alabama Fire Crackers",
			"Alcohol-Free Mint Julep", "Alfredo Sauce",
			"All Day Macaroni and Cheese", "Alyson's Broccoli Salad",
			"Amazing Crab Shells", "Amazing Italian Lemon Butter Chicken",
			"Amazing Mussels", "Amazing Whole Wheat Pizza Crust",
			"Amish Macaroni Salad", "Amish Meatloaf", "Amish White Bread",
			"Amy's Barbecue Chicken Salad", "Amy's Cilantro Cream Sauce",
			"Amy's Cilantro Cream SauceReal Hummus", "Andrea's Pasta Fagioli",
			"Angel Chicken Pasta", "Antipasto Pasta Salad",
			"Antipasto Platter", "Antipasto Salad Platter",
			"Appetizer Mussels", "Apple Chips", "Apple Crisp",
			"Apple Crumble Pie", "Apple Goat Cheese Bruschetta", "Apple Julep",
			"Apple Pear Sauce", "Apple Pecan Corn Bread Dressing",
			"Apple Pie in a Jar Drink", "Apple Squares", "Apple Toast",
			"Applesauce for the Freezer", "Argentine Chimichurri Bread",
			"Armenian Shish Kabob", "Artichoke & Spinach Dip",
			"Artichoke Bruschetta", "Artichoke Spinach Lasagna",
			"Artichoke Stuffed Mushrooms", "Asiago Sun-Dried Tomato Pasta",
			"Asian Beef Skewers", "Asian Chicken Noodle Salad",
			"Asian Chicken Salad", "Asian Salad",
			"Asparagus Cashew Rice Pilaf",
			"Aussie Beef and Peppers with Gnocchi", "Aussie Chicken",
			"Authentic Louisiana Red Beans and Rice", "Avocado Egg Salad",
			"Avocado Feta Salsa", "Avocado Smoothie", "Avocado and Tuna Tapas",
			"Avocado, Tomato and Mango Salsa", "Awesome Baked Sea Scallops",
			"Awesome Bow Tie Pasta", "Awesome Pasta Salad",
			"BBQ Chicken Calzones", "BBQ Chicken Salad",
			"BBQ Glazed Homemade Meatballs", "BLT Dip", "BLT Pasta Salad",
			"BLT Salad", "Baby Back Ribs", "Bacon Cheddar Deviled Eggs",
			"Bacon Cheese Puffs", "Bacon Crackers",
			"Bacon Wrapped Barbeque Shrimp", "Bacon Wrapped Hamburgers",
			"Bacon Wrapped Pineapple", "Bacon and Tomato Cups",
			"Bacon-Balsamic Deviled Eggs", "Badische Schupfnudeln",
			"Baingan Bharta (Eggplant Curry)", "Bake Sale Lemon Bars",
			"Baked Buffalo Wings", "Baked Cheese Olives", "Baked Dijon Salmon",
			"Baked Eggplant Antipasto", "Baked Eggplant Parmesan",
			"Baked Flan", "Baked Homemade Macaroni and Cheese",
			"Baked Honey Mustard Chicken", "Baked Kale Chips",
			"Baked Lamb Chops", "Baked Macaroni and Cheese",
			"Baked Penne with Italian Sausage", "Baked Potato Soup",
			"Baked Scallops", "Baked Seafood Au Gratin",
			"Baked Teriyaki Chicken", "Baked Tilapia in Garlic and Olive Oil",
			"Baked Ziti", "Baked Ziti with Sausage", "Baklava",
			"Balsamic Bruschetta", "Balsamic Mushrooms",
			"Balsamic Roasted Pork Loin", "Balsamic Strawberries",
			"Balsamic-Glazed Salmon Fillets", "Banana Crepes", "Banana Juice",
			"Barbarella's German Pancakes", "Barbecue Ribs",
			"Barbequed Cabbage", "Barbequed Pineapple", "Barbequed Ribs",
			"Barbie's Tuna Salad", "Barley and Mushrooms with Beans",
			"Barlow's Blackened Catfish", "Basic Cheese Polenta",
			"Basic Chicken Salad", "Basic Crepes", "Basic Flaky Pie Crust",
			"Basic Pasta", "Basic Yankee Bread Stuffing", "Basil Shrimp",
			"Bayou Crostini", "Bean Burrito Casserole",
			"Becky's Chicken Salad", "Beef Samosas",
			"Beef and Bean Chimichangas", "Beer Batter Fish Made Great",
			"Beer Brats", "Beer Butt Chicken", "Beer Margaritas",
			"Bellyful of Barbecued Bananas", "Benne Wafers",
			"Bermuda Spinach Salad", "Berry Delicious", "Berry Shooters",
			"Best Black Beans", "Best Brownies", "Best Ever Jalapeno Poppers",
			"Best Spanish Rice", "Best Spinach Dip Ever", "Best Tuna Melt",
			"Betsy's Mandarin Orange Salad", "Big Soft Ginger Cookies",
			"Bill's Spicy Refrigerator Pickles", "Black Bean Salad",
			"Black Bean Vegetable", "Black Bean and Chickpea Chili",
			"Black Bean and Couscous Salad", "Black Bean and Salsa Soup",
			"Black Magic Cake", "Black and Tan", "Blackened Chicken",
			"Bloody Mary Mix", "Blue Bacon Stuffed Mushrooms",
			"Blue Cheese Burgers", "Blueberry Buckle",
			"Blueberry French Toast", "Blueberry Pie", "Blueberry Turnovers",
			"Boiled Bagels", "Boilermaker Tailgate Chili", "Boniet",
			"Boston Iced Tea", "Braised Balsamic Chicken",
			"Brazilian Black Bean Stew", "Bread Crust Zucchini Quiche",
			"Bread Machine Bagels", "Bread Machine Calzone",
			"Bread Machine Garlic Bread", "Bread Machine Pizza Dough",
			"Bread and Celery Stuffing", "Breakfast Banana Green Smoothie",
			"Breakfast Sausage", "Breakfast Zinger Juice",
			"Brie Cheese Appetizer", "Broccoli Cheese Soup",
			"Broccoli Chicken Roli", "Broccoli Crawfish Cheese Soup",
			"Broccoli Rice Casserole", "Broccoli and Tortellini Salad",
			"Broccoli with Garlic Butter and Cashews",
			"Broccoli-Cauliflower Salad", "Broiled Lobster Tails",
			"Broiled Scallops", "Broiled Tilapia Parmesan",
			"Brown Sugar Meatloaf", "Brown Sugar Smokies",
			"Brown Sugar and Honey Limeade", "Bubble Pizza",
			"Buffalo Chicken Chili", "Buffalo Chicken Dip",
			"Burgundy Pork Tenderloin", "Burrito Pie",
			"Buster Bar Ice Cream Dessert", "Butter Bean Burgers",
			"Butter Flaky Pie Crust", "Butter Noodles",
			"Butter Pecan Ice Cream", "Buttermilk Cornbread",
			"Buttermilk-Battered Calamari", "Butternut Mascarpone Gnocchi",
			"Butternut Squash Cajun Fries", "Butternut Squash Fries",
			"Butternut Squash Soup", "Buttery Cooked Carrots",
			"Cabbage and Dumplings", "Cafeteria Macaroni and Cheese",
			"Cajun Chicken Pasta", "Cajun Crawfish and Shrimp Etouffe",
			"Cajun Deviled Eggs", "Cajun Seafood Pasta", "Cajun Spice Mix",
			"Cake Balls", "Calabacitas", "Calamari", "Calamari Macaronatha",
			"Calamari Salad", "California Grilled Veggie Sandwich",
			"California Roll Salad", "Candied Carrots", "Candy Cane Cocoa",
			"Cannoli", "Cappuccino on Ice", "Caramel Apple Pork Chops",
			"Caramel Pecan Pie", "Caramelized French Toast",
			"Caribbean Chicken Salad", "Carol's Chicken Salad",
			"Carrot and Orange Juice", "Cauliflower Pizza Crust",
			"Chai Tea Mix", "Cheddar Bacon Hamburgers", "Cheddar Crackers",
			"Cheddar Pecan Wafers", "Cheddar Pennies",
			"Cheddar and Olive Balls", "Cheese Bread", "Cheese Crackers",
			"Cheese's Baked Macaroni and Cheese", "Cheeseburger Soup",
			"Cheesy Polenta", "Cheesy Polenta Casserole",
			"Cheesy Quinoa Pilaf with Spinach",
			"Chef John's Grilled Lamb Steaks",
			"Chef John's Turkey Sloppy Joes", "Cherry Fizz",
			"Cherry Pepper Poppers", "Chicago-Style Pan Pizza",
			"Chicken Berry Salad", "Chicken Biryani", "Chicken Breasts Pierre",
			"Chicken Fiesta Salad", "Chicken Flautas",
			"Chicken Florentine Casserole", "Chicken Fried Chicken",
			"Chicken Garlic Pizza", "Chicken In Sour Cream",
			"Chicken Jalfrezi", "Chicken Marsala", "Chicken Milano",
			"Chicken Noodle Soup", "Chicken Pesto Pizza", "Chicken Satay",
			"Chicken Souvlaki Gyro Style", "Chicken Tikka Masala",
			"Chicken Tortilla Soup", "Chicken Wing Dip", "Chicken Wings",
			"Chicken and Bow Tie Pasta", "Chicken and Broccoli Braid",
			"Chicken and Gnocchi Soup", "Chickpea Curry",
			"Chile Garlic BBQ Salmon", "Chili Potato Burritos",
			"Chinese Chicken Salad", "Chinese Chicken Salad",
			"Chinese Chicken Salad III",
			"Chinese Noodle Pancakes with Asparagus",
			"Chinese Peppered Green Beans", "Chinese Sweet Bun Dough",
			"Chinese-Style Steamed Fish", "Chipotle Crusted Pork Tenderloin",
			"Chocolate Babka", "Chocolate Banana Smoothie",
			"Chocolate Chip Cheese Ball", "Chocolate Cornstarch Pudding",
			"Chocolate Eclair Dessert", "Chocolate Hazelnut Fruit Crepes",
			"Chocolate Trifle", "Chocolate Velvet Ice Cream",
			"Chuck's Favorite Mac and Cheese", "Chunky Monkey Pancakes",
			"Churros", "Cindy's Pumpkin Pie", "Cinnamon Ice Cream",
			"Cinnamon Rolls", "Cinnamon Snack Mix",
			"Cinnamon-Curry Tuna Salad", "Cioppino", "Classic Macaroni Salad",
			"Classic Macaroni and Cheese", "Cobb Salad", "Cochinita Pibil",
			"Cocoa Coffee Milkshake", "Cocoa Sleigh Ride", "Coconut Ice Cream",
			"Coconut Lime Rice", "Coffee Shake", "Coffee Whirl",
			"Coffeebar Chai", "Cola Pork Chops", "Cold Crawfish Dip",
			"Cold Tuna Macaroni Salad", "Colleen's Slow Cooker Jambalaya",
			"Cool Fizzies for the Kiddies", "Cordon Bleu Chicken",
			"Corn Chip Salad", "Corn Dogs", "Cornbread Pancakes",
			"Cornbread Sausage Stuffing", "Cornbread Stuffing With Sausage",
			"Country Sausage Gravy", "Crab Ceviche", "Crab Dip", "Crab Salad",
			"Crab and Lobster Stuffed Mushrooms", "Crab-Stuffed Mushrooms",
			"Crabmeat Salad", "Crackers a la Yvette", "Cran-Dandy Cooler",
			"Cranberry Apple Sauce", "Cranberry Martini",
			"Cranberry Meatballs", "Cranberry Pistachio Biscotti",
			"Cranberry Sauce", "Cranberry Wassail",
			"Cranberry and Cilantro Quinoa Salad", "Crawfish Chowder",
			"Crawfish Cornbread", "Crawfish Linguine", "Crawfish Pie",
			"Crawfish and Corn Soup", "Crayfish or Shrimp Pasta",
			"Cream Cheese Frosting", "Cream Cheese Jalapeno Hamburgers",
			"Cream Cheese Penguins", "Cream Puffs",
			"Creamy Au Gratin Potatoes", "Creamy Blueberry Pie",
			"Creamy Chicken Gnocchi Soup", "Creamy Chocolate Frosting",
			"Creamy Deviled Eggs", "Creamy Dill Cucumber Toasties",
			"Creamy Hot Cocoa", "Creamy Macaroni and Cheese",
			"Creamy Pesto Shrimp", "Creamy Rice Pudding",
			"Creamy Strawberry Crepes", "Creme Brulee",
			"Creme Brulee French Toast", "Creole Okra", "Crispy Fried Chicken",
			"Crispy Vegetable Pakoras", "Crunchy Egg Salad",
			"Crunchy Eggplant Parmesan", "Crustless Cranberry Pie",
			"Cuban Beef Stew", "Cubanos Frijoles", "Cucumber Cooler",
			"Cucumber Punch", "Cucumber and Ham Antipasto",
			"Cucumber and Olive Appetizers", "Cucumber-Watermelon Salad",
			"Cucumbers And Egg Salad", "Curried Chicken and Rice Salad",
			"Curried Coconut Chicken", "Curried Potato Salad",
			"Curried Quinoa", "Curried Quinoa Salad with Mango",
			"Curried Salmon Pasta Salad", "Curried Tofu Salad",
			"Curry Chicken Salad", "Curry Coleslaw", "Curry Pasta Salad",
			"Cury Chicken Salad", "Dale's Lamb", "Danish Kringle",
			"Deb's Bread and Butter Pickles", "Deb's Scallops Florentine",
			"Decadent Peanut Butter Pie", "Deer Chop Hurry", "Deer Jerky",
			"Deer Poppers", "Delectable Marinated Chicken",
			"Delicious Black Bean Burritos", "Delicious Ham and Potato Soup",
			"Delicious Spicy Micheladas", "Delicious Vegan Hot Chocolate",
			"Dessert Crepes", "Di's Delicious Deluxe Deviled Eggs",
			"Dinah's Stuffed Mushrooms", "Dirty Martini",
			"Dorsey's Fried Oysters", "Double Layer Pumpkin Cheesecake",
			"Double Tomato Bruschetta", "Down Home Chitterlings",
			"Drunken Mussels", "Dumpling Soup", "Easter Meat Pie",
			"Easy Apple Cider", "Easy Apple Coleslaw", "Easy Apple Strudel",
			"Easy Arugula Salad", "Easy Batter Fruit Cobbler",
			"Easy Egg Salad", "Easy French Dip Sandwiches",
			"Easy Frozen Margaritas", "Easy Guacamole",
			"Easy Herb Roasted Turkey", "Easy Homemade Pizza Dough",
			"Easy Ice Cream Cake", "Easy Iced Coffee", "Easy Lemon Cookies",
			"Easy Meatloaf", "Easy Mexican Hot Chocolate",
			"Easy Shrimp Lo Mein", "Easy Slow Cooker Meatballs",
			"Easy Sugar Cookies", "Easy and Elegant Pork Tenderloin",
			"Egg Salad Sandwiches", "Egg Salad with a Kick",
			"Egg-White Crepes", "Eggless Pasta", "Eggnog Latte",
			"Eggplant Antipasto", "Eggplant Mixed Grill",
			"Eggplant Parmesan Casserole", "Eggplant Parmesan Casserole",
			"Eileen's Meatloaf", "Elegant Oyster Soup", "Elk Chili",
			"Enchilada Sauce", "Enchiladas Suizas", "Extreme Chocolate Cake",
			"Fabulous Fruit Salad", "Fabulous Wet Burritos",
			"Fall Apple Pumpkin Shandy", "Famous Pork Chops",
			"Fereni Starch Pudding", "Feta Cheese Foldovers",
			"Feta Chicken Salad", "Fiery Pork Skewers",
			"Fig and Olive Tapenade", "Figs Oozing with Goat Cheese",
			"Firecracker Crackers", "Fish Tacos", "Five Minute Ice Cream",
			"Florentine Artichoke Dip", "Fluffy French Toast",
			"Fluffy Pancakes", "Fluffy Peanut Butter Frosting",
			"Four Cheese Margherita Pizza", "Fra Diavolo Sauce With Pasta",
			"Freezer Caramel Drizzle Pie", "French Baguettes", "French Crepes",
			"French Dip Sandwiches", "French Onion Soup Gratinee",
			"French Pastry Pie Crust", "Fresh Broccoli Salad",
			"Fresh Mint and Cilantro Melon Salad", "Fresh Pasta",
			"Fresh Rhubarb Pie", "Fresh Sardines Naples Style",
			"Fresh Semolina and Egg Pasta", "Fresh, Homemade Apple Juice",
			"Fried Butterflied Shrimp", "Fried Ice Cream",
			"Fried Rice Restaurant Style", "Frog Eye Salad", "Frosted Grapes",
			"Frozen Caramel Latte", "Frozen Mojito",
			"Fruited Curry Chicken Salad", "Fruited Tofu Curry Salad",
			"Fruity Curried Lentil Salad", "Fruity Curry Chicken Salad",
			"Garam Masala Spice Blend", "Garden Pasta Salad",
			"Garden Veggie Pizza Squares", "Garlic Alfredo Tilapia",
			"Garlic Bread Fantastique", "Garlic Cheddar Chicken",
			"Garlic Chicken Fried Chicken", "Garlic Green Beans",
			"Garlic Lover's Pizza Crust", "Garlic Parmesan Olives",
			"Garlic Prime Rib", "Gary's Stuffed Mushrooms",
			"Georgia Egg Salad", "German Apple Cake", "German Apple Pancake",
			"German Spaetzle Dumplings", "Ginger Glazed Mahi Mahi",
			"Ginger Orange Glazed Chicken Wings", "Ginger Veggie Stir-Fry",
			"Gloomy Day Smoothie", "Gnocchi Bake", "Gnocchi in Fontina Sauce",
			"Gourmet Chicken Pizza", "Gourmet Mushroom Risotto",
			"Grammy's Calamari Salad", "Grandma Ople's Apple Pie",
			"Grandma's Lemon Meringue Pie", "Granny Kat's Pumpkin Roll",
			"Granny Smackers", "Greek Feta And Olive Spread",
			"Greek Squid (Soupies)", "Green Banana Fries", "Green Bean Fries",
			"Green Lemonade", "Green Slime Smoothie",
			"Green Tea Berry Delight", "Grenadian Spice Cake",
			"Grilled Asian Chicken", "Grilled Bacon Jalapeno Wraps",
			"Grilled Brown Sugar Pork Chops", "Grilled Cheese Sandwich",
			"Grilled Chicken Taco Salad", "Grilled Corn Salad",
			"Grilled Corn on the Cob", "Grilled Fruit Kabobs",
			"Grilled Garlic Artichokes", "Grilled Lamb Burgers",
			"Grilled Lemon Herb Pork Chops", "Grilled Marinated Shrimp",
			"Grilled Mussels with Curry Butter", "Grilled Papper Steak Salad",
			"Grilled Peaches", "Grilled Pineapple Butterscotch Sundaes",
			"Grilled Pineapple Slices", "Grilled Portobello Mushrooms",
			"Grilled Rock Lobster Tails", "Grilled Salmon",
			"Grilled Shrimp Scampi", "Grilled Vegetable Salad",
			"Grilled Wonton Chicken Salad", "Grilled Yellow Squash",
			"Grilled Zucchini", "Groovie Smoothie", "Guacamole",
			"Guacamole Deviled Eggs", "Gunline Coffee", "Gyroll",
			"Gyros Burgers", "Half and Half Cocktail", "Halloween Eye of Newt",
			"Ham and Cheese Bowties", "Hamantashen", "Harira",
			"Hasty Chocolate Pudding", "Hazel's Meatballs",
			"Healing Cabbage Soup", "Healthy Banana Cookies",
			"Healthy Garden Salad", "Healthy Green Juice",
			"Heavenly Blueberry Smoothie", "Herb Oyster Crackers",
			"Herb Roasted Pork", "Herbed Dumplings", "Herbed Lamb Chops",
			"Hobo Pie", "Holiday Chicken Salad", "Holiday Dressing",
			"Home Style Macaroni and Cheese", "Homemade Apple Cider",
			"Homemade Bagels", "Homemade Black Bean Veggie Burgers",
			"Homemade Four Cheese Ravioli", "Homemade Mac and Cheese",
			"Homemade Manti (Traditional Turkish Dumplings)",
			"Homemade Noodles", "Homemade Vanilla Pudding",
			"Homemade Wonderful Bread", "Homestyle Hot Cocoa", "Honey Duck",
			"Honey Glazed Ham", "Honey Lemon Tea", "Honey Ribs",
			"Honey Walnut Shrimp", "Hot Apple Cider",
			"Hot Buttered Apple Cider", "Hot Crab Dip", "Hot Cranberry Tea",
			"Hot Mocha Drink Mix", "Hot Spiced Cider",
			"Hot Spiced Cranberry Cider", "House Fried Rice",
			"Hungarian Mushroom Soup", "Iced Mocha Fusion Shake",
			"Iced Pumpkin Cookies", "Incredibly Cheesy Turkey Meatloaf",
			"Indian Butter Chicken", "Indian Curried Barley Pilaf",
			"Irish Coffee", "Irish Lamb Stew", "Italian Bread",
			"Italian Breaded Pork Chops", "Italian Confetti Pasta Salad",
			"Italian Cream Soda", "Italian Meatballs", "Italian Sausage Soup",
			"Italian Sausage Soup with Tortellini",
			"Italian Sausage Soup with tortellini",
			"Italian Sausage Tortellini Soup",
			"Italian Sausage, Peppers, and Onions", "Italian Seasoning",
			"Italian Spaghetti Sauce with Meatballs", "Italian Tuna Spread",
			"Jalapeno Popper Cups", "Jalapeno Popper Mushrooms",
			"Jalapeno Popper Spread", "Jalapeno Popper Wontons",
			"Jamie's Cranberry Spinach Salad", "Jamie's Minestrone",
			"Japanese-Style Sesame Green Beans", "Jay's Jerk Chicken",
			"Jay's Signature Pizza Crust", "Jeanie's Falafel",
			"Jenny's Sweet Waldorf Salad", "Jewish Chopped Liver",
			"Jimmy's Mexican Pizza", "JoeDogg's Spicy Red Beer",
			"Judy's Strawberry Pretzel Salad", "Kale and Banana Smoothie",
			"Karyn's Cream of Crab Soup", "Kentucky Biscuits",
			"Key West Chicken", "Key West Penne", "Kickin' Collard Greens",
			"Kielbasa and Cabbage", "Killer Artichokes",
			"Kim's Ultimate Meatloaf", "King Crab Appetizers",
			"Kiwi Strawberry Smoothie", "Kocoa Klastch Blend", "Kofta Kebabs",
			"Kolachky", "Kugel", "Kung Pao Chicken", "Lamb Tagine",
			"Lance's French Onion Soup", "Land of Nod Cinnamon Buns",
			"Lava Lamps", "Lavender Lemon Bars", "Leftover Turkey Casserole",
			"Lemon Garlic Tilapia", "Lemon Pepper Grilled Chicken",
			"Lemon and Thyme Lamb Chops", "Lemonade-Mint Iced Tea",
			"Lentil Soup", "Lentil and Sausage Soup",
			"Light Avocado Egg Salad", "Lime Cola", "Lime Pepper",
			"Loaded Egg Salad", "Lobster Bisque", "Lobster Colorado",
			"Lobster Mornay Sauce", "Lobster Rolls",
			"Lobster Tails Steamed in Beer", "London Broil",
			"Lori's Famous Crab Cakes", "Louisiana Crawfish Etouffee",
			"Love Mussels", "Magical Egg Salad", "Mahogany Chicken Wings",
			"Malibu Bay Breeze", "Mandarin Chicken Pasta Salad",
			"Manicotti Alla Romana", "Maple Roast Turkey", "Maple Salmon",
			"Marie's Easy Slow Cooker Pot Roast", "Marinated Baked Pork Chops",
			"Marinated Flank Steak", "Marinated Grilled Shrimp",
			"Marinated Pork Tenderloin", "Marinated Scallops Wrapped in Bacon",
			"Masala Chai", "Matthew's Bearnaise Sauce", "Mayan Hot Chocolate",
			"Mayonnaise Biscuits", "Meat and Veggie Stromboli",
			"Meatball Nirvana", "Mediterranean Quinoa Salad",
			"Messy Taco Salad", "Mexican Casserole", "Mexican Shrimp Cocktail",
			"Michelada", "Michell Jenny's Challah", "Michigan Fizz",
			"Microwave Bread and Butter Pickles", "Mini Meatloaves",
			"Mint Tea Punch", "Mocha Coffee", "Mocha Coffee Mix",
			"Mocha au Lait Mix", "Mock Champagne",
			"Moist Lemon Poppy Seed Cake", "Mojito", "Mojito Fruit Salad",
			"Mongolian Beef", "Monica's Baptist Sangria",
			"Mouse's Macaroni and Cheese", "Mrinated Veggies", "Mulled Cider",
			"Mulled Cranberry Cider", "Mulligatawny Soup", "Munn Cookies",
			"Mushroom Cheeseburger Calzones", "Mushroom Pork Chops",
			"Mushroom Rice", "Mussels Mariniere",
			"Mussels in Curry Cream Sauce", "Mustard Pickles", "Naan",
			"No Bake Peanut Butter Pie", "No Cook Applesauce",
			"No-Frying Eggplant Parmesan", "North Carolina-Style Pulled Pork",
			"Nova Scotia Beer Warmer",
			"Oatmeal and Wheat Flour Blueberry Pancakes",
			"Oklahoma Cheese Grits", "Okra Fry", "Okra, Corn and Tomatoes",
			"Old Fashioned Onion Rings", "Old Virginia Wassail Cider",
			"Old-Fashioned Pancakes", "Olive Balls", "Olive Cheese Melts",
			"Olive Pecan Spread", "Olive and Blue Cheese Ball", "Onion Rice",
			"Orange Fizz", "Orange Pecan French Toast", "Orange Smoothie",
			"Oriental Cold Noodle Salad",
			"Oven Baked Garlic and Parmesan Fries", "Oven Fries",
			"Oven Pot Roast", "Oven-Baked Caramel French Toast",
			"Oyster Dressing", "Oyster Stew", "Oyster and Cornbread Dressing",
			"Oyster and Spinach Chowder", "Pakistani Spicy Chickpeas",
			"Panna Cotta", "Parmesan Garlic Bread",
			"Parmesan and Basil Chicken Salad", "Parrothead Salad",
			"Party Pinwheels", "Pat's Baked Beans", "Pat's Dumplings",
			"Peach Ice Cream", "Peach Pie", "Peach Tea",
			"Peanut Butter Cup Cookies", "Peanut Butter and Banana Smoothie",
			"Peanut Buttercup Hot Chocolate", "Pear Vinaigrette",
			"Peking Duck", "Peking Pork Chops", "Peppered Shrimp Alfredo",
			"Pepperoni Bread", "Pepperoni Polenta Pizza",
			"Pepperoni Stromboli", "Perfect Deviled Eggs",
			"Perfect Pumpkin Pie", "Perfect Summer Fruit Salad",
			"Perfect Turkey", "Pesto Pasta with Chicken",
			"Pesto Polenta Lasagna", "Picante Chicken Rice Burritos",
			"Pineapple Stuffing", "Pizza Without the Red Sauce",
			"Polenta and Vegetable Casserole", "Pollo Fajitas",
			"Pompous Mexican", "Pork Chops with Raspberry Sauce",
			"Portobello Mushroom Burgers", "Potato Salad Deviled Eggs",
			"Prosciutto Wrapped Melon Balls", "Pumpernickel Bagels",
			"Pumpkin Fluff Dip", "Pumpkin Pancakes", "Pumpkin Pie Spice",
			"Pumpkin Ravioli", "Pumpkin Spiced Latte", "Pumpkin Turkey Chili",
			"Purple Monstrosity Fruit Smoothie", "Qabali - Afghani Rice",
			"Quick Brownbag Burritos", "Quick Eggplant Parmesan",
			"Quick Gnocchi", "Quick Spinach-Ricotta Calzones",
			"Quick Taco Salad", "Quick and Easy Alfredo Sauce",
			"Quick and Easy Pancit", "Quinoa Black Bean Burgers",
			"Quinoa Side Dish", "Quinoa and Black Beans", "Quinoa with Peas",
			"RaSpBeRrY FiZzLeR", "Rainbow Veggie Chili", "Ranch Burgers",
			"Ranch Oyster Crackers", "Ranch Style Oyster Crackers",
			"Ratatouille", "Real Hummus", "Real Italian Calzones",
			"Red Skinned Potato Salad", "Red Velvet Cupcakes",
			"Refried Beans Without the Refry", "Refrigerator Pickles",
			"Rempel Family Meatloaf", "Renaissance Stuffed Mushrooms",
			"Rhubarb Strawberry Crunch", "Rice Crust for Pizza",
			"Roast Leg of Lamb with Rosemary", "Roasted Brussels Sprouts",
			"Roasted Duck", "Roasted Garlic Bread",
			"Roasted Garlic Cauliflower", "Roasted Okra",
			"Roasted Rack of Lamb", "Roasted Vegetables",
			"Rockin' Oysters Rockefeller", "Rocky Road Ice Cream",
			"Rosemary Braised Lamb Shanks", "Rosemary Roasted Turkey",
			"Rossi's Sausage Gnocchi", "Rugelach", "Russian Black Bread",
			"Russian Tea", "Sage Pork Chops", "Salad Nicoise",
			"Salisbury Steak", "Salmon Salad", "Salsa Chicken",
			"Salt and Pepper Squid", "Sam's Famous Carrot Cake",
			"San Francisco Style Bagels", "Sancocho",
			"Sandy's Greek Pasta Salad", "Santiago's Stuffed Squid",
			"Sarah's Applesauce", "Sarah's Rice Pilaf",
			"Satiny Chocolate Glaze", "Sausage Applesauce Appetizer",
			"Sausage Stuffed Jalapenos",
			"Sausage, Spinach and Ricotta Calzone", "Savory Crab Stuffed",
			"Savory Crab Stuffed Mushrooms", "Savory Garlic Marinated Steaks",
			"Scallop Scampi", "Scalloped Oysters", "Scallops Provencale",
			"Seafood And Cabbage Salad", "Seafood Chowder",
			"Seafood Fettuccine", "Seafood Pasta Salad",
			"Sean's Falafel and Cucumber Sauce", "Seared Sea Scallops",
			"Seasoned Crackers", "Seasoned Oyster Crackers",
			"Seasoned Turkey Burgers", "Sebrian Cevapcici",
			"Sesame Green Beans", "Sesame Pasta Chicken Salad",
			"Seven Layer Mixes Up Salad", "Seven Layer Taco Dip",
			"Shabbat Challah", "Shandy", "Shirley Temple",
			"Shrimp Couscous Salad", "Shrimp Egg Salad",
			"Shrimp Lemon Pepper Linguini", "Shrimp Scampi Bake",
			"Shrimp and Crab Enchiladas", "Shrimp and Dill Deviled Eggs",
			"Shrimp and Grits Louisiana Style", "Shrimp and Octopus Soup",
			"Shrimpcargot", "Shrimply Delicious Shrimp Salad",
			"Simple BBQ Ribs", "Simple Country Ribs", "Simple Deviled Eggs",
			"Simple Grilled Lamb Chops", "Simple Turkey Chili",
			"Simple Whole Wheat Bread", "Slammin' Salmon",
			"Slow Cooker Buffalo Chicken Sandwiches",
			"Slow Cooker Chicken Mole", "Slow Cooker Chicken Taco Soup",
			"Slow Cooker Chicken and Dumplings", "Slow Cooker Cranberry Pork",
			"Slow Cooker Creamed Corn", "Slow Cooker Mongolian Beef",
			"Slow Cooker Pizza", "Slow Cooker Stuffing",
			"Slow Cooker Tamale Pie", "Slow Cooker Venison Roast",
			"Slow-Cooker Barbecue Ribs", "Slow-Cooker Chicken Tortilla Soup",
			"Slow-Cooker Pepper Steak", "Smoked Oyster Spread",
			"Smoked Salmon Ravioli", "Smoked Salmon and Egg Salad",
			"Smokey Grilled Pork Chops", "Smooth Sweet Tea",
			"Smothered Green Beans", "Snow Flake Cocoa", "Sofrito",
			"Soft Oatmeal Cookies", "Soft Polenta with Spicy Tomato Sauce",
			"Sopapilla Cheesecake Dessert", "Sophie's Kolacky",
			"Sour Cream Pork Chops", "Southern Fried Chicken",
			"Southwestern Egg Rolls", "Southwestern Pasta Salad",
			"Southwestern Roasted Corn Salad", "Souvlaki", "Spanish Flan",
			"Spanish Moroccan Fish", "Spanish-Style Quinoa",
			"Special Buttercream Frosting", "Special Deviled Eggs",
			"Spiced Hot Chocolate", "Spiced Quinoa",
			"Spiced Slow Cooker Applesauce", "Spiced Tea Mix",
			"Spicy African Yam Soup", "Spicy Baked Sweet Potato Fries",
			"Spicy Bean Salsa", "Spicy Chicken Breast",
			"Spicy Chipotle Turkey Burgers", "Spicy Crispy Beef",
			"Spicy Deviled Eggs", "Spicy Lamb Patties",
			"Spicy Maryland Crab Dip", "Spicy Mexican Salad",
			"Spicy Refrigerator Dill Pickles", "Spicy Shredded Beef",
			"Spiked Fall Cider", "Spinach Brownies", "Spinach Pasta Salad",
			"Spinach Quiche", "Spinach and Feta Turkey Burgers",
			"Spinach and Strawberry Salad",
			"Spinach, Feta, and Pine Nut Ravioli Filling",
			"Spooky Calzone Snake", "Spring Strawberry Spinach Salad",
			"Steak Salad", "Steak Tip Marinade", "Steamed Lobster Tails",
			"Strawberry Avocado Salad", "Strawberry Beer Margaritas",
			"Strawberry Bruschetta", "Strawberry Crepes",
			"Strawberry Goat Cheese Bruschetta", "Strawberry Mojito",
			"Strawberry Pineapple Chicken Bites", "Strawberry Soda Syrup",
			"Strawberry Whipped Sensation", "Strawberry and Feta Salad",
			"Strawberry, Kiwi, and Spinach Salad", "Stromboli",
			"Stuffed Eggplant Parmesan", "Stuffed Eggplant Parmesan Rolls",
			"Stuffed Olives", "Stuffed Peppers My Way", "Sue's Taco Salad",
			"Sugar Cookie Frosting", "Sugar Free Rugelach",
			"Sugar-Free Spiced Applesauce", "Sukhothai Pad Thai",
			"Suki's Spinach and Feta Pasta", "Summer Corn Salad",
			"Sun-Dried Tomato Basil Orzo", "Super-Delicious Zuppa Toscana",
			"Sweet Corn Tomalito", "Sweet Cornbread Cake",
			"Sweet Dinner Rolls", "Sweet Green Bean Bundles",
			"Sweet Lime Iced Tea", "Sweet Potato Gnocchi",
			"Sweet Potato and Black Bean Chili", "Sweet and Spicy Green Beans",
			"Sweet and Tart Strawberry Salad", "Sylvia's Ribs",
			"Szechwan Shrimp", "T's Sweet Potato Fries", "Taco Seasoning",
			"Tainted Fruit Shots", "Tangy Egg Salad Spread",
			"Tangy Honey Glazed Ham", "Tangy Poppy Seed Fruit Salad",
			"Tangy Slow Cooker Pork Roast", "Tanning Bed Drink",
			"Tantalizingly Tangy Meatloaf", "Tasty Tuna Burgers",
			"Teena's Spicy Pesto Chicken and Pasta", "Tex Mex Black Bean Dip",
			"Tex-Mex Turkey Soup", "Texas Enchilada Sauce", "Texas Pork Ribs",
			"Thai Cucumber Salad", "Thai Noodle Salad",
			"Thai Peanut Noodle Stir-Fry", "Thai Steamed Mussels",
			"The Best Banana Pudding", "The Best Chicken Fried Steak",
			"The Best Lemon Bars", "The Best Rolled Sugar Cookies",
			"The Red-Headed Step Child", "Tiramisu Layer Cake",
			"Toasted Garlic Bread", "Todd's Famous Blueberry Pancakes",
			"Tofu Parmigiana", "Tomato Basil Egg Salad Sandwiches",
			"Tornado Twist", "Tortellini Bites", "Tortellini Salad",
			"Tortellini, Steak, and Caesar", "Traditional Gyro Meat",
			"Trinidad Stewed Chicken", "Triple Threat Fruit Smoothie",
			"Tropical Carrot-Apple Juice", "Tropical Sweet Potato Fries",
			"Truck-Stop Buttermilk Pancakes", "Tuna Dumplings",
			"Tuna Fish Salad", "Tuna Fish Salad ", "Tuna Macaroni Salad",
			"Tuna Noodle Casserole from Scratch", "Tuna Salad With Fresh Dill",
			"Turkey 'n Stuffing Bake", "Turkey Burgers", "Turkey Dumplings",
			"Turkey Enchiladas", "Turkey Taco Salad",
			"Turkey and Quinoa Meatloaf", "Udon Peanut Butter Noodles",
			"Ultimate French Toast", "Unbelievable Chicken",
			"Unbelievable Spinach Calzones", "Uncooked Banana Pudding",
			"Vanilla Crepes", "Vegan Arepas Made with Polenta",
			"Vegan Bean Taco Filling", "Vegan Crepes", "Vegan Cupcakes",
			"Vegetable Fried Rice", "Vegetable Quesadillas",
			"Vegetarian Burrito Casserole", "Vegetarian Korma", "Veggie Pizza",
			"Venison Bacon Burgers", "Venison Chili",
			"Very Chocolate Ice Cream", "Very Easy Fruit Salad",
			"Vietnamese Iced Coffee", "Vietnamese Rice-Noodle Salad",
			"Virgin Pina Colada", "Waikiki Meatballs",
			"Warm Crab Parmesan Dip", "Watermelon Agua Fresca",
			"Watermelon Summer Salad", "Wheat Crackers",
			"Whipped Hot Chocolate", "Whiskey Slush", "White Russian",
			"Whole Wheat Blueberry Pancakes",
			"Whole Wheat and Honey Pizza Dough", "Willis Farm Applesauce",
			"Wisconsin Bratwurst", "Wonderful Chicken Curry Salad",
			"Wonton Soup", "World's Best Lasagna", "Yogurt Egg Salad",
			"Yummy Honey Chicken Kabobs", "Yummy Margaritas",
			"Yummy Sweet Potato Casserole", "Zesty Tuna Salad",
			"Zucchini Brownies", "Zucchini Cheese Garlic Appetizer",
			"Zucchini Herb Casserole", "Zucchini Patties",
			"Zucchini with Chickpea and Mushroom Stuffing", "Zuppa Toscana" };

	private ArrayList<String> array_sort;
	int textlength = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_page);

		Firebase.setAndroidContext(this);

		et = (EditText) findViewById(R.id.EditText01);
		lv = (ListView) findViewById(android.R.id.list);

		// Setting Focus
		et.requestFocus();

		array_sort = new ArrayList<String>(Arrays.asList(listview_names));
		setListAdapter(new bsAdapter(this));

		et.addTextChangedListener(new TextWatcher() {
			@Override
			public void afterTextChanged(Editable s) {
				// Abstract Method of TextWatcher Interface.
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// Abstract Method of TextWatcher Interface.
			}

			@SuppressLint("DefaultLocale")
			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				textlength = et.getText().length();
				array_sort.clear();
				for (int i = 0; i < listview_names.length; i++) {
					if (textlength <= listview_names[i].length()) {

						/***
						 * If you want to highlight the countries which start
						 * with entered letters then choose this block. And
						 * comment the below If condition Block
						 */
						/*
						 * if(et.getText().toString().equalsIgnoreCase( (String)
						 * listview_names[i].subSequence(0, textlength))) {
						 * array_sort.add(listview_names[i]);
						 * image_sort.add(listview_images[i]); }
						 */

						/***
						 * If you choose the below block then it will act like a
						 * Like operator in the Mysql
						 */

						if (listview_names[i].toLowerCase().contains(
								et.getText().toString().toLowerCase().trim())) {
							array_sort.add(listview_names[i]);
						}
					}
				}
				AppendList(array_sort);
			}
		});

		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					final int position, long arg3) {

				String baseurl = "https://cookbookmatharunew.firebaseio.com/";

				Firebase ref = new Firebase(baseurl + array_sort.get(position));
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
							Intent activityIntent = new Intent(SearchPage.this,
									MainDetailRecipePage.class);
							activityIntent.putExtra("imageURL", tempImage);
							activityIntent.putExtra("item",
									array_sort.get(position));
							activityIntent.putExtra("backButton", "backSearch");
							startActivity(activityIntent);
							finish();
						}
					}

					@Override
					public void onCancelled(FirebaseError arg0) {
						// TODO Auto-generated method stub

					}
				});

			}
		});
	}

	public void AppendList(ArrayList<String> str) {
		setListAdapter(new bsAdapter(this));
	}

	public class bsAdapter extends BaseAdapter {
		Activity cntx;

		public bsAdapter(Activity context) {
			// TODO Auto-generated constructor stub
			this.cntx = context;

		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return array_sort.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return array_sort.get(position);
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return array_sort.size();
		}

		@SuppressLint({ "ViewHolder", "InflateParams" })
		@Override
		public View getView(final int position, View convertView,
				ViewGroup parent) {
			View row = null;

			LayoutInflater inflater = cntx.getLayoutInflater();
			row = inflater.inflate(R.layout.search_list_item, null);

			TextView tv = (TextView) row.findViewById(R.id.title);

			tv.setText(array_sort.get(position));

			return row;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.content, menu);
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
		if (id == R.id.action_contactus) {
			Intent i = new Intent(SearchPage.this, ContactUs.class);
			startActivity(i);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent activityIntent = new Intent(SearchPage.this,
				MainLandingPage.class);
		SearchPage.this.startActivity(activityIntent);
		finish();
	}
}
