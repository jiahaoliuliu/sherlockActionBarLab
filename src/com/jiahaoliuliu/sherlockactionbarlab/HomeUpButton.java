package com.jiahaoliuliu.sherlockactionbarlab;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.app.SherlockFragmentActivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HomeUpButton extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_up_button);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}
}
