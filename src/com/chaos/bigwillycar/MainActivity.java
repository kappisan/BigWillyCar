package com.chaos.bigwillycar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {

	Button buttonLogin;
	Button buttonQuit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Intent intent = getIntent();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		buttonLogin = (Button) findViewById(R.id.buttonLogin);
		buttonQuit = (Button) findViewById(R.id.buttonQuit);
		
		buttonLogin.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
				
				Toast.makeText(getApplicationContext(), "login sucessful", 
						   Toast.LENGTH_LONG).show();
				
			  Intent controlIntent = new Intent(MainActivity.this, ControlActivity.class);
			    startActivity(controlIntent);
			    
			}
 
		});
		
		buttonQuit.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View arg0) {
				
				finish();
			}
 
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

}
