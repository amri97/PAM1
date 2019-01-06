package com.example.sandi.rekayasaperangkat;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sandi.rekayasaperangkat.R;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        ActionBar actionBar = getSupportActionBar();
        TextView mDetailTv = (TextView) findViewById(R.id.textView);

        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview
        mDetailTv.setText(mContent);

    }

    public class NewActivity1 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity1);

            ActionBar actionBar = getSupportActionBar();
            TextView mDetailTv = (TextView) findViewById(R.id.textView);

            //get data from previous activity when item of listview is clicked using intent
            Intent intent = getIntent();
            String mActionBarTitle = intent.getStringExtra("actionBarTitle");
            String mContent = intent.getStringExtra("contentTv");

            //set actionbar title
            actionBar.setTitle(mActionBarTitle);
            //set text in textview
            mDetailTv.setText(mContent);
        }
    }
}
