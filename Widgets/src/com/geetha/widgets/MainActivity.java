package com.geetha.widgets;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity implements android.widget.RadioGroup.OnCheckedChangeListener{
	CheckBox checkboxopt1, checkboxopt2 ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		checkboxopt1 = (CheckBox)findViewById(R.id.checkBoxoption1);
		checkboxopt2 = (CheckBox)findViewById(R.id.checkBoxoption2);


		if(checkboxopt1.isChecked())
		{
			Log.d("[DEBUG]", "checked");
		}
		
		checkboxopt1.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean state) {

				if (state == true)
				{
					Log.d("[DEBUG]", "checkbox1 checked");
				}
				else
				{
					Log.d("[DEBUG]", "checkebox1 is unchecked");
				}

			}
			
		});
		
		
		



	}



}


