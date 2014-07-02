package com.powerblock.timesheets;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class TimeFragment extends Fragment {
	public TimeFragment(){
		
	}
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		setHasOptionsMenu(true);
		return inflater.inflate(R.layout.time_layout, container,false);	
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
		inflater.inflate(R.menu.save_menu, menu);
		super.onCreateOptionsMenu(menu, inflater);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		if(item.getItemId() == R.id.action_save){
			
			return true;
		}
		return false;
	}
}