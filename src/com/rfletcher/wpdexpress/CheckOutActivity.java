package com.rfletcher.wpdexpress;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class CheckOutActivity extends Activity {

	EditText tf;
	EditText tf2;
	EditText tf3;
	Button sendMySmsBtn;
	double pizzaTotal = MainActivity.pizzaPrice - (MainActivity.pizzaPrice * .07);
	String basePie = MainActivity.mainPie;
	double exactChange = Math.round(pizzaTotal*100)/100.00;
 
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_confirm);
			overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
			sendMySmsBtn=(Button)findViewById(R.id.send);
			tf = (EditText)findViewById(R.id.editText2);
			tf2 = (EditText)findViewById(R.id.editText1); 
			tf3 = (EditText)findViewById(R.id.editText3);		
			
			 sendMySmsBtn.setOnClickListener(new OnClickListener(){
				 
				 public void onClick(View v) {
					 String name = tf2.getText().toString();
					 String phoneNo = tf.getText().toString();
					 String message = "Thank you for your order, "  + name + ". Your estimated wait time for your " + basePie + " is 15 minutes.";
		              confirmdialog();
					 if (phoneNo.length()==10 && message.length()>0){
		                    sendSMS(phoneNo, message);
		                }
		               
				 }		
			
			 });	

		}	
		 
		  private void sendSMS(String phoneNumber, String message)
		   {        
		    SmsManager sms = SmsManager.getDefault();
		    sms.sendTextMessage(phoneNumber, null, message, null, null);        
		   }
		  
		  private void confirmdialog() {
			  
			  	String name = tf2.getText().toString();
			  	String resHall = tf3.getText().toString();
			    AlertDialog.Builder alertDialog = new AlertDialog.Builder(CheckOutActivity.this);
			    alertDialog.setTitle("Order Summary");	   
			    alertDialog.setMessage("Name: " + name + "\nDelivery to: " + resHall + "\nPizza: " + basePie + "\nToppings:  \nTotal: $" + exactChange);

			    alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			        public void onClick(DialogInterface dialog,int which) {
			        	
			        }
			    });

			    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			        public void onClick(DialogInterface dialog, int which) {
		                         
			            dialog.cancel();
			        }
			    });
			    alertDialog.show();
			}  
		
}
