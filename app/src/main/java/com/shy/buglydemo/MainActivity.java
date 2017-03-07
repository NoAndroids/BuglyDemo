package com.shy.buglydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * 简单实现 腾讯BUGLY的集成   包括异常上报 和 热修复
     *  热修复没有测试加固  根据文档  需要tinker—support 在1.7.5以下   同时 不同的加固软件 会对结果有不同的影响
     *
     *  ｛阿里百川的hotfix 支持加固后修复（官方文档）但是功能单一 只能用于修复bug  而且有很大的限制｝
     */
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.tv);
        tv.setText("....");
    }
}
