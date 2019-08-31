package com.example.sponser_me;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends Activity {
EditText editText1,editText2;
ImageView imageView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    editText1 = (EditText) findViewById(R.id.username);
    editText2 = (EditText) findViewById(R.id.password);
    imageView = (ImageView) findViewById(R.id.logo2);
    button = (Button) findViewById(R.id.sumbit_details);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(Login.this,"Sumbitting",Toast.LENGTH_LONG).show();
        }
    });

    }
}
