package com.rfletcher.wpdexpress;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener; 
import android.widget.BaseAdapter;
import android.widget.GridView; 
import android.widget.ImageView; 
import android.widget.TextView;

public class MainActivity extends Activity {

	Integer[] imageIDs = {
			R.drawable.plainpizza,
			R.drawable.buffchicken, 
			R.drawable.cheesesteak, 
			R.drawable.margarita, 
			R.drawable.sausagepizza, 
			R.drawable.supreme, 
			R.drawable.maccheese,
			R.drawable.veggiepizza,
			R.drawable.pepproniapizza
			};
	
	String basePizza = "none";
	static String mainPie = "none";
	TextView tv;
	public static double pizzaPrice = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
		
		GridView gridView = (GridView) findViewById(R.id.grid);
		gridView.setAdapter(new ImageAdapter(this));
		
		gridView.setOnItemClickListener(new OnItemClickListener() {
		
			TextView tv = (TextView)findViewById(R.id.textView2);
			
			public void onItemClick(AdapterView parent, View v, int position, long id)
		{				
				if (position == 0){
					pizzaPrice = 6.99;
					basePizza = "Plain pie, $ " + pizzaPrice;
					tv.setText(basePizza);
					mainPie = "Plain pie";
					
				}
				else if (position == 1){
					pizzaPrice = 7.99;
					basePizza = "Buffalo Chicken, $ " + pizzaPrice;
					tv.setText(basePizza);
					mainPie = "Buffalo Chicken pie";
				}
				else if (position == 2){
					pizzaPrice = 7.99;
					basePizza = "CheeseSteak pie, $ " + pizzaPrice;
					tv.setText(basePizza);
					mainPie = "Cheesesteak Pie";
				}
				else if (position == 3){
					pizzaPrice = 7.99;
					basePizza = "Margarita Pie, $ " + pizzaPrice;
					tv.setText(basePizza);
					mainPie = "Margarita Pie";
				}
				else if (position == 4){
					pizzaPrice = 7.99;
					basePizza = "Sausage Pie, $ " + pizzaPrice;
					tv.setText(basePizza);
					mainPie = "Sausage Pie";
				}
				else if (position == 5){
					pizzaPrice = 8.99;
					basePizza = "Supreme pie, $ " + pizzaPrice;
					tv.setText(basePizza);
					mainPie = "Supreme Pie";
				}
				else if (position == 6){
					pizzaPrice = 7.99;
					basePizza = "Mac n Cheese pie, $ " + pizzaPrice;
					tv.setText(basePizza);
					mainPie = "Mac n' Cheese Pie";
				}
				else if (position == 7){
					pizzaPrice = 7.99;
					basePizza = "Veggie Pie, $ " + pizzaPrice;
					tv.setText(basePizza);
					mainPie = "Veggie Pie";
				}
				else if (position == 8){
					pizzaPrice = 7.99;
					basePizza = "Pepperoni pie, $ " + pizzaPrice;
					tv.setText(basePizza);
					mainPie = "Pepperoni Pie";
				}
				
		}
		
		});
		
	
	}
	
	public void move2(View v)
	{
	         Intent myIntent = new Intent(MainActivity.this, ToppingActivity.class);
	        startActivityForResult(myIntent,0);
	 }
	
	public class ImageAdapter extends BaseAdapter {
	
			private Context context;
	
			public ImageAdapter(Context c) {
	
				context = c; 
				}
		
			public int getCount() { 
				return imageIDs.length;
			}
			public Object getItem(int position) { 
				return position;
			}
			public long getItemId(int position) { 
				return position;
			}
	

			public View getView(int position, View convertView, ViewGroup parent){
				
				ImageView imageView;
				if (convertView == null) {
				imageView = new ImageView(context); 
				imageView.setLayoutParams(new GridView.LayoutParams(145, 145)); 
				imageView.setScaleType(ImageView.ScaleType.CENTER_CROP); 
				imageView.setBackgroundColor(0x303030);
				imageView.setPadding(10,10,10,10);
				
				} else {
				imageView = (ImageView) convertView;
				} imageView.setImageResource(imageIDs[position]); return imageView;
			}
		
	}

}
