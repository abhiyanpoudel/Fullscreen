package com.example.getme.fullscreen;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface mytype = Typeface.createFromAsset(getAssets(), "Ginga.ttf");
        TextView mytext = (TextView)findViewById(R.id.textview1);
        mytext.setTypeface(mytype);
        TextView myText = (TextView)findViewById(R.id.password);
        myText.setTypeface(mytype);

    }
}
