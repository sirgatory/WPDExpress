package com.rfletcher.wpdexpress;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;

public class ToppingActivity extends Activity {

	protected int numToppings = 0;
	protected final double toppingPrice = 0.25;
	public double totalTopPrice = 0.00;
	public static String[] toppings = {
		
	};
	CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10;
	OnClickListener checkBoxListener;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_topping);
		overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
		cb1 = (CheckBox) findViewById(R.id.checkBox1);
		cb2 = (CheckBox) findViewById(R.id.checkBox2);
		cb3 = (CheckBox) findViewById(R.id.checkBox3);
		cb4 = (CheckBox) findViewById(R.id.checkBox4);
		cb6 = (CheckBox) findViewById(R.id.checkBox6);
		cb7 = (CheckBox) findViewById(R.id.checkBox7);
		cb8 = (CheckBox) findViewById(R.id.checkBox8);
		cb9 = (CheckBox) findViewById(R.id.checkBox9);
		cb10 = (CheckBox) findViewById(R.id.checkBox10);
		
		checkBoxListener = new OnClickListener() {
			 
			 @Override
			 public void onClick(View v) {
			 
			 
			 if(cb1.isChecked())
			 {
			 totalTopPrice = totalTopPrice + toppingPrice;
			 toppings[0] = "Pepperoni";
			Toast.makeText(getBaseContext(), "Toppingtotal: "+ totalTopPrice, Toast.LENGTH_SHORT).show();
			 }
			 if(cb1.isChecked())
			 {
				 totalTopPrice = totalTopPrice + toppingPrice;
				 toppings[1] = "Bacon";
				 //Toast.makeText(getBaseContext(), "Toppingtotal: "+ totalTopPrice, Toast.LENGTH_SHORT).show();
			 }
			 if(cb3.isChecked())
			 {
				 totalTopPrice = totalTopPrice + toppingPrice;
				 toppings[2] = "Mushrooms";
				 Toast.makeText(getBaseContext(), "Toppingtotal: "+ totalTopPrice, Toast.LENGTH_SHORT).show();
			 }
			 if(cb4.isChecked())
			 {
				 totalTopPrice = totalTopPrice + toppingPrice;
				 toppings[3] = "Pineapple";
				 Toast.makeText(getBaseContext(), "Toppingtotal: "+ totalTopPrice, Toast.LENGTH_SHORT).show();
			 }
			 if(cb5.isChecked())
			 {
				 totalTopPrice = totalTopPrice + toppingPrice;
				 toppings[4] = "Hot Peppers";
				 Toast.makeText(getBaseContext(), "Toppingtotal: "+ totalTopPrice, Toast.LENGTH_SHORT).show();
			 }
			 if(cb6.isChecked())
			 {
				 totalTopPrice = totalTopPrice + toppingPrice;
				 toppings[5] = "Olives";
				 Toast.makeText(getBaseContext(), "Toppingtotal: "+ totalTopPrice, Toast.LENGTH_SHORT).show();
			 }
			 if(cb7.isChecked())
			 {
				 totalTopPrice = totalTopPrice + toppingPrice;
				 toppings[6] = "Anchovies";
				 Toast.makeText(getBaseContext(), "Toppingtotal: "+ totalTopPrice, Toast.LENGTH_SHORT).show();
			 }
			 if(cb8.isChecked())
			 {
				 totalTopPrice = totalTopPrice + toppingPrice;
				 toppings[7] = "Chicken";
				 Toast.makeText(getBaseContext(), "Toppingtotal: "+ totalTopPrice, Toast.LENGTH_SHORT).show();
			 }
			 if(cb9.isChecked())
			 {
				 totalTopPrice = totalTopPrice + toppingPrice;
				 toppings[8] = "Chopped Steak";
				 Toast.makeText(getBaseContext(), "Toppingtotal: "+ totalTopPrice, Toast.LENGTH_SHORT).show();
			 }
			 if(cb10.isChecked())
			 {
				 totalTopPrice = totalTopPrice + toppingPrice;
				 toppings[9] = "Onions";
				 Toast.makeText(getBaseContext(), "Toppingtotal: "+ totalTopPrice, Toast.LENGTH_SHORT).show();
			 }		 
			 
			 }
		};	
		
	}
	
	
	public void move3(View v)
	{
	         Intent myIntent = new Intent(ToppingActivity.this, CheckOutActivity.class);
	        startActivityForResult(myIntent,0);
	 }
}
