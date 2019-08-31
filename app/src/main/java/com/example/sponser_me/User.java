package com.example.sponser_me;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.icu.text.UnicodeSetSpanner;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class User extends Activity implements AdapterView.OnItemSelectedListener {
Spinner spinner2,spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        spinner2 = (Spinner) findViewById(R.id.food_preference);
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.food_preferences, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        final String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_LONG).show();

        if (text.equals("Veg")){
            Toast.makeText(User.this,"VEG SELECTED",Toast.LENGTH_LONG).show();
        }if(text.equals("Non Veg")){
            Toast.makeText(User.this,"NON VEG SELECTED",Toast.LENGTH_LONG).show();
        }if (text.equals("Both")){
            Toast.makeText(User.this,"BOTH SELECTED",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
Toast.makeText(User.this,"nothing selected",Toast.LENGTH_LONG).show();
    }
}
