package com.example.labo03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labo03.utils.AppConstant;

public class Main2Activity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent mIntent = getIntent();
        mTextView = findViewById(R.id.tv_mes);
        if(mIntent!=null){
            mTextView.setText(mIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}
