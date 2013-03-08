package com.shazam.cocktails;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myList = (ListView) findViewById(R.id.my_list);
        String [] myArray = {"Gin & Tonic", "20th Century", "Martini", "Vodka Martini", "Rum & Coke", "Rye & Ginger", "Scotch on the Rocks", "Cosmopolitan", "Whisky Sour","Amaretto Sour","Wine","12"};
                
        ArrayAdapter <String> myAdapter = new ArrayAdapter <String> (this, R.layout.myview, R.id.my_view, myArray);
        myList.setAdapter(myAdapter);
        
        myList.setOnItemClickListener(anyName);
       
    }

    OnItemClickListener anyName = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			//Toast.makeText(arg1.getContext(), "any thing I want " + arg2, Toast.LENGTH_LONG).show();
//			myNewWindow("any thing I want " + arg2);
			String [] myRecipe = {"1 1/2 oz Gin and tonic", "2 parts Gin, 1 part sweet vermouth, 1 part lime juice, 1 part lillet, add to shaker with ice and shake.", "2 oz Gin and a spash of Vermouth, pour over ice and shake", "2 oz. Vodka and a spash of Vermouth, pour over ice and shake","5","6","7","8","9","10","11","12"};

			myNewWindow(myRecipe[arg2]);
		}
	};
    
	public void myNewWindow(String message){
		
		Intent intent = new Intent(this, SecondWindow.class);
//		EditText editText = (EditText) findViewById(R.id.edit_message);
//		String message = editText.getText().toString();
		intent.putExtra("myMassage", message);
	    startActivity(intent);
	    
	}
	
}
