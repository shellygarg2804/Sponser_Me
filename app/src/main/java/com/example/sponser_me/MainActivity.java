package com.example.sponser_me;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
ImageView iview1,iview2,iview3,iview4,iview5;
Button button1,button2;
RelativeLayout layout1,layout2,layout3;
TextView tview1,tview2,tview3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iview1 = (ImageView) findViewById(R.id.logo);
        iview2 = (ImageView) findViewById(R.id.login_logo);
        iview3 = (ImageView) findViewById(R.id.u_logo);
        iview4 = (ImageView) findViewById(R.id.s_logo);

        button1 = (Button) findViewById(R.id.login_button);
       button2 = (Button) findViewById(R.id.help_button);

       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this,"OPENING THE SAME",Toast.LENGTH_LONG).show();
               Intent intent = new Intent(MainActivity.this,Login.class);
               startActivity(intent);
           }
       });

       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this,"OPENING THE SAME",Toast.LENGTH_LONG).show();
               Intent intent = new Intent(MainActivity.this,Help.class);
               startActivity(intent);
           }
       });

       //layouts
        layout1 = (RelativeLayout) findViewById(R.id.bar);
        layout2 = (RelativeLayout) findViewById(R.id.layout_2);
        layout3 = (RelativeLayout) findViewById(R.id.layout_3);

        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"opening the same",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,User.class);
            startActivity(intent);
            }
        });
    layout3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,Caterer.class);
            startActivity(intent);

        }
    });
    }}

