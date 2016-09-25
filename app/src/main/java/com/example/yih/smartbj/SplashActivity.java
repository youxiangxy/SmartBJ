package com.example.yih.smartbj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.yih.smartbj.utils.SPTools;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
    }

    public void initView(){
        if (SPTools.getBool(this,Mycontast.ISFISRTRUN,false)){
            startActivity(new Intent(this,GuidActivity.class));
        }else{
            startActivity(new Intent(this,HomeActivity.class));
        }
    }
}
