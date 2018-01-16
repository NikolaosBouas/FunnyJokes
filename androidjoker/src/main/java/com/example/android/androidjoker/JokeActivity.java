package com.example.android.androidjoker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private TextView mJokeTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intentThatStartedTheActivity = getIntent();
        if (intentThatStartedTheActivity != null) {
            if (intentThatStartedTheActivity.hasExtra(Intent.EXTRA_TEXT)) {
                String joke = intentThatStartedTheActivity.getStringExtra(Intent.EXTRA_TEXT);
                mJokeTv = (TextView) findViewById(R.id.joke_display_tv);
                mJokeTv.setText(joke);
            }
        }


    }
}
