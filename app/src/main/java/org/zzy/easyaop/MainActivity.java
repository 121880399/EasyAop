package org.zzy.easyaop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void safe(View view){
        String str=null;
        str.indexOf("a");
    }

    public void onViewClick(View view){
        Log.d(TAG,"onClick--->");
    }


}
