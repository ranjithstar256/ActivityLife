package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("sup123er","oncreate executed");
    }

    @Override
    protected void onStart() {
        super.onStart();Log.i("sup123er","onStart executed");
    }

    @Override
    protected void onPause() {
        super.onPause();Log.i("sup123er","onPause executed");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();Log.i("sup123er","onDestroy executed");
    }

    @Override
    protected void onStop() {Log.i("sup123er","onStop executed");
        super.onStop();
    }

    @Override
    protected void onRestart() {Log.i("sup123er","onRestart executed");
        super.onRestart();
    }

    @Override
    protected void onResume() {Log.i("sup123er","onResume executed");
        super.onResume();
    }
}