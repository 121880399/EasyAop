package org.zzy.easyaop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.zzy.aoplib.exception.annotation.AutoTryCatch;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void safe(View view){
        String str=null;
        str.indexOf("a");
    }


}
