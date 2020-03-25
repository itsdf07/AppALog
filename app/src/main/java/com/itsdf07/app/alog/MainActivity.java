package com.itsdf07.app.alog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.itsdf07.lib.alog.ALog;
import com.itsdf07.lib.alog.ALogLevel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ALog.init()
                .setLogLevel(ALogLevel.FULL) //是否打印log
                .setTag("itsdf07") //自定义tag
                .setDefineALogFilePath("xxx/xxx/xxx.log") //自定义log存储路径
                .setLog2Local(true) //设置是否本地存储log记录
                .setShowThreadInfo(false)//是否显示线程信息
                .setMethodCount(2); //显示函数栈中的方法数
        setContentView(R.layout.activity_main);
ALog.d("这是第 %s 次 Log 输出", 6);
ALog.dTag("aso", "这是第 %s 次 Log 输出", 7);
    }
}
