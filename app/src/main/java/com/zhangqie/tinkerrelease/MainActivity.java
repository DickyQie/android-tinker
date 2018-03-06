package com.zhangqie.tinkerrelease;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


/***
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        //未修复钱
        //Toast.makeText(this, "补丁未修复", Toast.LENGTH_SHORT).show();
        //修复后
        Toast.makeText(this, "补丁已修复", Toast.LENGTH_SHORT).show();
    }
}
