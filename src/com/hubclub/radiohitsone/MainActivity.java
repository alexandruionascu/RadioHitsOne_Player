package com.hubclub.radiohitsone;

import android.support.v7.app.ActionBarActivity;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 WebView webview = new WebView(this);
		 WebSettings settings = webview.getSettings();
		 settings.setJavaScriptEnabled(true);
		 webview.loadUrl("file:///android_asset/index.html");
		 if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH){
		        settings.setAllowContentAccess(true);
		        settings.setAllowFileAccess(true);
		        
		        //setAllowUniversalAccessFromFileURLs(true);
		        //settings.setAllowFileAccessFromFileURLs(true);
		    }
		 setContentView(webview);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		requestWindowFeature(Window.FEATURE_NO_TITLE); this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
}
