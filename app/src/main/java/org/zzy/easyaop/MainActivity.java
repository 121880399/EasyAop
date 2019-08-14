package org.zzy.easyaop;

import android.Manifest;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import org.zzy.aoplib.async.annotation.Async;
import org.zzy.aoplib.delay.annotation.Delay;
import org.zzy.aoplib.permission.annotation.PermissionRequest;
import org.zzy.aoplib.schedule.annotation.Scheduler;

import java.util.concurrent.TimeUnit;


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

    @Async
    public void testAsync(View view){
        Log.d(TAG,"current thread:"+Thread.currentThread().getName());
    }

    @Delay(delay = 5000 , timeUnit = TimeUnit.MILLISECONDS)
    public void testDelay(View view){
        Log.d(TAG,"execution Task");
    }

    @Scheduler(initDelay = 0 ,interval = 3000 , count = 5,taskFinishCallback = "taskFinish")
    public void testSchedule(View view){
        Log.d(TAG,"Schedule task");
    }

   public void taskFinish(){
        Log.d(TAG,"Task was finished.");
   }

   @PermissionRequest(value ={Manifest.permission.CAMERA , Manifest.permission.WRITE_EXTERNAL_STORAGE})
   public void testPermission(View view){
        Log.d(TAG,"需要相机权限");
   }

}
