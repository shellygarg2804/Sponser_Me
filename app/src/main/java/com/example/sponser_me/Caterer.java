package com.example.sponser_me;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Caterer extends Activity {
    Button button1,button2,button3;
    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caterer);

        button1 = (Button) findViewById(R.id.phoneverify);
        button2 = (Button) findViewById(R.id.emailverify);
        editText1= (EditText) findViewById(R.id.aadhaar);
        editText2= (EditText) findViewById(R.id.name);
        editText3= (EditText) findViewById(R.id.address);
        editText4= (EditText) findViewById(R.id.pincode);
        editText5= (EditText) findViewById(R.id.city);
        editText6= (EditText) findViewById(R.id.country);
        editText7= (EditText) findViewById(R.id.phoneno);
        editText8 = (EditText) findViewById(R.id.email);
        textView = (TextView) findViewById(R.id.personal_details);
button3 = (Button) findViewById(R.id.save_button);
button3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(Caterer.this,"Saving to DB",Toast.LENGTH_LONG).show();

    }
});


    }
}
