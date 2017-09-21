package com.example.listview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity
{
	ListView listview;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listview = (ListView) findViewById(R.id.listView1);
		String[] values = new String[] { "Android List View",
				"Adapter implementation", "Simple List View In Android",
				"Create List View Android", "Android Example",
				"List View Source Code", "List View Array Adapter",
				"Android Example List View" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, android.R.id.text1, values);
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(new OnItemClickListener() 
		{
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id)
			{

				// ListView Clicked item index
				int itemPosition = position;

				// ListView Clicked item value
				String itemValue = (String) listview
						.getItemAtPosition(position);

				// Show Alert
				Toast.makeText(
						getApplicationContext(),
						"Position :" + itemPosition + "  ListItem : "
								+ itemValue, Toast.LENGTH_LONG).show();

			}

		});
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
