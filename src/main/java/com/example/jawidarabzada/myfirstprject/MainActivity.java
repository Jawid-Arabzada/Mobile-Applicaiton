package com.example.jawidarabzada.myfirstprject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String msg =MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"The on create() event");


    }
    public void onStart()
    {
        super.onStart();
        Log.d(msg,"The onStart() event");
    }
    public void onRestart()
    {
        super.onRestart();
        Log.d(msg,"The onReStart() event");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(msg, "The OnResume() event");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(msg,"The onpause() event");
    }
    public void onStop()
    {
        super.onStop();
        Log.d(msg,"The onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(msg,"The onDestroy() event");

    }

}
