package com.example.simplefirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivityTAG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int y = 5 / 0;
        Log.d(TAG, "onCreate: Hello World");

    }

    //public void doMagic(View view) {
      //  int y = 50 / 5;
       // Thread thread = new Thread();
        //Thread thread = new Thread(Runnable());


          //      Log.d(TAG, "run: Run Thread " + " " + y + " " + thread.toString());

        /*Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
            }
        };
        Thread thread = new Thread(myRunnable);
        thread.start();
        Log.d(TAG, "run: Run Thread " + thread.toString());
    }*/

        //TextView textView = (TextView) findViewById(R.id.mTxt);
        //textView.setText("Pow");
    //}
}