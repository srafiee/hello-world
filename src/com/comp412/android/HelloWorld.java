package com.comp412.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HelloWorld extends Activity {
    /** Called when the activity is first created. */
    private int mCount = 0;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        final Button countButton = (Button) findViewById(R.id.CountButton);         
        countButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                mCount++;
                countButton.setText("Count: " + mCount);
            }
        }); 
    }
}