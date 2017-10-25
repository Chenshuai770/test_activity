package com.cs.test_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvMian1;
    private Button mBtnMain1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTvMian1 = (TextView) findViewById(R.id.tv_mian1);
        mBtnMain1 = (Button) findViewById(R.id.btn_main1);

        mBtnMain1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_main1:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivityForResult(intent,2);

                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==2&&resultCode==2) {
            String data1 = data.getStringExtra("data");
            mTvMian1.setText(data1);

        }
    }
}
