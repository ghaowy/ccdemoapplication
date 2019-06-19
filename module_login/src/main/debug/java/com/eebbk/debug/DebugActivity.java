package com.eebbk.debug;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.eebbk.module_login.LoginActivity;
import com.eebbk.module_login.R;


public class DebugActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnClick;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);
        initView();
        initListener();
    }

    private void initListener() {
        mBtnClick.setOnClickListener(this);
    }

    private void initView() {
        mBtnClick = findViewById(R.id.btn_click);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_click) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }
}
