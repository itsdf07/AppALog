package com.itsdf07.app.alog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.itsdf07.lib.alog.ALog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ALog.dTag("itsdf07","测试Log");
    }
}
