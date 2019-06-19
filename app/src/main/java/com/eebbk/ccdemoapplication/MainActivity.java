package com.eebbk.ccdemoapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCResult;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initListener() {
        mBtnLogin.setOnClickListener(this);
    }

    private void initView() {
        mBtnLogin = findViewById(R.id.tv_login);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_login) {
            dealLogin();
        }
    }

    private void dealLogin() {
        CCResult call = CC.obtainBuilder("LoginComponent")
                .setActionName("showActivity")
                .build()
                .call();
        String hello = call.getDataItem("hello");
        if (call.isSuccess()) {
            Toast.makeText(this, "打开界面成功" + hello, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "打开界面失败" + hello, Toast.LENGTH_SHORT).show();
        }
    }
}
