package com.eebbk.module_login.callback;

import android.content.Context;
import android.content.Intent;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCResult;
import com.billy.cc.core.component.IComponent;
import com.eebbk.module_login.LoginActivity;

public class LoginComponent implements IComponent {
    @Override
    public String getName() {
        return "LoginComponent";
    }

    @Override
    public boolean onCall(CC cc) {
        String actionName = cc.getActionName();
        switch (actionName) {
            case "showActivity":
                Context context = cc.getContext();
                Intent intent = new Intent(context, LoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
                CCResult ccResult = new CCResult();
                ccResult.addData("hello" , "true");
                ccResult.setSuccess(true);
                CC.sendCCResult(cc.getCallId() ,ccResult);
                break;
            default:
                CC.sendCCResult(cc.getCallId(), CCResult.errorUnsupportedActionName());
                break;
        }
        return false;
    }
}
