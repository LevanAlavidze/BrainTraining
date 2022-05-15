package com.example.braintraining;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class FinalActivity extends Activity
{
    TextView tvTitle, tvResult, tvBestResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_layout);
        tvTitle = findViewById(R.id.tvTitle);
        tvResult = findViewById(R.id.tvResult);
        tvBestResult = findViewById(R.id.tvBestResult);
        Intent i = getIntent();
        String str = i.getStringExtra("shambala");
        tvResult.setText(str);

    }
    public void onClickFinish (View view)

    {
        Intent i = new Intent(FinalActivity.this,StartActivity.class);
        startActivity(i);
    }

}
